package com.veterinary.practica.api.models.requests.brand;

import com.veterinary.practica.api.models.requests.shareds.contact.SocialNetworkResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SocialNetworksBrandResponse {
	private Long id;
	private BrandResponse brand;
	private SocialNetworkResponse socialNetwork;
	private String url;
}
