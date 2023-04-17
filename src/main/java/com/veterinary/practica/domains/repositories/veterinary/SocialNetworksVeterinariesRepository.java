package com.veterinary.practica.domains.repositories.veterinary;

import com.veterinary.practica.domains.entities.animals.SocialNetworksPatientEntity;
import org.springframework.data.repository.CrudRepository;

public interface SocialNetworksVeterinariesRepository extends CrudRepository<SocialNetworksPatientEntity, Long> {}
