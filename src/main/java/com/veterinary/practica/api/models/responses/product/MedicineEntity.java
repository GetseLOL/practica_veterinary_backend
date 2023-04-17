package com.veterinary.practica.api.models.responses.product;

import com.veterinary.practica.api.models.responses.brand.BrandEntity;
import com.veterinary.practica.api.models.responses.shareds.GenericNameEntity;
import com.veterinary.practica.api.models.responses.shareds.products.BatchCodeEntity;
import com.veterinary.practica.api.models.responses.shareds.products.CategoryEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MedicineEntity {
	private Long id;
	private String name;
	private String indication;
	private Integer duration;
	private BigDecimal unitPrice;
	private GenericNameEntity genericName;
	private CategoryEntity categoryEntity;
	private BatchCodeEntity batchCode;
	private BrandEntity brandEntity;
}
