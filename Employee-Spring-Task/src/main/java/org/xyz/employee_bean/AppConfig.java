package org.xyz.employee_bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("application.properties")
public class AppConfig {

	@Bean
	public SBUBean getSBUBean() {
		SBUBean s = new SBUBean();
		s.setSbuid(10);
		s.setSbuName("rajesh");
		s.setSbuHead("abc");
		return s;
	}

//	@Bean
//	public Employee getEmployee() {
//		Employee emp = new Employee();
//		emp.setSbuBean(getSBUBean());
//		emp.setEmployeeid(11);
//		emp.setEmployeeName("chandu");
//		emp.setAge(29);
//		emp.setSalary(25000);
//		emp.setBusinessUnit("mnq");
//		return emp;
//	}
}