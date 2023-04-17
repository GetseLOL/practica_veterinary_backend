package com.veterinary.practica.domains.repositories.address;

import com.veterinary.practica.api.models.responses.address.MunicipalityEntity;
import org.springframework.data.repository.CrudRepository;

public interface MunicipalityRepository extends CrudRepository<MunicipalityEntity, Long> {
}
