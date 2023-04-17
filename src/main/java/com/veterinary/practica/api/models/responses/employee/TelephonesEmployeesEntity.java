package com.veterinary.practica.api.models.responses.employee;

import com.veterinary.practica.api.models.responses.clients.TelephonesClientsEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TelephonesEmployeesEntity {
	private Long id;
	private EmployeeEntity employee;
	private TelephonesClientsEntity telephonesClients;
	private String phoneNumber;
}
