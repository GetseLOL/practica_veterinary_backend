package com.veterinary.practica.api.models.responses.laboratory;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "email_laboratory")
public class EmailsLaboratoriesEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 200, unique = true, nullable = false)
	private String email;

	@OneToOne(mappedBy = "emailLaboratory")
	private LaboratoryEntity laboratory;
}
