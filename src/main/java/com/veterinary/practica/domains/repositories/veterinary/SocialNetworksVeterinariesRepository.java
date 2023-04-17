package com.veterinary.practica.domains.repositories.veterinary;

import com.veterinary.practica.domains.repositories.animals.SocialNetworksPatientRepository;
import org.springframework.data.repository.CrudRepository;

public interface SocialNetworksVeterinariesRepository extends CrudRepository<SocialNetworksPatientRepository,
        Long> {
}
