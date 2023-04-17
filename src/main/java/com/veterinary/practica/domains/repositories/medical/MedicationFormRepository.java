package com.veterinary.practica.domains.repositories.medical;

import com.veterinary.practica.api.models.responses.medical.MedicationFormEntity;
import org.springframework.data.repository.CrudRepository;

public interface MedicationFormRepository extends CrudRepository<MedicationFormEntity, Integer> {
}
