package com.veterinary.practica.infraestructure.abstract_services.shared;

import com.veterinary.practica.utils.enums.SortType;
import org.springframework.data.domain.Page;

public interface CrudCatalogService<RQ, RS, ID> {
	RS create(RQ request);

	RS update(RQ request, ID id);

	void delete(ID id);

	RS read(ID id);

	RS readAll();

	Page<RS> readAll(Integer page, Integer size, SortType sortType);
}
