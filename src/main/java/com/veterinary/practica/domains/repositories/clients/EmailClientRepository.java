package com.veterinary.practica.domains.repositories.clients;

import com.veterinary.practica.domains.entities.clients.EmailClientEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmailClientRepository extends CrudRepository<EmailClientEntity, Long> {
}
