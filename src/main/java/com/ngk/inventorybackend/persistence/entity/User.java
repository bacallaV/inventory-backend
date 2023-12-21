package com.ngk.inventorybackend.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
@Table(name = "Usuario")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(name = "nombre")
    public String name;

    @Column(name = "apellido_materno")
    public String firstLastName;

    @Column(name = "apellido_paterno")
    public String secondLastName;

    @Column(name = "correo")
    public String email;

    @Column(name = "contrasena")
    public String password;
}
