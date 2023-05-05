package com.veterinary.practica.api.models.requests.address;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ColonyRequest {
	@Length(min = 4, max = 100, message = "The size have to a between 4 and 100 characters")
	@NotBlank(message = "The name is mandatory")
	private String name;
	@Positive(message = "The number is positive required")
	@Min(value = 1)
	@Digits(integer = 20, fraction = 0, message = "The number is mandatory")
	@NotNull(message = "The id is mandatory")
	private Long municipality;
}
