package com.springrest.courseapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.courseapp.entities.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
