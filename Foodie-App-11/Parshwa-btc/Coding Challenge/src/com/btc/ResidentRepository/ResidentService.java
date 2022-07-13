package com.btc.ResidentRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ResidentService {
	public static void main(String[] args) {
		Residents res1 = new Residents("Parshwa", 100, "Male");
		Residents res2 = new Residents("Kavya", 200, "Female");
		Residents res3 = new Residents("Racchu", 400, "Female");
		Residents res4 = new Residents("Prajuu", 300, "Male");

		List<Residents> listResidents = new ArrayList<>();
		listResidents.add(res1);
		listResidents.add(res2);
		listResidents.add(res3);
		listResidents.add(res4);

		System.out.println("Residents details are here....");
		System.out.println(listResidents);

		System.out.println("\nResidents details ordered by ssn number....");

		Collections.sort(listResidents);
		System.out.println(listResidents);

		System.out.println("\nResidents details are here according to name....");

		listResidents.sort(Comparator.comparing(Residents::getFullName));
		System.out.println(listResidents);

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("\nSearch by ssn number");
			System.out.print("Enter a ssn number: ");

			while (!sc.hasNextInt()) {

				sc.nextLine();
				System.out.println("Enter a valid ssn number!");
				System.out.print("Enter a ssn number: ");
			}
			int ssn = sc.nextInt();
			Residents residentResult = listResidents.stream().filter(r -> r.getSsn() == ssn).findFirst().orElse(null);
			System.out.println("\nPrinting the result via stream research");
			if (residentResult != null)
			{
				System.out.printf("Resident with %d ssn number is: %s%n", ssn, residentResult.getFullName());
			} else 
			{
				System.out.printf("There is no resident with %d ssn number...%n", ssn);
			}
			Collections.sort(listResidents);
			int index = Collections.binarySearch(listResidents, new Residents("", ssn, ""));

			System.out.println("\nPrinting the result via binary search");
			if (index >= 0) 
			{
				System.out.printf("Resident with %d ssn number is: %s%n", ssn, listResidents.get(index).getFullName());
			} else 
			{
				System.out.printf("There is no resident with %d ssn number...%n", ssn);
			}
		}
	}
}