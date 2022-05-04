package com.CSCI257.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CSCI257.department.model.Department;
import com.CSCI257.department.service.DepartmentService;

//controller handles requests and routing logic

@RestController //Rest Controller lets us bypass view resolver - expecting to find a view and return HTML page. RestController lets you just get data.
@RequestMapping("/departments") //high level path we want. anything /departments will route to this controller.
public class DepartmentController {

	@Autowired
	private DepartmentService service;
	
	//host:port/departments/
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		return service.saveDepartment(department);
		
	}
	
	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable int id) {
		return service.getDepartmentById(id);
	}
	
}
