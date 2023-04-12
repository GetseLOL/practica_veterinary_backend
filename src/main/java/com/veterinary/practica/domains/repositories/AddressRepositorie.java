package com.veterinary.practica.domains.repositories;

import com.veterinary.practica.domains.entities.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepositorie extends JpaRepository<AddressEntity, Long> {
}
