package com.veterinary.practica.api.models.responses.employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RolResponse {
	private Long id;
	private String name;
	private EmployeeResponse employee;
}
