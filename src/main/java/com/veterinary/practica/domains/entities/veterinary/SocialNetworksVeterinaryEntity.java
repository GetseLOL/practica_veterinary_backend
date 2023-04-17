package com.veterinary.practica.domains.entities.veterinary;

import com.veterinary.practica.domains.entities.shareds.contact.SocialNetworkEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "social_networks_veterinaries")
public class SocialNetworksVeterinaryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_veterinary", nullable = false)
    private VeterinaryEntity veterinary;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_social_network", nullable = false)
    private SocialNetworkEntity socialNetwork;

    @Column(length = 250, nullable = false, unique = true)
    private String url;
}
