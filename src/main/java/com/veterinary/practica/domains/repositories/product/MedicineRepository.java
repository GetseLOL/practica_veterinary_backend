package com.veterinary.practica.domains.repositories.product;

import com.veterinary.practica.api.models.responses.product.MedicineEntity;
import org.springframework.data.repository.CrudRepository;

public interface MedicineRepository extends CrudRepository<MedicineEntity, Long> {
}
