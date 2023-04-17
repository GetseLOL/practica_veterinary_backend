package com.veterinary.practica.api.models.requests.brand;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmailBrandResponse {
	private Long id;
	private String email;
	private BrandResponse brand;
}
