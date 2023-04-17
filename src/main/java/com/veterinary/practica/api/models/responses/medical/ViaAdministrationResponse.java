package com.veterinary.practica.api.models.responses.medical;

import com.veterinary.practica.api.models.responses.shareds.GenericNameResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ViaAdministrationResponse {
	private Integer id;
	private String name;
	private MedicationFormResponse medicationForm;
	private List<GenericNameResponse> genericName;
}
