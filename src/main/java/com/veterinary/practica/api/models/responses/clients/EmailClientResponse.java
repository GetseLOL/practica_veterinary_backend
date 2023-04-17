package com.veterinary.practica.api.models.responses.clients;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmailClientResponse {
	private Long id;
	private String email;
	private ClientResponse client;
}
