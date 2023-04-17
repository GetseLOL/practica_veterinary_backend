package com.veterinary.practica.domains.repositories.veterinary;

import com.veterinary.practica.api.models.responses.veterinary.SpecialityEntity;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<SpecialityEntity, Long> {
}
