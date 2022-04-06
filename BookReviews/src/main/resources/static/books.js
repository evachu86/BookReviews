/**
 * ajax books list
 * index
 */

function getBook(id) {
	
	fetch("http://localhost:8080/BookReviews/books/" + id)
		.then( data => data.json() )
		.then( function(data) {
			showBookDtl(id, data);
		});
}

function showBookDtl(id, book) { 
	var bookDtl = 
		"<br/>Title: " + book.title +
		"<br/>Authours: " + book.authors +
		"<br/> <ul id='reviewList'></ul>";
	
	document.getElementById("bookDtl").innerHTML= bookDtl ;
	
	// check review list.
	getReviews(id);
}

function getReviews(bookId) {

	fetch("http://localhost:8080/BookReviews/" +
			"books/" +bookId+ "/getReviews")
		.then( data => data.json() )
		.then(function(data) {
			renderReviews(data);
		});
		
}

function renderReviews(reviews) {
	var reviewList = "";	
	
	reviews.forEach(function(review) {
		reviewList += "<li>" + review.content + "</li>";
	});
	
	document.getElementById("reviewList").innerHTML= reviewList ;
}