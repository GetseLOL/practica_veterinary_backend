package com.veterinary.practica.domains.repositories.address;

import com.veterinary.practica.domains.entities.address.ColonyEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ColonyRepository extends CrudRepository<ColonyEntity, Long> {
    List<ColonyEntity> findByName(String name);
    ColonyEntity findByNameAndMunicipalityName(String colonyRequest, String municipalityRequest);
}
