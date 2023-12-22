package com.ngk.inventorybackend.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.ngk.inventorybackend.domain.repository.MedicamentRepository;
import com.ngk.inventorybackend.persistence.entity.Medicament;

@Service
public class MedicamentService {

    @Autowired
    private MedicamentRepository medicamentRepository;

    public List<Medicament> createSome(List<Medicament> medicaments) {
        return (List<Medicament>) this.medicamentRepository.createSome(medicaments);
    }
}
