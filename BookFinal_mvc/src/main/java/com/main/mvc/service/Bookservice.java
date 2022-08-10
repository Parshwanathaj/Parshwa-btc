package com.main.mvc.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.main.mvc.model.Book;

@Service
public class Bookservice {

	private String bookApiUrl = "http://localhost:8039/Book";

	@Autowired
	private RestTemplate rt;

	public Book addBook(Book book) {
		Book addbook = rt.postForObject(bookApiUrl, book, Book.class);
		return addbook;
	}

	public void deleteBookById(long BookId) {
		rt.delete(bookApiUrl + "/" + BookId);
	}

	public Book updateBook(Book book) {
		HttpEntity<Book> entity = new HttpEntity<Book>(book);
		Book books = rt.exchange(bookApiUrl, HttpMethod.PUT, entity, Book.class).getBody();
		return books;
	}

	public Book getBookById(long Bookid) {
		return rt.getForObject(bookApiUrl + "/" + Bookid, Book.class);

	}

	public List<Book> getAllBookList() {
		Book[] bookList = rt.getForObject(bookApiUrl, Book[].class);
		return Arrays.asList(bookList);
	}
}