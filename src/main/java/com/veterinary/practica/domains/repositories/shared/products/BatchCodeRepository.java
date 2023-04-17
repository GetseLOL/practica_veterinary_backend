package com.veterinary.practica.domains.repositories.shared.products;

import com.veterinary.practica.api.models.responses.shareds.products.BatchCodeEntity;
import org.springframework.data.repository.CrudRepository;

public interface BatchCodeRepository extends CrudRepository<BatchCodeEntity, String> {
}
