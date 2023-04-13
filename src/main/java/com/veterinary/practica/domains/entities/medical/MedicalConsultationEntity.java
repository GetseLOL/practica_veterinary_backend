package com.veterinary.practica.domains.entities.medical;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "medical_consultation")
public class MedicalConsultationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_medical_appointment")
    private MedicalAppointmentEntity medicalAppointment;

    private String descripcion;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date consultationDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date nextConsultation;

}
