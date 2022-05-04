package com.CSCI257.staffService.dto;

import com.CSCI257.staffService.model.Staff;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StaffDepartmentDTO { //DTO stands for data transfer object
	private Staff staff;
	private Department department;

}
