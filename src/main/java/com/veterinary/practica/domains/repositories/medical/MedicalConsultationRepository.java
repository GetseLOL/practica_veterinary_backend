package com.veterinary.practica.domains.repositories.medical;

import com.veterinary.practica.domains.entities.medical.MedicalConsultationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MedicalConsultationRepository extends JpaRepository<MedicalConsultationEntity,
        UUID> {
}
