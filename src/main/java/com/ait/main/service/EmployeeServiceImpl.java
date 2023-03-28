package com.ait.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ait.main.Repository.EmployeeRepository;
import com.ait.main.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
@Autowired
	private EmployeeRepository emprepo;
	@Override
	public List<Employee> getAllEmployee() {
		
		return  emprepo.findAll() ;
	}
	@Override
	public void saveEmployee(Employee employee) {
	this.emprepo.save(employee);
	
		
	}
	@Override
	public Employee getEmployebyId(long id) {
		Optional<Employee>optional=emprepo.findById(id);
		Employee employee= new Employee();
		employee=optional.get();
		return employee;
	}
	@Override
	public void deleteEmployee(long id) {
		
		emprepo.deleteById(id);
	}
	
	
	

}

