package com.veterinary.practica.api.models.requests.employee;

import com.veterinary.practica.api.models.requests.clients.TelephonesClientsResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TelephonesEmployeesResponse {
	private Long id;
	private EmployeeResponse employee;
	private TelephonesClientsResponse telephonesClients;
	private String phoneNumber;
}
