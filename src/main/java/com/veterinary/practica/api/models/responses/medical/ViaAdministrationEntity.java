package com.veterinary.practica.api.models.responses.medical;

import com.veterinary.practica.api.models.responses.shareds.GenericNameEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ViaAdministrationEntity {
	private Integer id;
	private String name;
	private MedicationFormEntity medicationForm;
	private List<GenericNameEntity> genericName;
}
