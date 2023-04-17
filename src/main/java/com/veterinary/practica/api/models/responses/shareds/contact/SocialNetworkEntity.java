package com.veterinary.practica.api.models.responses.shareds.contact;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocialNetworkEntity {
	private Integer id;
	private String name;
}
