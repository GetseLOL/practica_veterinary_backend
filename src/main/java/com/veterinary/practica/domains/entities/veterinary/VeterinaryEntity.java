package com.veterinary.practica.domains.entities.veterinary;

import com.veterinary.practica.domains.entities.employee.EmployeeEntity;
import com.veterinary.practica.domains.entities.university.CareerEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "veterinary")
public class VeterinaryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_employee")
	private EmployeeEntity employee;

	@Column(length = 100, nullable = false, unique = true)
	private String identificationCard;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_speciality")
	private SpecialityEntity speciality;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_career")
	private CareerEntity university;

	private Date graduate;

}
