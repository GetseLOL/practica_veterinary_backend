package com.veterinary.practica.api.models.requests.shareds;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GenderRequest {
	@Length(min = 1, max = 50)
	@NotBlank(message = "Name is mandatory")
	private String name;
}
