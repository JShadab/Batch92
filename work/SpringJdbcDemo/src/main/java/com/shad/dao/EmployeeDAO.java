package com.shad.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.shad.model.Employee;

@Component
public class EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void save(Employee employee) {

		String insertSQL = "INSERT INTO employee VALUES(?,?,?,?)";

		jdbcTemplate.update(insertSQL, employee.getId(), employee.getName(), employee.getAge(), employee.getSalary());

	}

	public void update(Employee employee) {

		String updateSQL = "UPDATE employee SET name=?, age=?, salary=? WHERE id=?";

		jdbcTemplate.update(updateSQL, employee.getName(), employee.getAge(), employee.getSalary(), employee.getId());

	}

	public void delete(int employeeID) {

		String deleteSQL = "DELEET FROM employee WHERE id=?";

		jdbcTemplate.update(deleteSQL, employeeID);

	}

	public Employee get(int employeeID) {
		return null;
	}

	public List<Employee> getAll() {
		return null;
	}

}
