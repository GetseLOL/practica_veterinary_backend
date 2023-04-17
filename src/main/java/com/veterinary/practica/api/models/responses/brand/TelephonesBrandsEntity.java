package com.veterinary.practica.api.models.responses.brand;

import com.veterinary.practica.api.models.responses.laboratory.LaboratoryEntity;
import com.veterinary.practica.api.models.responses.shareds.contact.TypeTelephoneEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TelephonesBrandsEntity {
	private Long id;
	private LaboratoryEntity laboratory;
	private TypeTelephoneEntity typeTelephone;
	private String phoneNumber;
}
