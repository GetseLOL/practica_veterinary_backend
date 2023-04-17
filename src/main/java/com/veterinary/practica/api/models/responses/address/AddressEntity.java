package com.veterinary.practica.api.models.responses.address;

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
@Table(name = "address")
public class AddressEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_street", nullable = false)
	private StreetEntity street;

	@Column(length = 250, nullable = false)
	private String reference;

	@Column(length = 25, nullable = false)
	private String postal_code;

	@Column(length = 25, nullable = false)
	private String numInt;

	@Column(length = 25, nullable = false)
	private String numExt;

}
