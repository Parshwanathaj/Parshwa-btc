package com.bookstore.app.btc.model;

import javax.persistence.Id;

import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Book {
	@Id
	private long id;
	private String BookName;
	private String Bookauthor;
	private int Bookprice;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public String getBookauthor() {
		return Bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		Bookauthor = bookauthor;
	}

	public int getBookprice() {
		return Bookprice;
	}

	public void setBookprice(int bookprice) {
		Bookprice = bookprice;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", BookName=" + BookName + ", Bookauthor=" + Bookauthor + ", Bookprice=" + Bookprice
				+ "]";
	}

	public Book(long id, String bookName, String bookauthor, int bookprice) {
		super();
		this.id = id;
		BookName = bookName;
		Bookauthor = bookauthor;
		Bookprice = bookprice;
	}

}
