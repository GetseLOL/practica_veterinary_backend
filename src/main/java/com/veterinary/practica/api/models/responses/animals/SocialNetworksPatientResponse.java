package com.veterinary.practica.api.models.responses.animals;

import com.veterinary.practica.api.models.responses.shareds.contact.SocialNetworkResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocialNetworksPatientResponse {
	private Long id;
	private PatientResponse patient;
	private SocialNetworkResponse socialNetwork;
	private String url;
}
