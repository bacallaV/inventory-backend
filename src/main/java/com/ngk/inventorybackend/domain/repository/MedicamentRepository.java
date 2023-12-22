package com.ngk.inventorybackend.domain.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.ngk.inventorybackend.persistence.crud.MedicamentCrudRepository;
import com.ngk.inventorybackend.persistence.entity.Medicament;

@Repository
public class MedicamentRepository {
    @Autowired
    private MedicamentCrudRepository medicamentCrudRepository;

    public List<Medicament> createSome(List<Medicament> medicaments) {
        return (List<Medicament>) this.medicamentCrudRepository.saveAll(medicaments);
    }
}
