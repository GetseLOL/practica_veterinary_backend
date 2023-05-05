package com.veterinary.practica.api.models.requests.address;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressRequest {
	private String reference;
	private String postal_code;
	private String numInt;
	private String numExt;
	private StreetResponse street;
}
