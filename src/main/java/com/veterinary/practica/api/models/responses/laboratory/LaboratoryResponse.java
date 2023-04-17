package com.veterinary.practica.api.models.responses.laboratory;

import com.veterinary.practica.api.models.responses.address.CountryResponse;
import com.veterinary.practica.api.models.responses.brand.BrandResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class LaboratoryResponse {
	private Long id;
	private String laboratoryCode;
	private String name;
	private String rfc;
	private CountryResponse country;
	private EmailsLaboratoriesResponse emailLaboratory;
	private List<BrandResponse> laboratories;

}
