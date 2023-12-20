package com.ngk.inventorybackend.persistence.entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

public class Inventory {
    @OneToMany()
    public Integer idInventory;
}
