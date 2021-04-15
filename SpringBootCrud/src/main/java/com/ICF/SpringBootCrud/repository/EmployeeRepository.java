package com.ICF.SpringBootCrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ICF.SpringBootCrud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	List<Employee> findByfirstname(String firstname);

	List<Employee> findBylastname(String lastname);

	Employee findByDob(String dob);


}
