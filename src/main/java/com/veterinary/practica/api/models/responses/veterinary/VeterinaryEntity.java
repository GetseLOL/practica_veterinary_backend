package com.veterinary.practica.api.models.responses.veterinary;

import com.veterinary.practica.api.models.responses.employee.EmployeeEntity;
import com.veterinary.practica.api.models.responses.university.CareerEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VeterinaryEntity {
	private Long id;
	private EmployeeEntity employee;
	private String identificationCard;
	private SpecialityEntity speciality;
	private CareerEntity university;
	private Date graduate;
}
