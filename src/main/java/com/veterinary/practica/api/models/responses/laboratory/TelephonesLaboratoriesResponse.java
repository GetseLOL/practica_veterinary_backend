package com.veterinary.practica.api.models.responses.laboratory;

import com.veterinary.practica.api.models.responses.shareds.contact.TypeTelephoneResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TelephonesLaboratoriesResponse {
	private Long id;
	private LaboratoryResponse laboratory;
	private TypeTelephoneResponse typeTelephone;
	private String phoneNumber;
}
