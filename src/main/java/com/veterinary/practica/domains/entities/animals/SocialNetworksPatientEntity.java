package com.veterinary.practica.domains.entities.animals;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "social_networks_patients")
public class SocialNetworksPatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_patient", nullable = false)
    private PatientEntity patient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_social_network", nullable = false)
    private SocialNetworksPatientEntity socialNetworksPatient;

    @Column(length = 250, nullable = false, unique = true)
    private String url;

}
