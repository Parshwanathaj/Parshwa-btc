package com.bookstore.app.btc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bookstore.app.btc.model.Book;
import com.bookstore.app.btc.repository.BookRepoimpl;

@Service
public class Bookservice implements Bookimpl {

	@Autowired
	private BookRepoimpl bookrepo;

	public Bookservice() {
	}

	@Override
	public List<Book> getBook() {
		return bookrepo.findAll();
	}

	@Override
	public Book getBook(long Bookid) {

		return bookrepo.findById(Bookid).get();
	}

	@Override
	public Book addBook(Book bookid) {

		bookrepo.save(bookid);
		return bookid;
	}

	@Override
	public Book updateBook(Book book) {
		bookrepo.save(book);
		return book;
	}

	public boolean deleteBook(long Bookid) {
		bookrepo.deleteById(Bookid);
		return !bookrepo.existsById(Bookid);
	}
}