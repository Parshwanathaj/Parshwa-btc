package com.main.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.main.mvc.model.Book;
import com.main.mvc.service.Bookservice;

@Controller
public class BookController {

	@Autowired
	private Bookservice service;;

	@GetMapping("/")
	public String getAll(Model m) {
		List<Book> book = service.getAllBookList();
		m.addAttribute("book", book);
		return "book.jsp";
	}

	@GetMapping("/add-book")
	public String addBook() {
		return "add-book.jsp";
	}

	@PostMapping("/insert-book")
	public String addBook(@ModelAttribute("insert-book") Book book) {
		service.addBook(book);
		return "redirect:/";
	}

	@GetMapping("/delete-book/{bookId}")
	public String deleteBook(@PathVariable long bookId) {
		service.deleteBookById(bookId);
		return "redirect:/";
	}

	@GetMapping("/edit-book/{bookId}")
	public String editBook(@PathVariable long bookId, Model m) {
		Book book = service.getBookById(bookId);
		System.out.println("-------------");
		System.out.println(book);
		m.addAttribute("book", book);

		return "/edit.jsp";
	}

	@PostMapping("/edit-book/update-book")
	public String updateBook(@ModelAttribute("update-book") Book book) {
		service.updateBook(book);
		return "redirect:/";
	}
}