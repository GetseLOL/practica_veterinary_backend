package com.veterinary.practica.domains.repositories.address;

import com.veterinary.practica.domains.entities.address.StateCountryEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StateCountryRepository extends CrudRepository<StateCountryEntity, Long> {
    List<StateCountryEntity> findByName(String name);
}
