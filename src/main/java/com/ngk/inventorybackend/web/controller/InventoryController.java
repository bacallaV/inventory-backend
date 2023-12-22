package com.ngk.inventorybackend.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import com.ngk.inventorybackend.domain.service.InventoryService;
import com.ngk.inventorybackend.persistence.entity.Inventory;

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
    public ResponseEntity<Inventory> create(@RequestBody Inventory inventory) {
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
