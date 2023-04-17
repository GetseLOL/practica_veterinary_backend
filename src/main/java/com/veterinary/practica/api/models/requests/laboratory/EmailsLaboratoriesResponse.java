package com.veterinary.practica.api.models.requests.laboratory;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmailsLaboratoriesResponse {
	private Long id;
	private String email;
	private LaboratoryResponse laboratory;
}
