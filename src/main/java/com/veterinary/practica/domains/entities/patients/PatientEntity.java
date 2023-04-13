package com.veterinary.practica.domains.entities.patients;

import com.veterinary.practica.domains.entities.animals.BreedEntity;
import com.veterinary.practica.domains.entities.clients.ClientEntity;
import com.veterinary.practica.domains.entities.shareds.GenderEntity;
import com.veterinary.practica.domains.entities.shareds.allergies.AllergyEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "patient")
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_client", nullable = false)
    private ClientEntity client;

    @Column(nullable = false, length = 50)
    private String name;

    private Short yearOld;

    @Column(length = 30)
    private String ageMonth;

    @Column(length = 30, nullable = false)
    private String weight;

    @Column(length = 30, nullable = false)
    private String height;

    @ManyToOne
    @JoinColumn(name = "id_breed", nullable = false)
    private BreedEntity breed;

    @ManyToOne
    @JoinColumn(name = "id_gender", nullable = false)
    private GenderEntity gender;

    @Column(nullable = false)
    private Integer numVisits;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "allergies_patients",
            joinColumns = @JoinColumn(name = "id_patient"),
            inverseJoinColumns = @JoinColumn(name = "id_allergy")
    )
    private List<AllergyEntity> allergies = new ArrayList<>();
}
