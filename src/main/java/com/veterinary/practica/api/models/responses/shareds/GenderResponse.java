package com.veterinary.practica.api.models.responses.shareds;

import com.veterinary.practica.api.models.responses.clients.ClientResponse;
import com.veterinary.practica.api.models.responses.employee.EmployeeResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GenderResponse {
	private Long id;
	private String name;
	private ClientResponse client;
	private EmployeeResponse employee;
}
