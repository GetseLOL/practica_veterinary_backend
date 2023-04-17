package com.veterinary.practica.api.models.responses.brand;

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
@Table(name = "email_brand")
public class EmailBrandEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 200, nullable = false, unique = true)
	private String email;

	@OneToOne(mappedBy = "email")
	private BrandEntity brand;
}
