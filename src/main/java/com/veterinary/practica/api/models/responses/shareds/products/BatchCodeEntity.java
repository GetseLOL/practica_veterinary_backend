package com.veterinary.practica.api.models.responses.shareds.products;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BatchCodeEntity {
	private String id;
	private Integer amount;
	private Date dateReceive;
}
