package com.veterinary.practica.domains.repositories.shared.products;

import com.veterinary.practica.api.models.responses.shareds.products.ExpirationEntity;
import org.springframework.data.repository.CrudRepository;

public interface ExpirationRepository extends CrudRepository<ExpirationEntity, Long> {
}
