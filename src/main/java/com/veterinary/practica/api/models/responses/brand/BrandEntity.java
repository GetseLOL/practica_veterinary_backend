package com.veterinary.practica.api.models.responses.brand;

import com.veterinary.practica.api.models.responses.address.CountryEntity;
import com.veterinary.practica.api.models.responses.laboratory.LaboratoryEntity;
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
public class BrandEntity {
	private Long id;
	private String rfc;
	private String name;
	private Date registration;
	private CountryEntity country;
	private EmailBrandEntity email;
	private List<LaboratoryEntity> laboratories;
}
