/* 
 * Name: Yi-Wen Chu    991624614
 * Assignment: Assignment 4 
 * Program: Computer Systems Technology -
 * 	Software Development and Network Engineering
 * File: BookReviewController.java
 * Other Files in this Project:
 * 	BookRepo.java
 * 	ReviewRepo.java
 * 	Book.java
 * 	Review.java 
 * 
 * Main class: BookReviewsApplication.java
 * 
 * Date: Dec 13, 2021
 * 
 * Description: Ajax & JPA practiece.
 */
package com.java.BookReviews.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.BookReviews.dao.BookRepo;
import com.java.BookReviews.dao.ReviewRepo;
import com.java.BookReviews.model.Book;
import com.java.BookReviews.model.Review;

/**
 * The Class BookReviewController.
 *
 * @author Yi-Wen Chu
 * Computer Systems Technology
 * Software Development and Network Engineering
 */
@Controller
public class BookReviewController {

	/** The book repo. */
	@Autowired 
	BookRepo bookRepo;
	
	/** The review repo. */
	@Autowired
	ReviewRepo reviewRepo;
	
	/**
	 * Index.
	 *
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping("/")
	public String index(Model model) {
		
		model.addAttribute("books", bookRepo.findAll());
		return "index";
	}
	
	/**
	 * Adds the book.
	 *
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/addBook")
	public String addBook(Model model) {
		
		model.addAttribute("book", new Book());
		return "addBook";
	}
	
	/**
	 * Adds the review.
	 *
	 * @param model the model
	 * @param bookId the book id
	 * @return the string
	 */
	@GetMapping("/books/{bookId}/addReview")
	public String addReview(Model model, @PathVariable("bookId") int bookId) {
		
		// Read book data from DB.
		Optional<Book> book = bookRepo.findById(bookId);
		model.addAttribute("book", book.get());
		
		model.addAttribute("review", new Review());
		return "addReview";
	}
	
	/**
	 * Gets the reviews.
	 *
	 * @param model the model
	 * @param bookId the book id
	 * @return the reviews
	 */
	@GetMapping("/books/{bookId}/getReviews")
	@ResponseBody
	public List<Review> getReviews(Model model, @PathVariable("bookId") int bookId) {
		
		List<Review> reviews = reviewRepo.findByBookId(bookId);
		return reviews;
	}
	
	/**
	 * Save book.
	 *
	 * @param book the book
	 * @return the string
	 */
	@PostMapping("/saveBook")
	public String saveBook(@ModelAttribute Book book) {
		
		bookRepo.save(book);
		return "redirect:/";
	}
	
	/**
	 * Save review.
	 *
	 * @param review the review
	 * @return the string
	 */
	@PostMapping("/saveReview")
	public String saveReview(@ModelAttribute Review review) {
		
		reviewRepo.save(review);
		return "redirect:/";
	}
	
	/**
	 * Cancel.
	 *
	 * @return the string
	 */
	@RequestMapping(value={"/saveBook", "/saveReview"}, params={"actBtn=Cancel"})
	public String cancel() {

		return "redirect:/";
	}
}
