package com.veterinary.practica.api.models.requests.employee;

import com.veterinary.practica.api.models.requests.address.AddressRequest;
import com.veterinary.practica.api.models.requests.shareds.GenderRequest;
import com.veterinary.practica.api.models.requests.veterinary.VeterinaryResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {
	private Long id;
	private String firstName;
	private String lastName;
	private String secondLastName;
	private BigDecimal salary;
	private RolResponse rol;
	private GenderRequest gender;
	private VeterinaryResponse veterinary;
	private AddressRequest address;
	private EmailEmployeeResponse emailEmployee;
}
