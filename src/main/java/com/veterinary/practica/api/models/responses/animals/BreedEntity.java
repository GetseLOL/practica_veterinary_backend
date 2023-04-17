package com.veterinary.practica.api.models.responses.animals;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "breed")
public class BreedEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, unique = true, length = 45)
	private String name;

	@ManyToOne
	@JoinColumn(name = "id_specie", nullable = false)
	private SpecieEntity specie;
}
