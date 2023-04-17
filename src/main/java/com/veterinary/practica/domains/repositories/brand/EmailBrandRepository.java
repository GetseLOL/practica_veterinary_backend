package com.veterinary.practica.domains.repositories.brand;

import com.veterinary.practica.api.models.responses.brand.EmailBrandEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmailBrandRepository extends CrudRepository<EmailBrandEntity, Long> {
}
