package com.veterinary.practica.api.models.responses.clients;

import com.veterinary.practica.api.models.responses.address.AddressEntity;
import com.veterinary.practica.api.models.responses.shareds.GenderEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientEntity {
	private Long id;
	private String firstName;
	private String lastName;
	private String secondLastName;
	private EmailClientEntity emailClient;
	private GenderEntity gender;
	private AddressEntity address;
}
