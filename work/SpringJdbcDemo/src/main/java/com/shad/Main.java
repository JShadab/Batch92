package com.shad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shad.dao.EmployeeDAO;
import com.shad.model.Employee;

public class Main {

	public static void main(String[] args) {

		// IOC container
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);

		Employee emp = new Employee();
		emp.setAge(21);
		emp.setId(3);
		emp.setName("Satya");
		emp.setSalary(3453);

		employeeDAO.save(emp);

		System.out.println("DONE");

	}
}
