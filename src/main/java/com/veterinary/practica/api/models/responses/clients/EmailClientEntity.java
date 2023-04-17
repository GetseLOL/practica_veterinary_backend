package com.veterinary.practica.api.models.responses.clients;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "email_client")
public class EmailClientEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 60, unique = true, nullable = false)
	private String email;

	@OneToOne(mappedBy = "emailClient")
	private ClientEntity client;
}
