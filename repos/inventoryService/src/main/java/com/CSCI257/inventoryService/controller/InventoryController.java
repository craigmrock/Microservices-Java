package com.CSCI257.inventoryService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CSCI257.inventoryService.dto.InventoryDepartmentDTO;
import com.CSCI257.inventoryService.model.Inventory;
import com.CSCI257.inventoryService.service.InventoryService;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
	
	@Autowired
	private InventoryService service;
	
	@PostMapping("/")
	public Inventory postInventory(@RequestBody Inventory inventory) {
		return service.saveInventory(inventory);
	}
	
	@GetMapping("/{id}")
	public Inventory getInventoryById(@PathVariable("id") int id) {
		return service.findInventoryById(id);
	}
	
	@GetMapping("/department/{id}")
	public InventoryDepartmentDTO getInventoryWithDepartment(@PathVariable("id") int id) {
		return service.getInventoryWithDepartment(id);
	}

}
