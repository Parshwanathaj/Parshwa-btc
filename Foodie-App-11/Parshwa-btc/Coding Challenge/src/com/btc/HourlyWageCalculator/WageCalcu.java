package com.btc.HourlyWageCalculator;

public class WageCalcu {
	private String employeeName;
	private double pay;

public void setEmployeeName(String name) {
		employeeName = name;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public double calculatePay(int hours, double rate) {
		if (hours > 40) {
			int extraHours = hours - 40;
			pay = (40 * rate) + (extraHours * rate);
		} else
			pay = hours * rate;

		return pay;
	}

	public void displayEmployee() {
		System.out.println("Name :: " + employeeName);
		//System.out.printf("\nGross Salary: ", +pay);
		System.out.printf("Base Pay ::",+ pay);
	}
}