package com.veterinary.practica.domains.repositories.medical;

import com.veterinary.practica.api.models.responses.medical.ViaAdministrationEntity;
import org.springframework.data.repository.CrudRepository;

public interface ViaAdministrationRepository extends CrudRepository<ViaAdministrationEntity, Long> {
}
