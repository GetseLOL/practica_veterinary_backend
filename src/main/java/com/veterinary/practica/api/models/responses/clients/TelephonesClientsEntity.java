package com.veterinary.practica.api.models.responses.clients;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "telephones_clients")
public class TelephonesClientsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_client", nullable = false)
	private ClientEntity client;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_type_telephone", nullable = false)
	private TelephonesClientsEntity telephonesClients;

	@Column(length = 30, nullable = false)
	private String phoneNumber;
}
