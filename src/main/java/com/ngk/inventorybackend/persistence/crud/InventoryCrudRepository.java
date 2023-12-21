package com.ngk.inventorybackend.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import com.ngk.inventorybackend.persistence.entity.Inventory;

import java.util.List;

public interface InventoryCrudRepository extends CrudRepository<Inventory, Integer> {
    List<Inventory> findByStatus(String status);
}
