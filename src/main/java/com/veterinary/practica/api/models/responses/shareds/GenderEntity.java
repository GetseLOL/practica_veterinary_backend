package com.veterinary.practica.api.models.responses.shareds;

import com.veterinary.practica.api.models.responses.clients.ClientEntity;
import com.veterinary.practica.api.models.responses.employee.EmployeeEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GenderEntity {
	private Long id;
	private String name;
	private ClientEntity client;
	private EmployeeEntity employee;
}
