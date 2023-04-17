package com.veterinary.practica.domains.entities.brand;

import com.veterinary.practica.domains.entities.laboratory.LaboratoryEntity;
import com.veterinary.practica.domains.entities.shareds.contact.TypeTelephoneEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "telephones_brands")
public class TelephonesBrandsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_brand")
    private LaboratoryEntity laboratory;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_type_telephone")
    private TypeTelephoneEntity typeTelephone;

    @Column(length = 30, nullable = false, unique = true)
    private String phoneNumber;
}