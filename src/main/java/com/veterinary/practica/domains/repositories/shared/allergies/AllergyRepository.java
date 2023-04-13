package com.veterinary.practica.domains.repositories.shared.allergies;

import com.veterinary.practica.domains.entities.shareds.allergies.AllergyEntity;
import org.springframework.data.repository.CrudRepository;

public interface AllergyRepository extends CrudRepository<AllergyEntity, Long> {
}
