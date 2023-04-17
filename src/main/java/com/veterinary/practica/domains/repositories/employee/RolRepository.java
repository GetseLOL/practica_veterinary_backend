package com.veterinary.practica.domains.repositories.employee;

import com.veterinary.practica.api.models.responses.employee.RolEntity;
import org.springframework.data.repository.CrudRepository;

public interface RolRepository extends CrudRepository<RolEntity, Long> {
}
