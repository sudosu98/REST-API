package com.ICF.SpringBootCrud;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.ICF.SpringBootCrud.Service.EmployeeService;
import com.ICF.SpringBootCrud.entity.Employee;
import com.ICF.SpringBootCrud.repository.EmployeeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootCrudApplicationTests {

	@MockBean
	private EmployeeRepository repository;
	@Autowired
	private EmployeeService service;
	
	@Test
	public void testgetEmployees() {
		when(repository.findAll()).thenReturn(Stream
				.of(new Employee(1,"jacob","maharaj","24-June-1985", "Associate", "Software", "21-May-2025", "Active", "10-Sep-1975", "Alex", "Male", "O+", "Boston"),
				new Employee(2,"Krishna","Mehta","2-Sep-1985", "ProjectLead", "Software", "21-Sep-2025", "Active", "1-May-1975", "Alex", "Male", "B+", "Bangalore"))
				.collect(Collectors.toList()));
		
		assertEquals(2,service.getEmployees().size());
	}
	
	@Test
	public void testgetEmployeeByfirstName() {
		String name = "jacob";
		when(repository.findByfirstname(name)).thenReturn(Stream
				.of(new Employee(1,"jacob","maharaj","24-June-1985", "Associate", "Software", "21-May-2025", "Active", "10-Sep-1975", "Alex", "Male", "O+", "Boston"))
				.collect(Collectors.toList()));
		assertEquals(1,service.getEmployeeByfirstname(name).size());
	}
	@Test
	public void testgetEmployeeBylastName() {
		String name = "Mehta";
		when(repository.findBylastname(name)).thenReturn(Stream
				.of(new Employee(2,"Krishna","Mehta","2-Sep-1985", "ProjectLead", "Software", "21-Sep-2025", "Active", "1-May-1975", "Alex", "Male", "B+", "Bangalore"))
				.collect(Collectors.toList()));
		assertEquals(1,service.getEmployeeBylastname(name).size());
	}

}
