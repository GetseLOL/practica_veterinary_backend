package com.veterinary.practica.domains.repositories.brand;

import com.veterinary.practica.api.models.responses.brand.TelephonesBrandsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelephonesBrandsRepository extends JpaRepository<TelephonesBrandsEntity, Long> {
}
