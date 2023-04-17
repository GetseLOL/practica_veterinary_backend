package com.veterinary.practica.api.models.responses.animals;

import com.veterinary.practica.api.models.responses.clients.ClientEntity;
import com.veterinary.practica.api.models.responses.shareds.GenderEntity;
import com.veterinary.practica.api.models.responses.shareds.animals.AllergyEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientEntity {
	private Long id;
	private ClientEntity client;
	private String name;
	private Date dateOfBirth;
	private Short yearOld;
	private String ageMonth;
	private Float weight;
	private Float height;
	private BreedEntity breed;
	private GenderEntity gender;
	private Integer numVisits;
	private List<AllergyEntity> allergies = new ArrayList<>();
}
