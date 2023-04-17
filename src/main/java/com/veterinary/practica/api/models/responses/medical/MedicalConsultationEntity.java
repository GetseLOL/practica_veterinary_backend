package com.veterinary.practica.api.models.responses.medical;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicalConsultationEntity {
	private UUID id;
	private MedicalAppointmentEntity medicalAppointment;
	private String description;
	private Timestamp startTime;
	private Timestamp endTime;
	private Timestamp nextConsultation;
}
