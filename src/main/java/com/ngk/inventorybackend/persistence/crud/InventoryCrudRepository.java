package com.ngk.inventorybackend.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

import com.ngk.inventorybackend.persistence.entity.Inventory;
import com.ngk.inventorybackend.utilities.Status;

public interface InventoryCrudRepository extends CrudRepository<Inventory, Integer> {
    List<Inventory> findByStatus(Status status);
}
