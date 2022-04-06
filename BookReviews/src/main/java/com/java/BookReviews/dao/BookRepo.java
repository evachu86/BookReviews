/* 
 * Name: Yi-Wen Chu    991624614
 * Assignment: Assignment 4 
 * Program: Computer Systems Technology -
 * 	Software Development and Network Engineering
 * File: BookRepo.java
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

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.java.BookReviews.model.Book;

/**
 * The Interface BookRepo.
 *
 * @author Yi-Wen Chu
 * Computer Systems Technology
 * Software Development and Network Engineering
 */
@RepositoryRestResource(path = "books")
public interface BookRepo extends CrudRepository<Book, Integer>{

}
