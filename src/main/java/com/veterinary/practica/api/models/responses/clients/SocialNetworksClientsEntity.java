package com.veterinary.practica.api.models.responses.clients;

import com.veterinary.practica.api.models.responses.shareds.contact.SocialNetworkEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
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

	@Column(unique = true, nullable = false, length = 250)
	private String url;
}
