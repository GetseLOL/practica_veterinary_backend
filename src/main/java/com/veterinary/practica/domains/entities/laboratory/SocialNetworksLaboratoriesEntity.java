package com.veterinary.practica.domains.entities.laboratory;


import com.veterinary.practica.domains.entities.shareds.contact.SocialNetworkEntity;
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
@Table(name = "social_networks_laboratories")
public class SocialNetworksLaboratoriesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_laboratory")
    private LaboratoryEntity laboratory;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_social_network")
    private SocialNetworkEntity socialNetwork;

    @Column(length = 250,unique = true, nullable = false)
    private String url;
}
