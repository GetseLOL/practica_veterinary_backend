package com.veterinary.practica.domains.repositories.animals;

import com.veterinary.practica.domains.entities.animals.BreedEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BreedRepository extends JpaRepository<BreedEntity, Long> {
}
