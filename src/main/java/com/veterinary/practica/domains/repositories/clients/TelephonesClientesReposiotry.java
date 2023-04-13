package com.veterinary.practica.domains.repositories.clients;

import com.veterinary.practica.domains.entities.clients.TelephonesClientsEntity;
import org.springframework.data.repository.CrudRepository;

public interface TelephonesClientesReposiotry extends CrudRepository<TelephonesClientsEntity, Long> {
}
