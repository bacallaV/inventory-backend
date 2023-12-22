package com.ngk.inventorybackend.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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

import com.ngk.inventorybackend.utilities.Status;

@Entity
@Table(name = "inventario")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inventario")
    public Integer id;

    @ManyToOne()
    @JoinColumn(name = "id_unidad", insertable = false, updatable = false)
    public Unit unit;

    @Column(name = "fecha")
    public Date date;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    public Status status;

    @OneToMany(mappedBy = "inventory")
    public List<Medicament> medicament;
}
