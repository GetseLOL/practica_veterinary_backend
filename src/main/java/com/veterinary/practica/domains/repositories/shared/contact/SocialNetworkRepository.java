package com.veterinary.practica.domains.repositories.shared.contact;

import com.veterinary.practica.api.models.responses.shareds.contact.SocialNetworkEntity;
import org.springframework.data.repository.CrudRepository;

public interface SocialNetworkRepository extends CrudRepository<SocialNetworkEntity, Integer> {
}
