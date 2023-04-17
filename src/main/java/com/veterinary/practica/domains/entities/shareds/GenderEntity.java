package com.veterinary.practica.domains.entities.shareds;

import com.veterinary.practica.domains.entities.clients.ClientEntity;
import com.veterinary.practica.domains.entities.employee.EmployeeEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "gender")
public class GenderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, unique = true, nullable = false)
    private String name;

    @OneToOne(mappedBy = "gender")
    private ClientEntity client;

    @OneToOne(mappedBy = "gender")
    private EmployeeEntity employee;
}
