package com.xyz.springapp;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new AnnotationConfigApplicationContext(AppConfig.class);

		Laptop myLaptop = context.getBean(Laptop.class);

		myLaptop.connectInternet();
		myLaptop.joinZoomMeeting();

		Scanner scan = context.getBean(Scanner.class);

		System.out.println("Enter a value:");
		String value = scan.nextLine();
		System.out.println(value);

	}
}