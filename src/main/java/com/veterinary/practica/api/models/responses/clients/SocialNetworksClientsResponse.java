package com.veterinary.practica.api.models.responses.clients;

import com.veterinary.practica.api.models.responses.shareds.contact.SocialNetworkResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocialNetworksClientsResponse {
	private Integer id;
	private ClientResponse client;
	private SocialNetworkResponse socialNetwork;
	private String url;
}