package com.veterinary.practica.api.models.requests.address;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StateCountryResponse {
	private Long id;
	private String name;
	private CountryRequest country;
}
