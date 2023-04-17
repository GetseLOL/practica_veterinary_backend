package com.veterinary.practica.domains.repositories.address;

import com.veterinary.practica.api.models.responses.address.StateCountryEntity;
import org.springframework.data.repository.CrudRepository;

public interface StateCountryRepository extends CrudRepository<StateCountryEntity, Long> {
}
