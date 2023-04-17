package com.veterinary.practica.api.models.requests.medical;

import com.veterinary.practica.api.models.requests.animals.PatientResponse;
import com.veterinary.practica.api.models.requests.veterinary.VeterinaryResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicalAppointmentResponse {
	private UUID id;
	private VeterinaryResponse veterinary;
	private PatientResponse patient;
	private Date consultationDate;
	private Boolean communityService;
	private BigDecimal payment;
	private MedicalConsultationResponse medicalConsultation;
}
