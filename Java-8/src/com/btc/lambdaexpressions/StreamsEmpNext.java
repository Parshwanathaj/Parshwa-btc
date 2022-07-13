package com.btc.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Emp1 {
	public String name;
	public double salary;

	public Emp1(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}

public class StreamsEmpNext {

	public static void main(String[] args) {
		Emp emp1 = new Emp("naveen", 45000);
		Emp emp2 = new Emp("smith", 70000);
		Emp emp3 = new Emp("smith", 10000);

		List<Emp> employees = new ArrayList<Emp>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(new Emp("Rohit", 450000));

		List<String> empStrList = new ArrayList<String>();

		empStrList = employees.stream().filter(emp -> emp.salary > 40000).map(emp -> emp.name)
				.collect(Collectors.toList());
		System.out.println(empStrList.toString());

	}
}