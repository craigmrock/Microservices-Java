package com.CSCI257.staffService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CSCI257.staffService.model.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {
	public Staff findById(int id);
	

}
