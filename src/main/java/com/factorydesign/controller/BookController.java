package com.factorydesign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.factorydesign.service.BookFactory;
import com.factorydesign.serviceImpl.Book;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	BookFactory factory;

	@GetMapping("/{bookType}")
	public String getBookObject(@PathVariable("bookType") String bookType) {

		Book bookObject = factory.getBookObject(bookType);
		return bookObject.getBook();
	}
}
