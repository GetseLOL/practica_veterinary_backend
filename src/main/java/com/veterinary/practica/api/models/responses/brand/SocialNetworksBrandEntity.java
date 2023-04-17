package com.veterinary.practica.api.models.responses.brand;

import com.veterinary.practica.api.models.responses.shareds.contact.SocialNetworkEntity;
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
@Table(name = "social_networks_brands")
public class SocialNetworksBrandEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_brand", nullable = false)
	private BrandEntity brand;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_social_network", nullable = false)
	private SocialNetworkEntity socialNetwork;

	@Column(length = 250, nullable = false, unique = true)
	private String url;
}
