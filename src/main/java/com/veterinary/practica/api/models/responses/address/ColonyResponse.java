package com.veterinary.practica.api.models.responses.address;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ColonyResponse {
	private Long id;
	private String name;
	private MunicipalityResponse municipality;
}
