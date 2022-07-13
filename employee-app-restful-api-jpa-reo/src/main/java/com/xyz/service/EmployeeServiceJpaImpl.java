package com.xyz.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xyz.Repository.IEmployeeRepo;
import com.xyz.exception.EmployeeAlreadyDeletedException;
import com.xyz.exception.EmployeeAlreadyExistException;
import com.xyz.exception.EmployeeNotFoundException;
import com.xyz.model.Employees;

@Service
public class EmployeeServiceJpaImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepo repo;

	@Override
	@Transactional
	public Employees saveEmpoyee(Employees emp) {
		if (repo.existsById(emp.getId())) {
			throw new EmployeeAlreadyExistException("employee " + emp + "is already present");
		}
		return repo.save(emp);

	}

	@Override
	public Employees findEmployee(long id) {
		if (!repo.existsById(id)) {
			throw new EmployeeNotFoundException("Item with code - " + id + " Not Found!!");
		}

		return repo.findById(id).get();
	}

	@Override
	@Transactional
	public Employees updateEmployee(Employees emp) {

		return repo.save(emp);
	}

	@Override
	@Transactional
	public boolean deleteEmployee(long id) {
		if (!repo.existsById(id)) {
			throw new EmployeeAlreadyDeletedException("this employee " + id + "is already deleted");
		}
		repo.deleteById(id);
		return !repo.existsById(id);
	}

	@Override
	public List<Employees> getAllItems() {

		return repo.findAll();
	}

//	@Override
//	public Employees FindEmployeeByName(String ename) {
//		
//		return repo.FindEmployeeByName(ename);
//	}

//	@Override
//	public Employees getEmployeeByName(String ename) {
//		
//		return repo.findEmployeeByEmployeeName(ename);
//	}

	@Override
	public List<Employees> findEmployeeWithinSalaryRange(double salary) {

		return repo.findEmployeeInSalaryRange(salary);
	}

	@Override
	public List<Employees> findEmployeesWithInRange(double minSalary, double maxSalary) {

		return repo.findEmployeesInRange(minSalary, maxSalary);
	}

	@Override
	public List<Employees> findEmployeesInHiredateRange(Date minHiredate, Date maxHiredate) {

		return repo.findEmployeesInHiredateRange(minHiredate, maxHiredate);
	}

}
