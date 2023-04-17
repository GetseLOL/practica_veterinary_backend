package com.veterinary.practica.domains.repositories.shared.animals;

import com.veterinary.practica.domains.entities.shareds.animals.AllergyEntity;
import org.springframework.data.repository.CrudRepository;

public interface AllergyRepository extends CrudRepository<AllergyEntity, Long> {
}
