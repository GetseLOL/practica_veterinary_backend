package com.veterinary.practica.domains.entities.medical;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "via_administration")
public class ViaAdministrationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, unique = true, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_medication_form", nullable = false)
    private MedicationFormEntity medicationForm;
}
