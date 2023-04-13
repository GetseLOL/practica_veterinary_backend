package com.veterinary.practica.domains.repositories.medical;

import com.veterinary.practica.domains.entities.medical.MedicalAppointmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MedicalAppointmentRepository extends JpaRepository<MedicalAppointmentEntity, UUID> {
}
