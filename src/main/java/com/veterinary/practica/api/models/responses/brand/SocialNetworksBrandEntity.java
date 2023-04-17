package com.veterinary.practica.api.models.responses.brand;

import com.veterinary.practica.api.models.responses.shareds.contact.SocialNetworkEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SocialNetworksBrandEntity {
	private Long id;
	private BrandEntity brand;
	private SocialNetworkEntity socialNetwork;
	private String url;
}
