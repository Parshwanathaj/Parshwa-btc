package com.xyz.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.model.Employees;
import com.xyz.service.IEmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private IEmployeeService service;

	@PostMapping("/employees")
	public Employees addFoodItem(@RequestBody Employees emp) {
		return service.saveEmpoyee(emp);
	}

	@GetMapping("/employees/{employee-id}")
	public Employees getFoodItem(@PathVariable("employee-id") long id) {
		return service.findEmployee(id);
	}

	@PutMapping("/employees")
	public Employees updateFoodItem(@RequestBody Employees emp) {
		return service.updateEmployee(emp);
	}

	@DeleteMapping("/employees/{employee-id}")
	public boolean deleteFoodItem(@PathVariable("employee-id") long id) {
		return service.deleteEmployee(id);
	}

	@GetMapping("/employees")
	public List<Employees> getAllFoodItems() {
		return service.getAllItems();
	}
//	@GetMapping("/employees/employee-name/{employee-name}")
//	public Employees findEmployeeByName(@PathVariable("employee-name") String employeeName) {
//		return service.getEmployeeByName(employeeName);
//	}

	@GetMapping("/employees/salary/{salary}")
	public List<Employees> findEmployeesInPriceRange(@PathVariable double salary) {
		return service.findEmployeeWithinSalaryRange(salary);
	}

	@GetMapping("/employees/salary/minSalary/{minSalary}/maxSalary/{maxSalary}")
	public List<Employees> findEmployeesWithInPrice(@PathVariable("minSalary") double minSalary,
			@PathVariable("maxSalary") double maxSalary) {
		return service.findEmployeesWithInRange(minSalary, maxSalary);
	}

	@GetMapping("/employees/hiredate/minHiredate/{minHiredate}/maxHiredate/{maxHiredate}")
	public List<Employees> findEmployeesInHiredate(@PathVariable("minHiredate") Date minHiredate,
			@PathVariable("maxHiredate") Date maxHiredate) {
		return service.findEmployeesInHiredateRange(minHiredate, maxHiredate);
	}
}
