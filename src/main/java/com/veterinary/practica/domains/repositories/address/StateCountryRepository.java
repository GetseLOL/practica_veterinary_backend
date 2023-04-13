package com.veterinary.practica.domains.repositories.address;

import com.veterinary.practica.domains.entities.address.StateCountryEntity;
import org.springframework.data.repository.CrudRepository;

public interface StateCountryRepository extends CrudRepository<StateCountryEntity, Long> {
}
