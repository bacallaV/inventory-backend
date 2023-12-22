package com.ngk.inventorybackend.domain.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ngk.inventorybackend.persistence.crud.InventoryCrudRepository;
import com.ngk.inventorybackend.persistence.entity.Inventory;
import com.ngk.inventorybackend.utilities.Status;

import java.util.List;
import java.util.Optional;

@Repository
public class InventoryRepository {
    @Autowired
    private InventoryCrudRepository inventoryCrudRepository;

    public List<Inventory> findAll() {
        return (List<Inventory>) this.inventoryCrudRepository.findAll();
    }

    public Optional<Inventory> findById(Integer id) {
        return this.inventoryCrudRepository.findById(id);
    }

    public List<Inventory> findOpenInventories() {
        return this.inventoryCrudRepository.findByStatus(Status.ABIERTO);
    }

    public List<Inventory> findClosedInventories() {
        return this.inventoryCrudRepository.findByStatus(Status.CERRADO);
    }

    public Inventory create(Inventory inventory) {
        return this.inventoryCrudRepository.save(inventory);
    }

    public void deleteById(Integer id) {
        this.inventoryCrudRepository.deleteById(id);
    }
}
