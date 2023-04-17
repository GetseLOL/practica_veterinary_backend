package com.veterinary.practica.domains.entities.shareds.animals;

import com.veterinary.practica.domains.entities.animals.PatientEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "allergy")
public class AllergyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 60)
    private String name;

    @ManyToMany(mappedBy = "allergies")
    private List<PatientEntity> patients = new ArrayList<>();
}
