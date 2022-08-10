package com.bookstore.app.btc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.app.btc.model.Book;

public interface BookRepoimpl extends JpaRepository<Book, Long> {


}
