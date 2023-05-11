package com.veterinary.practica.domains.repositories.address;

import com.veterinary.practica.domains.entities.address.MunicipalityEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MunicipalityRepository extends CrudRepository<MunicipalityEntity, Long> {
    List<MunicipalityEntity> findByName(String name);
}
