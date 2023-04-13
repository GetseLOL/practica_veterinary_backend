package com.veterinary.practica.domains.repositories.employee;

import com.veterinary.practica.domains.entities.employee.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
