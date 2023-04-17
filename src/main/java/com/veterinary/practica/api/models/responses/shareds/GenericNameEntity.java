package com.veterinary.practica.api.models.responses.shareds;

import com.veterinary.practica.api.models.responses.animals.BreedEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GenericNameEntity {
	private Long id;
	private String name;
	private BreedEntity breed;
}
