package com.ngk.inventorybackend.domain.service;

import com.ngk.inventorybackend.domain.repository.InventoryRepository;
import com.ngk.inventorybackend.persistence.entity.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public List<Inventory> findAll() {
        return this.inventoryRepository.findAll();
    }

    public Optional<Inventory> findById(Integer id) {
        return this.inventoryRepository.findById(id);
    }

    public List<Inventory> findOpenInventories() {
        return this.inventoryRepository.findOpenInventories();
    }

    public List<Inventory> findClosedInventories() {
        return this.inventoryRepository.findClosedInventories();
    }

    public Inventory create(Inventory inventory) {
        return this.inventoryRepository.create(inventory);
    }

    public boolean deleteById(Integer id) {
        return this.inventoryRepository.findById(id).map(inventory -> {
            this.inventoryRepository.deleteById(inventory.id);

            return true;
        }).orElse(false);
    }
}
