package com.veterinary.practica.domains.repositories.university;

import com.veterinary.practica.domains.entities.university.CareerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CareerRepository extends CrudRepository<CareerEntity, Integer> {
}
