package com.bookapp.client;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		IBookService bookService = new BookServiceImpl();
		System.out.println(bookService.getAll());
		System.out.println(bookService.getByAuthorContains("john"));
		System.out.println(bookService.getByAuthorContainsAndCategory("john", "tech"));
	}

}
