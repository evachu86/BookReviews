/* 
 * Name: Yi-Wen Chu    991624614
 * Assignment: Assignment 4 
 * Program: Computer Systems Technology -
 * 	Software Development and Network Engineering
 * File: Review.java
 * Other Files in this Project:
 * 	BookReviewController.java
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
package com.java.BookReviews.model;

import javax.persistence.*;

/**
 * The Class Review.
 *
 * @author Yi-Wen Chu
 * Computer Systems Technology
 * Software Development and Network Engineering
 */
@Entity
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer bookId;
	private String content;

	/**
	 * Instantiates a new review object.
	 */
	public Review() {
		
	}
	
	/**
	 * Instantiates a new review object.
	 *
	 * @param id the id
	 * @param bookId the book id
	 * @param content the content
	 */
	public Review(Integer id, Integer bookId, String content) {
		super();
		this.id = id;
		this.bookId = bookId;
		this.content = content;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Gets the book id.
	 *
	 * @return the book id
	 */
	public Integer getBookId() {
		return bookId;
	}

	/**
	 * Sets the book id.
	 *
	 * @param bookId the new book id
	 */
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	/**
	 * Gets the content.
	 *
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Sets the content.
	 *
	 * @param content the new content
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
