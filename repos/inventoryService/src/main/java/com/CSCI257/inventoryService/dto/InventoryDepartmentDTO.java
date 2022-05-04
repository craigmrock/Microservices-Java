package com.CSCI257.inventoryService.dto;

import com.CSCI257.inventoryService.model.Inventory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryDepartmentDTO { //DTP is Data Transfer Object. It will return what is here, not what a table has
	private Inventory inventory;
	private Department department;

}
