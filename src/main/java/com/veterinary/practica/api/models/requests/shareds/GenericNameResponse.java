package com.veterinary.practica.api.models.requests.shareds;

import com.veterinary.practica.api.models.requests.animals.BreedResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GenericNameResponse {
	private Long id;
	private String name;
	private BreedResponse breed;
}
