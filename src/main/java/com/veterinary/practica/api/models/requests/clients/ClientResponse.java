package com.veterinary.practica.api.models.requests.clients;

import com.veterinary.practica.api.models.requests.address.AddressResponse;
import com.veterinary.practica.api.models.requests.shareds.GenderResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientResponse {
	private Long id;
	private String firstName;
	private String lastName;
	private String secondLastName;
	private EmailClientResponse emailClient;
	private GenderResponse gender;
	private AddressResponse address;
}
