package com.ngk.inventorybackend.web.controller;

import com.ngk.inventorybackend.domain.service.InventoryService;
import com.ngk.inventorybackend.persistence.entity.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/inventories")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/all")
    public ResponseEntity<List<Inventory>> findAll() {
        return new ResponseEntity<>(this.inventoryService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Inventory> findById(@PathVariable("id") Integer id) {
        return this.inventoryService.findById(id)
                .map(inventory -> new ResponseEntity<>(inventory, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/open")
    public ResponseEntity<List<Inventory>> findOpenInventories() {
        return new ResponseEntity<>(this.inventoryService.findOpenInventories(), HttpStatus.OK);
    }

    @GetMapping("/closed")
    public ResponseEntity<List<Inventory>> findClosedInventories() {
        return new ResponseEntity<>(this.inventoryService.findClosedInventories(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Inventory> create(Inventory inventory) {
        return new ResponseEntity<>(this.inventoryService.create(inventory), HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity deleteById(@PathVariable("id") Integer id) {
        if (this.inventoryService.deleteById(id)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
