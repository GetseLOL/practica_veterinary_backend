package com.veterinary.practica.domains.repositories.brand;

import com.veterinary.practica.api.models.responses.brand.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<BrandEntity, Long> {
}
