package com.veterinary.practica.domains.repositories.employee;

import com.veterinary.practica.api.models.responses.employee.EmailEmployeeEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmailEmployeeRepository extends CrudRepository<EmailEmployeeEntity, Long> {
}
