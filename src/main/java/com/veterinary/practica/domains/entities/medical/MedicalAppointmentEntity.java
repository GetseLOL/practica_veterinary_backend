package com.veterinary.practica.domains.entities.medical;

import com.veterinary.practica.domains.entities.animals.PatientEntity;
import com.veterinary.practica.domains.entities.veterinary.VeterinaryEntity;
import jakarta.persistence.*;
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
@Entity
@Table(name = "medical_appointment")
public class MedicalAppointmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(length = 60)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "id_veterinary", nullable = false)
    private VeterinaryEntity veterinary;

    @ManyToOne
    @JoinColumn(name = "id_patient", nullable = false)
    private PatientEntity patient;

    @Temporal(TemporalType.TIMESTAMP)
    private Date consultationDate;

    @Column(nullable = false)
    private Boolean communityService;

    @Column(nullable = false)
    private BigDecimal payment;

    @OneToOne(mappedBy = "medicalAppointment")
    private MedicalConsultationEntity medicalConsultation;
}
