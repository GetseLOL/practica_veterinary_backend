package com.veterinary.practica.api.models.responses.laboratory;

import com.veterinary.practica.api.models.responses.address.CountryEntity;
import com.veterinary.practica.api.models.responses.brand.BrandEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class LaboratoryEntity {
	private Long id;
	private String laboratoryCode;
	private String name;
	private String rfc;
	private CountryEntity country;
	private EmailsLaboratoriesEntity emailLaboratory;
	private List<BrandEntity> laboratories;

}
