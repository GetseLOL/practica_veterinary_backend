package com.veterinary.practica.domains.repositories.brand;

import com.veterinary.practica.api.models.responses.brand.SocialNetworksBrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialNetworksBrandRepository extends JpaRepository<SocialNetworksBrandEntity, Long> {
}
