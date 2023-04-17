package com.veterinary.practica.api.models.responses.brand;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmailBrandEntity {
	private Long id;
	private String email;
	private BrandEntity brand;
}
