package com.veterinary.practica.infraestructure.abstract_services.shared;

public interface CrudService<RQ, RS, ID> {

	RS create(RQ request);

	RS update(RQ request, ID id);

	void delete(ID id);

	RS read(ID id);

	RS readAll();
}
