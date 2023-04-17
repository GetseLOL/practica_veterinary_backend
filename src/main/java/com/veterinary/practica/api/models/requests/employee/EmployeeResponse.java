package com.veterinary.practica.api.models.requests.employee;

import com.veterinary.practica.api.models.requests.address.AddressResponse;
import com.veterinary.practica.api.models.requests.shareds.GenderResponse;
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
	private GenderResponse gender;
	private VeterinaryResponse veterinary;
	private AddressResponse address;
	private EmailEmployeeResponse emailEmployee;
}
