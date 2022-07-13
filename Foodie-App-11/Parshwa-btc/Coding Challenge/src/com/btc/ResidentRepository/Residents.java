package com.btc.ResidentRepository;

import java.util.Comparator;

public class Residents implements Comparable<Residents> {
	private String fullName;
	private int ssn;
	private String gender;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Residents(String fullName, int ssn, String gender) {
		super();
		this.fullName = fullName;
		this.ssn = ssn;
		this.gender = gender;
	}

	@Override
	public int compareTo(Residents other) {
		return Comparator.comparingInt(Residents::getSsn).compare(this, other);
	}

	@Override
	public String toString() {
		return "Residents [fullName=" + fullName + ", ssn=" + ssn + ", gender=" + gender + ", getFullName()="
				+ getFullName() + ", getSsn()=" + getSsn() + ", getGender()=" + getGender() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	private static <T extends Object> int getSsn(T t1) {
		return 0;
	}
}