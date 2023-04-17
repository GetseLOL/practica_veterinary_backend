package com.veterinary.practica.domains.entities.medical;

import jakarta.persistence.*;
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
@Entity
@Table(name = "medical_consultation")
public class MedicalConsultationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(length = 60)
    private UUID id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_medical_appointment")
    private MedicalAppointmentEntity medicalAppointment;

    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Timestamp startTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp endTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Timestamp nextConsultation;

}
