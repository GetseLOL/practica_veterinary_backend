package com.veterinary.practica.api.models.responses.animals;

import com.veterinary.practica.api.models.responses.clients.ClientResponse;
import com.veterinary.practica.api.models.responses.shareds.GenderResponse;
import com.veterinary.practica.api.models.responses.shareds.animals.AllergyResponse;
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
