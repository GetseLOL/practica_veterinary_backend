package com.veterinary.practica.domains.repositories.address;

import com.veterinary.practica.api.models.responses.address.StreetEntity;
import org.springframework.data.repository.CrudRepository;

public interface StreetRepository extends CrudRepository<StreetEntity, Long> {
}
