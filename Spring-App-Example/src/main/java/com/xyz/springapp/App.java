package com.xyz.springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new AnnotationConfigApplicationContext(AppConfig.class);

		Laptop myLaptop = context.getBean(Laptop.class);

		myLaptop.connectInternet();
		myLaptop.joinZoomMeeting();
		myLaptop.showLaptopInfo();

//        Scanner scan = context.getBean(Scanner.class);

//        System.out.println("Enter a value:");
//        String value = scan.nextLine();
//        System.out.println(value);
//        

	}
}