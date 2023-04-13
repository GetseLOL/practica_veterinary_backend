package com.veterinary.practica.domains.repositories.address;

import com.veterinary.practica.domains.entities.address.ColonyEntity;
import org.springframework.data.repository.CrudRepository;

public interface ColonyRepository extends CrudRepository<ColonyEntity, Long> {
}
