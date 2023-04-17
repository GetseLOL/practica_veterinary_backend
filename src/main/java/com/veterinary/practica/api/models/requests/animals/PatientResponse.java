package com.veterinary.practica.api.models.requests.animals;

import com.veterinary.practica.api.models.requests.clients.ClientResponse;
import com.veterinary.practica.api.models.requests.shareds.GenderResponse;
import com.veterinary.practica.api.models.requests.shareds.animals.AllergyResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientResponse {
	private Long id;
	private ClientResponse client;
	private String name;
	private Short yearOld;
	private String ageMonth;
	private Float weight;
	private Float height;
	private BreedResponse breed;
	private GenderResponse gender;
	private Integer numVisits;
	private List<AllergyResponse> allergies = new ArrayList<>();
}
