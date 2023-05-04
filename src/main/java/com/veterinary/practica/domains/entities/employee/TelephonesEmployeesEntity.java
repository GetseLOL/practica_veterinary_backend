package com.veterinary.practica.domains.entities.employee;

import com.veterinary.practica.domains.entities.clients.TelephonesClientsEntity;
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
@Table(name = "telephones_employees")
public class TelephonesEmployeesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_employee", nullable = false)
    private EmployeeEntity employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_type_telephone", nullable = false)
    private TelephonesClientsEntity telephonesClients;

    @Column(length = 30, nullable = false, unique = true)
    private String phoneNumber;
}
