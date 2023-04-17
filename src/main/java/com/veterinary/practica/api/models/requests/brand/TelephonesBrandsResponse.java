package com.veterinary.practica.api.models.requests.brand;

import com.veterinary.practica.api.models.requests.laboratory.LaboratoryResponse;
import com.veterinary.practica.api.models.requests.shareds.contact.TypeTelephoneResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TelephonesBrandsResponse {
	private Long id;
	private LaboratoryResponse laboratory;
	private TypeTelephoneResponse typeTelephone;
	private String phoneNumber;
}
