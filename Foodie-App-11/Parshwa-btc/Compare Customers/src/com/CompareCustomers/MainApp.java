package com.CompareCustomers;

public class MainApp {
	public static void main(String[] args) {
		Address a = new Address("Jigani", "Banglore");
		Address al = new Address("Jigani", "Bang");
		Address a2 = new Address("Jigani", "Banglore");

		Customer c = new Customer(1, "Parshwa", "Praju@0306", a);
		Customer c1 = new Customer(1, "Parshwa", "Praju@0306", al);
		Customer c2 = new Customer(1, "Parshwa", "Praju@0306", a2);

		System.out.println(a);
		System.out.println(al);
		System.out.println(c);
		System.out.println(c1);

		System.out.println(c.equals(c2));
		System.out.println(c1.equals(c2));

	}
}