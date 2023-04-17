package com.veterinary.practica.api.models.requests.brand;

import com.veterinary.practica.api.models.requests.address.CountryResponse;
import com.veterinary.practica.api.models.requests.laboratory.LaboratoryResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BrandResponse {
	private Long id;
	private String rfc;
	private String name;
	private Date registration;
	private CountryResponse country;
	private EmailBrandResponse email;
	private List<LaboratoryResponse> laboratories;
}
