package com.veterinary.practica.api.models.requests.animals;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SpecieRequest {
	@Size(min = 1, max = 45, message = "The size have to a length between 1 and 45 characters")
	@NotBlank(message = "Name is required")
	private String name;
}
