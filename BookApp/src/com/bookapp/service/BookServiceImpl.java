package com.bookapp.service;

import java.util.ArrayList;
import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService {

	

	@Override
	public List<Book> getAll() {
		BookDetails bookDetails = new BookDetails();
		return bookDetails.showBooks();
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		BookDetails bookDetails = new BookDetails();
		List<Book> bookList = bookDetails.showBooks();
		List<Book> list = new ArrayList<>();
		for(Book book:bookList) {
			if(book.getAuthor().contains(author)) {
				list.add(book);
			}
		}
		return list;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		BookDetails bookDetails = new BookDetails();
		List<Book> bookList = bookDetails.showBooks();
		List<Book> list = new ArrayList<>();
		for(Book book:bookList) {
			if(book.getCategory().equals(category)) {
				list.add(book);
			}
		}
		return list;

	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		BookDetails bookDetails = new BookDetails();
		List<Book> bookList = bookDetails.showBooks();
		List<Book> list = new ArrayList<>();
		for(Book book:bookList) {
			if(book.getPrice()<(price)) {
				list.add(book);
			}
		}
		return list;
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		BookDetails bookDetails = new BookDetails();
		List<Book> bookList = bookDetails.showBooks();
		List<Book> list = new ArrayList<>();
		for(Book book:bookList) {
			if(book.getCategory().equals(category) && book.getAuthor().contains(author)) {
				list.add(book);
			}
		}
		return list;
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		BookDetails bookDetails = new BookDetails();
		List<Book> bookList = bookDetails.showBooks();
		for(Book book:bookList) {
			if(book.getBookId()==bookId) {
				return book;
			}
		}
		return null;
	}
	
}
