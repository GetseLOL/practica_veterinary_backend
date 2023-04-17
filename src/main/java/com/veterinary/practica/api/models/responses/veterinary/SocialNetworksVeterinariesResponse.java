package com.veterinary.practica.api.models.responses.veterinary;

import com.veterinary.practica.api.models.responses.shareds.contact.SocialNetworkResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SocialNetworksVeterinariesResponse {
	private Long id;
	private VeterinaryResponse veterinary;
	private SocialNetworkResponse socialNetwork;
	private String url;
}
