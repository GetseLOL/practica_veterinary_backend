package com.veterinary.practica.api.models.requests.animals;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BreedRequest {
	@Length(min = 1, max = 45)
	@NotBlank(message = "Name is mandatory")
	private String name;
	@Positive
	@NotNull(message = "Id specie is mandatory")
	private Long specie;
}
