package com.ngk.inventorybackend.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Inventario")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @ManyToOne()
    @JoinColumn(name = "idUnidad", insertable = false, updatable = false)
    public Unit unit;

    @Column(name = "fecha")
    public Date date;

    @Column(name = "status")
    public String status;

    @OneToMany(mappedBy = "inventory")
    public List<Medicament> medicament;
}
