package com.veterinary.practica.api.models.responses.employee;

import com.veterinary.practica.api.models.responses.address.AddressEntity;
import com.veterinary.practica.api.models.responses.shareds.GenderEntity;
import com.veterinary.practica.api.models.responses.veterinary.VeterinaryEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {
	private Long id;
	private String firstName;
	private String lastName;
	private String secondLastName;
	private BigDecimal salary;
	private EmailEmployeeEntity emailEmployee;
	private GenderEntity gender;
	private AddressEntity address;
	private RolEntity rol;
	private VeterinaryEntity veterinary;
}
