package com.xyz.service;

import java.util.Date;
import java.util.List;

import com.xyz.model.Employees;

public interface IEmployeeService {
	public Employees saveEmpoyee(Employees emp);

	public Employees findEmployee(long id);

	public Employees updateEmployee(Employees emp);

	public boolean deleteEmployee(long id);

	public List<Employees> getAllItems();

	// public Employees FindEmployeeByName(String ename);
	// public Employees getEmployeeByName(String ename);

	public List<Employees> findEmployeeWithinSalaryRange(double salary);

	public List<Employees> findEmployeesWithInRange(double minSalary, double maxSalary);

	public List<Employees> findEmployeesInHiredateRange(Date minHiredate, Date maxHiredate);

}
