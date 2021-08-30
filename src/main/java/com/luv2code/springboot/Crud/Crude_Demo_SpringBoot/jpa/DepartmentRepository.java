package com.luv2code.springboot.Crud.Crude_Demo_SpringBoot.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.Crud.Crude_Demo_SpringBoot.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
