package com.veterinary.practica.domains.repositories.clients;

import com.veterinary.practica.domains.entities.clients.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
}
