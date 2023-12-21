package com.ngk.inventorybackend.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
@Table(name = "Insumo")
public class Medicament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(name = "clave")
    public Integer code;

    @Column(name = "descripcion")
    public String description;

    @Column(name = "lote")
    public Integer lot;

    @Column(name = "caducidad")
    public Date expirationDate;

    @Column(name = "cantidad")
    public Integer quantity;

    @Column(name = "status")
    public String status;

    @ManyToOne
    @JoinColumn(name = "idInventario", insertable = false, updatable = false)
    public Inventory inventory;

}
