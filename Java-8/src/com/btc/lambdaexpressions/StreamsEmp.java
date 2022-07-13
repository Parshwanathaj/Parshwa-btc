package com.btc.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Emp {
	public String name;
	public double salary;

public Emp(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}
public class StreamsEmp {

	public static void main(String[] args) {
		Emp sal1 = new Emp("Parshwa", 35000);
		Emp sal2 = new Emp("Varun", 30000);
		Emp sal3 = new Emp("Megha", 45000);

		List<Emp> employees = new ArrayList<Emp>();
		employees.add(sal1);
		employees.add(sal2);
		employees.add(sal3);

		List<Emp> salaryParsed = (List<Emp>) employees.stream().filter(i -> i.salary > 40000)
				.collect(Collectors.toList());
		for (Emp empolyee : salaryParsed) {
			System.out.println(empolyee.name);
		}

	}
}