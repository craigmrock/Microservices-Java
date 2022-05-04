package com.CSCI257.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CSCI257.department.model.Department;

//repository is how we interact with database

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{
	Department findById(int id); //returns a Department, takes id. Spring data is going to handle implementation

}
