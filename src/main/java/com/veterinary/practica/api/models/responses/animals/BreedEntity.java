package com.veterinary.practica.api.models.responses.animals;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BreedEntity {
	private Long id;
	private String name;
	private SpecieEntity specie;
}
