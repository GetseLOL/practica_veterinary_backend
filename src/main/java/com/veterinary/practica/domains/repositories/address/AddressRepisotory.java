package com.veterinary.practica.domains.repositories.address;

import com.veterinary.practica.domains.entities.address.StreetEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AddressRepisotory extends CrudRepository<StreetEntity, Long> {
    List<AddressRepisotory> findByNameAndColonyName(String nameAddress, String nameColony);
}
