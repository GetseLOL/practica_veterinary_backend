package com.veterinary.practica.domains.repositories.clients;

import com.veterinary.practica.api.models.responses.clients.TelephonesClientsEntity;
import org.springframework.data.repository.CrudRepository;

public interface TelephonesClientsRepository extends CrudRepository<TelephonesClientsEntity, Long> {
}
