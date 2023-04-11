package com.veterinary.practica.domains.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "address")
public class AddressEntity {
    @Id
    @Column(name = "id_address")
    private Long id;
    @Column(nullable = false)
    private Long idStreet;
    @Column(length = 250)
    private String reference;
    @Column(length = 25, nullable = false)
    private String postalCode;
    @Column(length = 25, nullable = false)
    private String numInt;
    @Column(length = 25)
    private String numExt;

}
