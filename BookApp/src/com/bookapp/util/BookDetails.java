package com.bookapp.util;

import java.util.*;

import com.bookapp.model.Book;

public class BookDetails {
	
	public static List<Book> showBooks(){
		
				Book book1 = new Book("java in action", "john david", "Tech", 1, 900 );
				Book book2= new Book("5 am club", "Robin Sharma", "selfhelp", 2,300.68);
				Book book3 = new Book("HTML for Dummies", "Ben John" , "Tech", 3 , 1900.45);
				Book book4 = new Book("Secret Seven", "Edin Ben", "Fiction", 4 , 700.08);
				Book book5 = new Book("Seven Habits", "john Choper", "self help",5,800);
		List<Book> list = new ArrayList<>();
		list.add(book1);
		list.add(book2);
		list.add(book3);
		list.add(book4);
		list.add(book5);
		return list;
	}
}
