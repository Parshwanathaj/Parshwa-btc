package com.xyz.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.xyz.model.Employees;

public interface IEmployeeRepo extends JpaRepository<Employees, Long> {
	// public Employees FindEmployeeByName(String ename);
	// public Employees findEmployeeByEmployeeName(String ename);
	@Query(value = "from Employees where salary <= :salary")
	public List<Employees> findEmployeeInSalaryRange(double salary);

	@Query(value = " from Employees where salary <= :maxSalary and salary >= :minSalary ")
	public List<Employees> findEmployeesInRange(double minSalary, double maxSalary);

	@Query(value = " from Employees where hiredate <= : maxHiredate and hiredate <= minHiredate")
	public List<Employees> findEmployeesInHiredateRange(Date minHiredate, Date maxHiredate);

}
