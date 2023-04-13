package com.veterinary.practica.domains.repositories.shared;

import com.veterinary.practica.domains.entities.shareds.GenderEntity;
import org.springframework.data.repository.CrudRepository;

public interface GenderRepository extends CrudRepository<GenderEntity, Long> {
}
