package com.veterinary.practica.domains.repositories.animals;

import com.veterinary.practica.domains.entities.animals.PatientEntity;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<PatientEntity, Long> {
}
