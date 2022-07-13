package org.xyz.employee_bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Autowired
	SBUBean sbuBean;
	
	@Value("${employee.id}")
	private int employeeid;
	@Value("${employee.name}")
	private String employeeName;
	@Value("${employee.salary}")
	private double salary;
	@Value("${employee.businessUnit}")
	private String businessUnit;
	@Value("${employee.age}")
	private int age;

	public SBUBean getSbuBean() {
		return sbuBean;
	}

	public void setSbuBean(SBUBean sbuBean) {
		this.sbuBean = sbuBean;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void Empinfo() {
		System.out.println("employee Details are");
		System.out.println("-------------------");
		System.out.println(details());
		System.out.println();
		System.out.println(this);
	}

	public String details() {
		return " employeeid=" + employeeid + "\n" + " employeeName=" + employeeName + "\n" + " salary=" + salary + "\n"
				+ " businessUnit=" + businessUnit + "\n" + " age=" + age;
	}

	@Override
	public String toString() {
		return "Employee [sbuBean=" + sbuBean + ", employeeid=" + employeeid + ", employeeName=" + employeeName
				+ ", salary=" + salary + ", businessUnit=" + businessUnit + ", age=" + age + "]";
	}
}