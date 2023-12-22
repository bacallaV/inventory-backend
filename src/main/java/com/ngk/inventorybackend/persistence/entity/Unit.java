package com.ngk.inventorybackend.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
@Table(name = "unidad")
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_unidad")
    public Integer id;

    @Column(name = "nombre")
    public String name;

    @OneToMany(mappedBy = "unit")
    public List<Inventory> inventory;
}
