package com.CSCI257.staffService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CSCI257.staffService.dto.StaffDepartmentDTO;
import com.CSCI257.staffService.model.Staff;
import com.CSCI257.staffService.service.StaffService;

@RestController
@RequestMapping("/staff")
public class StaffController {
	
	@Autowired
	private StaffService service;
	
	@PostMapping("/")
	public Staff postStaff(@RequestBody Staff staff) {
		return service.saveStaff(staff);
	}
	
	@GetMapping("/{id}")
	public Staff getStaffById(@PathVariable("id") int id) {
		return service.findStaffById(id);
	}
	
	//host:port/staff/department/1
	@GetMapping("/department/{id}")
	public StaffDepartmentDTO getStaffWithDepartment(@PathVariable("id") int id) {
		return service.getStaffWithDepartment(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteStaffById(@PathVariable("id") int id)
	{
		service.deleteStaffById(id);
		
	}
	
	@PutMapping("/{id}")
	public Staff updateStaff(@RequestBody Staff staff)
	{
		return service.saveStaff(staff);
	}

}
