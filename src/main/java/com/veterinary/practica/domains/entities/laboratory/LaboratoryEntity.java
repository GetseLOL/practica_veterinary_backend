package com.veterinary.practica.domains.entities.laboratory;

import com.veterinary.practica.domains.entities.address.CountryEntity;
import com.veterinary.practica.domains.entities.brand.BrandEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "laboratory")
public class LaboratoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, unique = true, nullable = false)
    private String laboratoryCode;

    @Column(length = 100, nullable = false, unique = true)
    private String name;

    @Column(length = 13, nullable = false, unique = true)
    private String rfc;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(nullable = false, name = "id_country")
    private CountryEntity country;

    @OneToOne(fetch = FetchType.LAZY)
    @Column(nullable = false, name = "id_email_laboratory")
    private EmailsLaboratoriesEntity emailLaboratory;

    @ManyToMany(mappedBy = "laboratories")
    private List<BrandEntity> laboratories;

}
