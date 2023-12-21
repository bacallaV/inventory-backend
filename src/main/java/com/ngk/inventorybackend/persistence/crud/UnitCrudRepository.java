package com.ngk.inventorybackend.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import com.ngk.inventorybackend.persistence.entity.Unit;

public interface UnitCrudRepository extends CrudRepository<Unit, Integer> {
}
