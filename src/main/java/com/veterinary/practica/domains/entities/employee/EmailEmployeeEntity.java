package com.veterinary.practica.domains.entities.employee;

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
@Table(name = "email_employee")
public class EmailEmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 60, unique = true, nullable = false)
    private String email;

    @OneToOne(mappedBy = "emailEmployee")
    private EmployeeEntity employee;
}
