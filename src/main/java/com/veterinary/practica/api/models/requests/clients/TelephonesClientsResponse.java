package com.veterinary.practica.api.models.requests.clients;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TelephonesClientsResponse {
	private Long id;
	private ClientResponse client;
	private TelephonesClientsResponse telephonesClients;
	private String phoneNumber;
}
