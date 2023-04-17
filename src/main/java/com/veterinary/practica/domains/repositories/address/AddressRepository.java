package com.veterinary.practica.domains.repositories.address;

import com.veterinary.practica.api.models.responses.address.StreetEntity;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<StreetEntity, Long> {
}
