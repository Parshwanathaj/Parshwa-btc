package com.xyz.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employees {
	@Id
	private long id;
	private String ename;
	private Date hiredate;
	private String job;
	private double salary;

	public Employees() {

	}

	public Employees(long id, String ename, Date hiredate, String job, double salary) {
		super();
		this.id = id;
		this.ename = ename;
		this.hiredate = hiredate;
		this.job = job;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", hiredate=" + hiredate + ", job=" + job + ", salary="
				+ salary + "]";
	}

}
