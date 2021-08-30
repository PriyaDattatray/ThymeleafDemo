package com.luv2code.springboot.Crud.Crude_Demo_SpringBoot.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="department")
public class Department {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="d_name")
	private String d_nm;
	
	 @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
	    @JsonIgnore
	    private List<Employee> employees;
	
	
}
