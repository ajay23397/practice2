package com.ait.main.service;

import java.util.List;

import com.ait.main.model.Employee;

public interface EmployeeService {

	
	List<Employee>getAllEmployee();
	public void saveEmployee(Employee employee);
	public Employee getEmployebyId(long id);
	public void deleteEmployee(long id);
}
