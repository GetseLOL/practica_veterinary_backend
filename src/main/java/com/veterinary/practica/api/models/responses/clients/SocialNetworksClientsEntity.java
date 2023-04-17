package com.veterinary.practica.api.models.responses.clients;

import com.veterinary.practica.api.models.responses.shareds.contact.SocialNetworkEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocialNetworksClientsEntity {
	private Integer id;
	private ClientEntity client;
	private SocialNetworkEntity socialNetwork;
	private String url;
}
