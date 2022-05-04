package com.CSCI257.department.model;



import org.springframework.stereotype.Component;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

//model is our data entity or structure of department

@Component
@Entity
@Data //lombok taking care of getters and setters
@NoArgsConstructor
@AllArgsConstructor

public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String room;
	private String building;
	private String phone;

}
