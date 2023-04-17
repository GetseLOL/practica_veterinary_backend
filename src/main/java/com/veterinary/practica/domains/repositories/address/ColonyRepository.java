package com.veterinary.practica.domains.repositories.address;

import com.veterinary.practica.api.models.responses.address.ColonyEntity;
import org.springframework.data.repository.CrudRepository;

public interface ColonyRepository extends CrudRepository<ColonyEntity, Long> {
}
