package com.veterinary.practica.api.models.requests.animals;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BreedResponse {
	private Long id;
	private String name;
	private SpecieRequest specie;
}
