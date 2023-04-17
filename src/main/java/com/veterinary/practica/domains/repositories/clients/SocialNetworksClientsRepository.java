package com.veterinary.practica.domains.repositories.clients;

import com.veterinary.practica.api.models.responses.clients.SocialNetworksClientsEntity;
import org.springframework.data.repository.CrudRepository;

public interface SocialNetworksClientsRepository extends CrudRepository<SocialNetworksClientsEntity, Integer> {
}
