package com.veterinary.practica.domains.repositories.employee;

import com.veterinary.practica.api.models.responses.employee.TelephonesEmployeesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelephonesEmployeesRepository extends JpaRepository<TelephonesEmployeesEntity,
        Long> {
}
