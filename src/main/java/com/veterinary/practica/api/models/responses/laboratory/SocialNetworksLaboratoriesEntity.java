package com.veterinary.practica.api.models.responses.laboratory;


import com.veterinary.practica.api.models.responses.shareds.contact.SocialNetworkEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SocialNetworksLaboratoriesEntity {
	private Long id;
	private LaboratoryEntity laboratory;
	private SocialNetworkEntity socialNetwork;
	private String url;
}
