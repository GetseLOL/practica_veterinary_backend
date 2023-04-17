package com.veterinary.practica.api.models.responses.laboratory;


import com.veterinary.practica.api.models.responses.shareds.contact.SocialNetworkResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SocialNetworksLaboratoriesResponse {
	private Long id;
	private LaboratoryResponse laboratory;
	private SocialNetworkResponse socialNetwork;
	private String url;
}
