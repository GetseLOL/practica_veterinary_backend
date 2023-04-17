package com.veterinary.practica.domains.repositories.shared.products;

import com.veterinary.practica.domains.entities.shareds.products.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<CategoryEntity, Long> {
}
