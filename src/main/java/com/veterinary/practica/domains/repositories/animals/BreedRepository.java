package com.veterinary.practica.domains.repositories.animals;

import com.veterinary.practica.domains.entities.animals.BreedEntity;
import org.springframework.data.repository.CrudRepository;

public interface BreedRepository extends CrudRepository<BreedEntity, Long> {
}
