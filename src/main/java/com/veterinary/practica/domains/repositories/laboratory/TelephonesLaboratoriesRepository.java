package com.veterinary.practica.domains.repositories.laboratory;

import com.veterinary.practica.api.models.responses.laboratory.TelephonesLaboratoriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelephonesLaboratoriesRepository extends JpaRepository<TelephonesLaboratoriesEntity, Long> {
}
