package com.veterinary.practica.domains.entities.clients;

import com.veterinary.practica.domains.entities.shareds.SocialNetworkEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "social_networks_clients")
public class SocialNetworksClientsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_client", nullable = false)
    private ClientEntity client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_social_network", nullable = false)
    private SocialNetworkEntity socialNetwork;

    @Column(unique = true, nullable = false)
    private String url;
}
