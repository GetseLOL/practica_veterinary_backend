package com.veterinary.practica.api.models.responses.veterinary;

import com.veterinary.practica.api.models.responses.shareds.contact.SocialNetworkEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SocialNetworksVeterinariesEntity {
	private Long id;
	private VeterinaryEntity veterinary;
	private SocialNetworkEntity socialNetwork;
	private String url;

}
