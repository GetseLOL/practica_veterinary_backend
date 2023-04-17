package com.veterinary.practica.domains.repositories.laboratory;

import com.veterinary.practica.domains.entities.laboratory.LaboratoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaboratoryRepository extends JpaRepository<LaboratoryEntity, Long> {}
