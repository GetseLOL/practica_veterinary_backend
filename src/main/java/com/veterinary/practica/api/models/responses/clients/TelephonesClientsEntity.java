package com.veterinary.practica.api.models.responses.clients;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TelephonesClientsEntity {
	private Long id;
	private ClientEntity client;
	private TelephonesClientsEntity telephonesClients;
	private String phoneNumber;
}
