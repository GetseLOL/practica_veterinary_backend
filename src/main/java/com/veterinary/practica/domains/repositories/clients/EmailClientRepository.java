package com.veterinary.practica.domains.repositories.clients;

import com.veterinary.practica.api.models.responses.clients.EmailClientEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmailClientRepository extends CrudRepository<EmailClientEntity, Long> {
}
