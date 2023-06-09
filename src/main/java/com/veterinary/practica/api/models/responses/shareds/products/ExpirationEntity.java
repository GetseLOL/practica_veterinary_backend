package com.veterinary.practica.api.models.responses.shareds.products;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ExpirationEntity {
	private Long id;
	private Timestamp expirationDateTime;
	private BatchCodeEntity idBatchCode;
}
