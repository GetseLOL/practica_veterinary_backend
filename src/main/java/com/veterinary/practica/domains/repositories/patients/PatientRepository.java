package com.veterinary.practica.domains.repositories.patients;

import com.veterinary.practica.domains.entities.patients.PatientEntity;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<PatientEntity, Long> {
}
