package com.veterinary.practica.domains.repositories.veterinary;

import com.veterinary.practica.domains.entities.veterinary.VeterinaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinaryRepository extends JpaRepository<VeterinaryEntity, Long> {
}
