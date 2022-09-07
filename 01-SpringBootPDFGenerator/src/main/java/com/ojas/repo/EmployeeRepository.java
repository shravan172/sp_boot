package com.ojas.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ojas.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
			
		@Query("FROM Employee e")
		List<Employee> getAllEmployeeData();
		
}