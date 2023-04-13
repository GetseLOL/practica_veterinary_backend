package com.veterinary.practica.domains.repositories.animals;

import com.veterinary.practica.domains.entities.animals.SpecieEntity;
import org.springframework.data.repository.CrudRepository;

public interface SpecieRepository extends CrudRepository<SpecieEntity, Long> {
}
