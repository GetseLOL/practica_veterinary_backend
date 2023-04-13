package com.veterinary.practica.domains.entities.veterinary;

import com.veterinary.practica.domains.entities.employee.EmployeeEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "veterinary")
public class VeterinaryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_employee")
    private EmployeeEntity employee;

    @Column(length = 100, nullable = false, unique = true)
    private String identificationCard;

    @Column(length = 100, nullable = false)
    private String university;

    @Column(length = 40, nullable = false)
    private String career;

    @Temporal(TemporalType.TIMESTAMP)
    private Date graduate;

    @OneToOne(mappedBy = "veterinary")
    private SpecialityEntity speciality;
}
