package com.bookstore.app.btc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.app.btc.model.Book;
import com.bookstore.app.btc.service.Bookimpl;

@Component
@RestController
public class BookstoreController {
	@Autowired
	private Bookimpl bookservice;

	// get the book
	@GetMapping("/Book")
	public List<Book> getBook() {
		return this.bookservice.getBook();

	}

	// single book get
	@GetMapping("/Book/{Bookid}")
	public Book getBook(@PathVariable String Bookid) {
		return this.bookservice.getBook(Long.parseLong(Bookid));

	}

	// addd book
	@PostMapping("/Book")
	public Book addBook(@RequestBody Book book) {
		return this.bookservice.addBook(book);
	}

	// update Book using put request
	@PutMapping("/Book")
	public Book updateBook(@RequestBody Book book) {
		return this.bookservice.updateBook(book);
	}

	// delete the book

	@DeleteMapping("/Book/{Bookid}")
	public boolean deleteBook(@PathVariable("Bookid") long Bookid) {
		return bookservice.deleteBook(Bookid);
	}
//    @DeleteMapping("/Book/{Bookid}")
//   public ResponseEntity<HttpStatus> deleteBook(@PathVariable String Bookid)
//   {
//	   try {
//		   this.bookservice.deleteBook(Long.parseLong(Bookid));
//		
//		  return new ResponseEntity<>(HttpStatus.);
//	   }
//	   catch (Exception e) {
//		   return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//		  
//   }

//  }
}
