/* 
 * Name: Yi-Wen Chu    991624614
 * Assignment: Assignment 4 
 * Program: Computer Systems Technology -
 * 	Software Development and Network Engineering
 * File: ReviewRepo.java
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
package com.java.BookReviews.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.java.BookReviews.model.Review;

/**
 * The Interface ReviewRepo.
 *
 * @author Yi-Wen Chu
 * Computer Systems Technology
 * Software Development and Network Engineering
 */
@RepositoryRestResource(path = "reviews")
public interface ReviewRepo extends CrudRepository<Review, Integer>{
	
	/**
	 * Find by book id.
	 *
	 * @param bookId the book id
	 * @return the list
	 */
	List<Review> findByBookId(@Param("bookId") Integer bookId);
}
