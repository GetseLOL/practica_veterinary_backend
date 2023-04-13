package com.veterinary.practica.domains.entities.employee;

import com.veterinary.practica.domains.entities.address.AddressEntity;
import com.veterinary.practica.domains.entities.shareds.GenderEntity;
import com.veterinary.practica.domains.entities.veterinary.VeterinaryEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 25, nullable = false)
    private String firstName;

    @Column(length = 25, nullable = false)
    private String lastName;

    @Column(length = 25)
    private String secondLastName;

    @Column(length = 25, nullable = false, precision = 10, scale = 2)
    private BigDecimal salary;

    @OneToOne
    @JoinColumn(name = "id_email_employee", nullable = false, unique = true)
    private EmailEmployeeEntity emailEmployee;

    @OneToOne
    @JoinColumn(name = "id_gender", nullable = false)
    private GenderEntity gender;

    @ManyToOne
    @JoinColumn(name = "id_address", nullable = false)
    private AddressEntity address;

    @OneToOne
    @JoinColumn(name = "id_rol", nullable = false)
    private RolEntity rol;

    @OneToOne(mappedBy = "employee")
    private VeterinaryEntity veterinary;
}
