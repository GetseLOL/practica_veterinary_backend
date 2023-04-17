package com.veterinary.practica.api.models.responses.brand;

import com.veterinary.practica.api.models.responses.address.CountryEntity;
import com.veterinary.practica.api.models.responses.laboratory.LaboratoryEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "brand")
@Builder
public class BrandEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 13, unique = true)
	private String rfc;

	@Column(length = 50, nullable = false)
	private String name;

	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date registration;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, unique = true, name = "id_country")
	private CountryEntity country;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, unique = true, name = "id_email_brand")
	private EmailBrandEntity email;


	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "laboratory_brand", joinColumns = @JoinColumn(name = "id_brand", nullable = false), inverseJoinColumns = @JoinColumn(name = "id_laboratory", nullable = false))
	private List<LaboratoryEntity> laboratories;
}
