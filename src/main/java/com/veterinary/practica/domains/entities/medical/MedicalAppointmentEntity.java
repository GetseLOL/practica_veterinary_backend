package com.veterinary.practica.domains.entities.medical;

import com.veterinary.practica.domains.entities.clients.ClientEntity;
import com.veterinary.practica.domains.entities.patients.PatientEntity;
import com.veterinary.practica.domains.entities.veterinary.VeterinaryEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "medical_appointment")
public class MedicalAppointmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
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
