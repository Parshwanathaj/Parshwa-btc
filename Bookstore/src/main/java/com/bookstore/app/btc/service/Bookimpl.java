package com.bookstore.app.btc.service;

import java.util.List;

import com.bookstore.app.btc.model.Book;

public interface Bookimpl {
	public List<Book> getBook();

	public Book getBook(long Bookid);

	public Book addBook(Book book);

	public boolean deleteBook(long Bookid);

	public Book updateBook(Book bookid);

}
