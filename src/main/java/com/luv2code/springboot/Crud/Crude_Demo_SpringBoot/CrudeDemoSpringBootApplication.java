package com.luv2code.springboot.Crud.Crude_Demo_SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.luv2code.springboot.Crud.Crude_Demo_SpringBoot.jpa.EmployeeRepostory;

@SpringBootApplication
public class CrudeDemoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudeDemoSpringBootApplication.class, args);
	}

	//@Autowired
	//private EmployeeRepostory employeeRepository;
	
}
