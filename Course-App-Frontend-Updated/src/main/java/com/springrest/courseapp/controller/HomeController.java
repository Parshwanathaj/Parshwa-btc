package com.springrest.courseapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springrest.courseapp.dao.UserRepository;
import com.springrest.courseapp.entities.User;

@Controller
public class HomeController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/test")
	@ResponseBody
	public String test() {

		User user = new User();
		user.setName("Parshwa");
		user.setEmail("parshwa@gmail.com");
		userRepository.save(user);

		return "working";
	}
}
