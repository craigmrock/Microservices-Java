package com.CSCI257.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CSCI257.department.model.Department;
import com.CSCI257.department.repository.DepartmentRepository;

//service is for any other logic such as business logic
@Service
public class DepartmentService {
	
	@Autowired //Let Spring handle creating this for us
	private DepartmentRepository departmentRepo;
	
	public Department saveDepartment(Department department) {
		return departmentRepo.save(department);
	}
	
	public Department getDepartmentById(int id) {
		return departmentRepo.findById(id);
	}

}
