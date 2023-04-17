package com.veterinary.practica.domains.repositories.shared;

import com.veterinary.practica.domains.entities.shareds.GenericNameEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenericNameRepository extends JpaRepository<GenericNameEntity, Long> {
}
