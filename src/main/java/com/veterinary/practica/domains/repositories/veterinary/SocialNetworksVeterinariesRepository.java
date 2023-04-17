package com.veterinary.practica.domains.repositories.veterinary;

import com.veterinary.practica.api.models.responses.veterinary.SocialNetworksVeterinariesEntity;
import org.springframework.data.repository.CrudRepository;

public interface SocialNetworksVeterinariesRepository extends CrudRepository<SocialNetworksVeterinariesEntity,
        Long> {
}
