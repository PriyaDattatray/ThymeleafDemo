package com.luv2code.springboot.Crud.Crude_Demo_SpringBoot.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.luv2code.springboot.Crud.Crude_Demo_SpringBoot.entity.Employee;
import com.luv2code.springboot.Crud.Crude_Demo_SpringBoot.jpa.DepartmentRepository;
import com.luv2code.springboot.Crud.Crude_Demo_SpringBoot.jpa.EmployeeRepostory;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	private EmployeeRepostory employeeRepostory;
	
	private DepartmentRepository departmentRepostory;
	
	//constructor injection
	@Autowired
	public EmployeeServiceImpl(EmployeeRepostory theemployeeRepostory)
	{
		employeeRepostory = theemployeeRepostory;
	}
	
	@Override
	public List<Employee> findAll() {
		
		return employeeRepostory.findAll();
		//findAll() magic methods that is available via reposi
	}

	@Override
	public Employee findById(int theId) {
		
		Optional<Employee> Result = employeeRepostory.findById(theId);
		Employee theEmployee = null;
		if(Result.isPresent())
		{
			theEmployee = Result.get();
			
		}
		//if we didn't find the employee
		else
		{
			throw new RuntimeException("didn't find Employee id - " + theId);
		}
		return theEmployee;
	}

	@Override
	public void save(Employee theEmployee) {
		
       employeeRepostory.save(theEmployee);
	}

	@Override
	public void deleteById(int theId) {
		
		employeeRepostory.deleteById(theId);

	}

}
