package com.ngk.inventorybackend.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import com.ngk.inventorybackend.persistence.entity.Medicament;

public interface MedicamentCrudRepository extends CrudRepository<Medicament, Integer> {
}
