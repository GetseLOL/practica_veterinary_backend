package com.veterinary.practica.domains.entities.medical;

import com.veterinary.practica.domains.entities.shareds.GenericNameEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
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

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_medication_form", nullable = false)
    private MedicationFormEntity medicationForm;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "generic_name_via_administration",
        joinColumns = @JoinColumn(name = "id_via_administration"),
            inverseJoinColumns = @JoinColumn(name = "id_generic_name")
    )
    private List<GenericNameEntity> genericName;
}
