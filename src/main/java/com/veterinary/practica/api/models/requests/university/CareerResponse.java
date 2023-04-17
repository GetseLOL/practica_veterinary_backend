package com.veterinary.practica.api.models.requests.university;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CareerResponse {
	private Integer id;
	private String name;
	private UniversityResponse university;
}
