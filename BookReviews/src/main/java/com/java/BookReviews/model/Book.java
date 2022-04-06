/* 
 * Name: Yi-Wen Chu    991624614
 * Assignment: Assignment 4 
 * Program: Computer Systems Technology -
 * 	Software Development and Network Engineering
 * File: Book.java
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

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String authors;

	public Book() {
		
	}
	
	public Book(Integer id, String title, String authors) {
		super();
		this.id = id;
		this.title = title;
		this.authors = authors;
	}

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}
	
	
}
