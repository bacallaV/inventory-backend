package com.ngk.inventorybackend.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Unidad")
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    @Column(name = "nombre")
    public String name;
}
