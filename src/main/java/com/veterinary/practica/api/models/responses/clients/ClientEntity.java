package com.veterinary.practica.api.models.responses.clients;

import com.veterinary.practica.api.models.responses.address.AddressEntity;
import com.veterinary.practica.api.models.responses.shareds.GenderEntity;
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
@Table(name = "client")
public class ClientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 25, nullable = false)
	private String firstName;

	@Column(length = 25, nullable = false)
	private String lastName;

	@Column(length = 25)
	private String secondLastName;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_email_client", nullable = false, unique = true)
	private EmailClientEntity emailClient;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_gender", nullable = false)
	private GenderEntity gender;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_address", nullable = false)
	private AddressEntity address;
}
