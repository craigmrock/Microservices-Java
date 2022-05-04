package com.CSCI257.staffService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
	private int id;
	private String name;
	private String room;
	private String building;
	private String phone;

}
