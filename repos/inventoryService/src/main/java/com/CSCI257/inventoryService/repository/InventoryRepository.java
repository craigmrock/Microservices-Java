package com.CSCI257.inventoryService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CSCI257.inventoryService.model.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
	public Inventory findById(int id);

}
