package com.veterinary.practica.domains.repositories.patients;

import com.veterinary.practica.domains.entities.patients.SocialNetworksPatientEntity;
import org.springframework.data.repository.CrudRepository;

public interface SocialNetworksPatientRepository extends CrudRepository<SocialNetworksPatientEntity,
        Long> {
}
