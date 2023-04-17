package com.veterinary.practica.domains.repositories.shared.products;

import com.veterinary.practica.domains.entities.shareds.products.ExpirationEntity;
import org.springframework.data.repository.CrudRepository;

public interface ExpirationRepository extends CrudRepository<ExpirationEntity, Long> {
}
