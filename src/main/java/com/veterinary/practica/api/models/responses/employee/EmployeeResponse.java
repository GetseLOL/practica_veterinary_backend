package com.veterinary.practica.api.models.responses.employee;

import com.veterinary.practica.api.models.responses.address.AddressResponse;
import com.veterinary.practica.api.models.responses.shareds.GenderResponse;
import com.veterinary.practica.api.models.responses.veterinary.VeterinaryResponse;
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
