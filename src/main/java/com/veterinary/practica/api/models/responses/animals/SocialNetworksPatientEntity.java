package com.veterinary.practica.api.models.responses.animals;

import com.veterinary.practica.api.models.responses.shareds.contact.SocialNetworkEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocialNetworksPatientEntity {
	private Long id;
	private PatientEntity patient;
	private SocialNetworkEntity socialNetwork;
	private String url;

}
