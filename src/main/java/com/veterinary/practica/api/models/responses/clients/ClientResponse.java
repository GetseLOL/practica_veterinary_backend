package com.veterinary.practica.api.models.responses.clients;

import com.veterinary.practica.api.models.responses.address.AddressResponse;
import com.veterinary.practica.api.models.responses.shareds.GenderResponse;
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
