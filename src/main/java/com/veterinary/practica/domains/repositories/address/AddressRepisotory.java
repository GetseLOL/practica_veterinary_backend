package com.veterinary.practica.domains.repositories.address;

import com.veterinary.practica.domains.entities.address.StreetEntity;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepisotory extends CrudRepository<StreetEntity, Long> {
}
