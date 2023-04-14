package com.veterinary.practica.domains.entities.veterinary;

import com.veterinary.practica.domains.entities.shareds.SocialNetworkEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "social_networks_veterinaries")
public class SocialNetworksVeterinariesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_veterinary", nullable = false)
    private VeterinaryEntity veterinary;

    @ManyToOne
    @JoinColumn(name = "id_social_network", nullable = false)
    private SocialNetworkEntity socialNetwork;

    @Column(length = 250, nullable = false)
    private String url;

}
