package com.veterinary.practica.api.models.responses.employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RolEntity {
	private Long id;
	private String name;
	private EmployeeEntity employee;
}
