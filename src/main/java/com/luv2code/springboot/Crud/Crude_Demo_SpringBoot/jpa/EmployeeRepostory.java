package com.luv2code.springboot.Crud.Crude_Demo_SpringBoot.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.Crud.Crude_Demo_SpringBoot.entity.Employee;

public interface EmployeeRepostory extends JpaRepository<Employee, Integer> {
 
	//no need to write code
}
