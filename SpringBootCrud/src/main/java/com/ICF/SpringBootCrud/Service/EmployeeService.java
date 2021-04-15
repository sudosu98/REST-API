package com.ICF.SpringBootCrud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ICF.SpringBootCrud.entity.Employee;
import com.ICF.SpringBootCrud.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;
	
	//Create Employee
	public Employee createEmployee(Employee emp) {
		return repository.save(emp);
	}
	
	public List<Employee> createEmployees(List<Employee> emps){
		return repository.saveAll(emps);
	}
	//Read Employess by different properties
	public List<Employee> getEmployees(){
		return repository.findAll();
	}
	public Employee getEmployeeById(int id) {
		return repository.findById(id).orElse(null);
	}
	public List<Employee> getEmployeeByfirstname(String firstname) {
		return repository.findByfirstname(firstname);
	}
	public List<Employee> getEmployeeBylastname(String lastname) {
		return repository.findBylastname(lastname);
	}
	public Employee getEmployeeByDOB(String dob) {
		return repository.findByDob(dob);
	}
	//Update Employee
	public Employee updateEmployee(Employee emp) {
		Employee existingemp = repository.findById(emp.getId()).orElse(null);
		existingemp.setAddress(emp.getAddress());
		existingemp.setDept(emp.getDept());
		existingemp.setDesignation(emp.getDesignation());
		existingemp.setEnd_date(emp.getEnd_date());
		existingemp.setFirstname(emp.getFirstname());
		existingemp.setLastname(emp.getLastname());
		existingemp.setReporting_mgr(emp.getReporting_mgr());
		existingemp.setStatus(emp.getStatus());
		
		return repository.save(existingemp);
	}
	
	//Delete
	 public String deleteemployee(int id) {
		 repository.deleteById(id);
		 return "Employee Removed From DB" + id;
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
