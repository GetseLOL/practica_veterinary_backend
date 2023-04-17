package com.veterinary.practica.domains.repositories.university;

import com.veterinary.practica.domains.entities.university.UniversityEntity;
import org.springframework.data.repository.CrudRepository;

public interface UniversityRepository extends CrudRepository<UniversityEntity, Integer> {
}
