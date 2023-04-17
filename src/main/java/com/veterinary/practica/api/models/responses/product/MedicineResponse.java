package com.veterinary.practica.api.models.responses.product;

import com.veterinary.practica.api.models.responses.brand.BrandResponse;
import com.veterinary.practica.api.models.responses.shareds.GenericNameResponse;
import com.veterinary.practica.api.models.responses.shareds.products.BatchCodeResponse;
import com.veterinary.practica.api.models.responses.shareds.products.CategoryResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MedicineResponse {
	private Long id;
	private BrandResponse brandEntity;
	private GenericNameResponse genericName;
	private String name;
	private CategoryResponse categoryEntity;
	private BatchCodeResponse batchCode;
	private String indication;
	private Integer duration;
	private BigDecimal unitPrice;
}
