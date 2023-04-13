package com.veterinary.practica.domains.entities.clients;

import com.veterinary.practica.domains.entities.address.AddressEntity;
import com.veterinary.practica.domains.entities.shareds.GenderEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "client")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 25, nullable = false)
    private String firstName;

    @Column(length = 25, nullable = false)
    private String lastName;

    @Column(length = 25)
    private String secondLastName;

    @OneToOne
    @JoinColumn(name = "id_email_client", nullable = false, unique = true)
    private EmailClientEntity emailClient;

    @OneToOne
    @JoinColumn(name = "id_gender", nullable = false)
    private GenderEntity gender;

    @ManyToOne
    @JoinColumn(name = "id_address", nullable = false)
    private AddressEntity address;
}
