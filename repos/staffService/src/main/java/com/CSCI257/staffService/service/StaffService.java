package com.CSCI257.staffService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.CSCI257.staffService.dto.Department;
import com.CSCI257.staffService.dto.StaffDepartmentDTO;
import com.CSCI257.staffService.model.Staff;
import com.CSCI257.staffService.repository.StaffRepository;

@Service
public class StaffService {
	
	@Autowired
	private StaffRepository repo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Staff saveStaff(Staff staff) {
		return repo.save(staff);
	}
	
	public Staff findStaffById(int id) {
		return repo.findById(id);
	}
	
	public void deleteStaffById(Integer id)
	{
		repo.deleteById(id);
	}
	
	public StaffDepartmentDTO getStaffWithDepartment(int id) {
		StaffDepartmentDTO response = new StaffDepartmentDTO();
		Staff staff = repo.findById(id);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + staff.getDepartmentId(), Department.class); //append department id to the end of the request and tell what data type it is
		
		response.setDepartment(department);
		response.setStaff(staff);
		
		return response;
	}

}
