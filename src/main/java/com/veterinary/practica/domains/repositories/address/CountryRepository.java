package com.veterinary.practica.domains.repositories.address;

import com.veterinary.practica.domains.entities.address.CountryEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CountryRepository extends CrudRepository<CountryEntity, Integer> {
	List<CountryEntity> findAllByOrderByIdAsc();
	CountryEntity findByName(String name);
}
