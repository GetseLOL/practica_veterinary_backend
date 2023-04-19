package com.veterinary.practica.api.models.requests.address;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountryRequest {
	@Length(min = 4, max = 50, message = "The size have to a between 4 and 50  characters")
	@NotBlank(message = "Name is mandatory")
	private String name;
}
