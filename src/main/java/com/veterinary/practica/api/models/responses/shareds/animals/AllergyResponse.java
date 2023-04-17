package com.veterinary.practica.api.models.responses.shareds.animals;

import com.veterinary.practica.api.models.responses.animals.PatientResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AllergyResponse {
	private Long id;
	private String name;
	private List<PatientResponse> patients = new ArrayList<>();
}
