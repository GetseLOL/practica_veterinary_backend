package com.veterinary.practica.api.models.responses.medical;

import com.veterinary.practica.api.models.responses.animals.PatientEntity;
import com.veterinary.practica.api.models.responses.veterinary.VeterinaryEntity;
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
public class MedicalAppointmentEntity {
	private UUID id;
	private VeterinaryEntity veterinary;
	private PatientEntity patient;
	private Date consultationDate;
	private Boolean communityService;
	private BigDecimal payment;
	private MedicalConsultationEntity medicalConsultation;
}
