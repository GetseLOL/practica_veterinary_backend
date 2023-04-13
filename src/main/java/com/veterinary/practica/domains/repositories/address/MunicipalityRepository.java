package com.veterinary.practica.domains.repositories.address;

import com.veterinary.practica.domains.entities.address.MunicipalityEntity;
import org.springframework.data.repository.CrudRepository;

public interface MunicipalityRepository extends CrudRepository<MunicipalityEntity, Long> {
}
