package com.luv2code.springboot.Crud.Crude_Demo_SpringBoot.DAo.rest;
import java.util.List;

import javax.management.RuntimeErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.luv2code.springboot.Crud.Crude_Demo_SpringBoot.entity.Employee;
import com.luv2code.springboot.Crud.Crude_Demo_SpringBoot.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
  
   private EmployeeService employeeService;
	
	@Autowired
	public EmployeeRestController(EmployeeService theemployeeService) {
		employeeService = theemployeeService;
	}
	
	//expose "/employee" and return list of employee
		@GetMapping("/employees")
		public List<Employee> findAll()
		{
			return employeeService.findAll();
		}
	
		
		//Add the mapping for GET/employees/{employeeId}
		@GetMapping("/employees/{employeeId}")
		public Employee getEmployee(@PathVariable int employeeId)
		{
			Employee theemployee = employeeService.findById(employeeId);
			
			return theemployee;
		}
	
		//add mapping for Post /employees - add new wmployee
		@PostMapping("/employees")
		public Employee addEmployee(@RequestBody Employee theEmployee)
		{
			theEmployee.setId(0);
			employeeService.save(theEmployee);
			return theEmployee;
		}
		
		//add mapping for post/employees - update employee
		@PutMapping("/employees")
		public Employee updateEmployee(@RequestBody Employee theEmployee)
		{
			employeeService.save(theEmployee);
			return theEmployee;
		}
		
		//add mapping for delete/employees - delete employee
		@DeleteMapping("/employees/{employeeId}")
		public String deleteEmployee(@PathVariable int employeeId)
		{
			Employee theEmployee = employeeService.findById(employeeId);
			
			employeeService.deleteById(employeeId);
			return "Deleted employee id - " + employeeId;
		}
	
}
