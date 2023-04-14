package com.veterinary.practica.domains.repositories.medical;

import com.veterinary.practica.domains.entities.medical.MedicationFormEntity;
import org.springframework.data.repository.CrudRepository;

public interface MedicationFormRepository extends CrudRepository<MedicationFormEntity, Integer> {
}
