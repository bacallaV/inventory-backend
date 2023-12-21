package com.ngk.inventorybackend.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import com.ngk.inventorybackend.persistence.entity.User;

public interface UserCrudRepository extends CrudRepository<User, Integer> {
}
