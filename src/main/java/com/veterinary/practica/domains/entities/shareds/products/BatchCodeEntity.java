package com.veterinary.practica.domains.entities.shareds.products;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "batch_code")
public class BatchCodeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 36)
    private String id;

    @Column(nullable = false)
    private Integer amount;

    @Column(nullable = false)
    private Date dateReceive;

}
