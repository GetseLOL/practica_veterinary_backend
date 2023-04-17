package com.veterinary.practica.api.models.requests.veterinary;

import com.veterinary.practica.api.models.requests.employee.EmployeeResponse;
import com.veterinary.practica.api.models.requests.university.CareerResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VeterinaryResponse {
	private Long id;
	private EmployeeResponse employee;
	private String identificationCard;
	private SpecialityResponse speciality;
	private CareerResponse university;
	private Date graduate;
}
