package com.veterinary.practica.api.models.responses.veterinary;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpecialityResponse {
	private Long id;
	private String name;
}
