package com.veterinary.practica.domains.entities.address;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address")
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_street", nullable = false)
    private StreetEntity street;

    @Column(length = 250, nullable = false)
    private String reference;

    @Column(length = 25, nullable = false)
    private String postal_code;

    @Column(length = 25, nullable = false)
    private String numInt;

    @Column(length = 25, nullable = false)
    private String numExt;

}
