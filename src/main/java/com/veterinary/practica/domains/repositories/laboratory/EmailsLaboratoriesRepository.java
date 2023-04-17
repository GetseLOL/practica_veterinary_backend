package com.veterinary.practica.domains.repositories.laboratory;

import com.veterinary.practica.api.models.responses.laboratory.EmailsLaboratoriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailsLaboratoriesRepository extends JpaRepository<EmailsLaboratoriesEntity, Long> {
}
