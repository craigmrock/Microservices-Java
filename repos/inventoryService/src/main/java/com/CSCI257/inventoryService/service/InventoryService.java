package com.CSCI257.inventoryService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.CSCI257.inventoryService.dto.Department;
import com.CSCI257.inventoryService.dto.InventoryDepartmentDTO;
import com.CSCI257.inventoryService.model.Inventory;
import com.CSCI257.inventoryService.repository.InventoryRepository;

@Service
public class InventoryService {
	
	@Autowired
	private InventoryRepository repo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Inventory saveInventory(Inventory inventory) {
		return repo.save(inventory);
	}
	
	public Inventory findInventoryById(int id) {
		return repo.findById(id);
	}
	
	public InventoryDepartmentDTO getInventoryWithDepartment(int id) {
		InventoryDepartmentDTO response = new InventoryDepartmentDTO();
		Inventory inventory = repo.findById(id);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + inventory.getDepartmentId(), Department.class);
		
		response.setDepartment(department);
		response.setInventory(inventory);
		
		return response;
	}

}
