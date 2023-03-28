package com.ait.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ait.main.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	
}
