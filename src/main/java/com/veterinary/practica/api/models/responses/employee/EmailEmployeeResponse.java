package com.veterinary.practica.api.models.responses.employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailEmployeeResponse {
	private Long id;
	private String email;
	private EmployeeResponse employee;
}
