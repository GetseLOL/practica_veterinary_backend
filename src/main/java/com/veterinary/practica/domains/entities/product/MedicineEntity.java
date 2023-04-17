package com.veterinary.practica.domains.entities.product;

import com.veterinary.practica.domains.entities.brand.BrandEntity;
import com.veterinary.practica.domains.entities.shareds.GenericNameEntity;
import com.veterinary.practica.domains.entities.shareds.products.BatchCodeEntity;
import com.veterinary.practica.domains.entities.shareds.products.CategoryEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "medicine")
public class MedicineEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200, nullable = false)
    private String name;

    @Lob
    @Column(length = 10485760)
    private String indication;

    @Column(nullable = false)
    private Integer duration;

    @Column(nullable = false)
    private BigDecimal unitPrice;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_generic_name")
    private GenericNameEntity genericName;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_category")
    private CategoryEntity categoryEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_batch_code")
    private BatchCodeEntity batchCode;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_brand")
    private BrandEntity brandEntity;

}
