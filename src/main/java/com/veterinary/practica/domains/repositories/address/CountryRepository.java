package com.veterinary.practica.domains.repositories.address;

import com.veterinary.practica.domains.entities.address.CountryEntity;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<CountryEntity, Integer> {
}
