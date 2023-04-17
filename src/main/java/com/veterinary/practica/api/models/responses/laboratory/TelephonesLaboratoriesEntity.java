package com.veterinary.practica.api.models.responses.laboratory;

import com.veterinary.practica.api.models.responses.shareds.contact.TypeTelephoneEntity;
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
@Table(name = "telephones_laboratories")
public class TelephonesLaboratoriesEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_laboratory")
	private LaboratoryEntity laboratory;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_type_telephone")
	private TypeTelephoneEntity typeTelephone;

	@Column(length = 30, nullable = false, unique = true)
	private String phoneNumber;
}
