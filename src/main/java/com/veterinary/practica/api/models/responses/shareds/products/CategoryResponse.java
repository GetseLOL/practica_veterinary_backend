package com.veterinary.practica.api.models.responses.shareds.products;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CategoryResponse {
	private Long id;
	private String name;
}
