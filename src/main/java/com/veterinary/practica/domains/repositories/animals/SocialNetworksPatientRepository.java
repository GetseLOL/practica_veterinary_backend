package com.veterinary.practica.domains.repositories.animals;

import com.veterinary.practica.api.models.responses.animals.SocialNetworksPatientEntity;
import org.springframework.data.repository.CrudRepository;

public interface SocialNetworksPatientRepository extends CrudRepository<SocialNetworksPatientEntity,
        Long> {
}
