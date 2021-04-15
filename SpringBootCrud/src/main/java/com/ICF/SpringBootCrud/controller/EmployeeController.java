package com.ICF.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ICF.SpringBootCrud.Service.EmployeeService;
import com.ICF.SpringBootCrud.entity.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee emp) {
		return service.createEmployee(emp);
	}
	
	@PostMapping("/addEmployees")
	public List<Employee> addEmployees(@RequestBody List<Employee> emp) {
		return service.createEmployees(emp);
	}
	
	@GetMapping("/Employees")
	public List<Employee> getEmployees() {
		return service.getEmployees();
	}
	
	@GetMapping("/EmployeeById/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return service.getEmployeeById(id);
	}
	
	@GetMapping("/EmployeeByFirstName/{firstname}")
	public List<Employee> getEmployeeByfirstname(@PathVariable String firstname) {
		return service.getEmployeeByfirstname(firstname);
	}
	
	@GetMapping("/EmployeeByLastName/{lastname}")
	public List<Employee> getEmployeeBylastname(@PathVariable String lastname) {
		return service.getEmployeeBylastname(lastname);
	}
	@GetMapping("/EmployeeByDob/{dob}")
	public Employee getEmployeeByDob(@PathVariable String dob) {
		return service.getEmployeeByDOB(dob);
	}
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return service.updateEmployee(emp);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return service.deleteemployee(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
