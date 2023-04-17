package com.veterinary.practica.api.models.requests.medical;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicationFormResponse {
	private Integer id;
	private String name;
}
