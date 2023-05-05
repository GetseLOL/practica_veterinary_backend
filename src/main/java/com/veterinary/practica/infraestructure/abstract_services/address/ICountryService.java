package com.veterinary.practica.infraestructure.abstract_services.address;

import com.veterinary.practica.api.models.requests.address.CountryRequest;
import com.veterinary.practica.api.models.responses.address.CountryResponse;
import com.veterinary.practica.infraestructure.abstract_services.shared.CrudService;

import java.util.List;

public interface ICountryService extends CrudService<CountryRequest, CountryResponse, Integer> {

	default void delete(Integer id) {
		throw new UnsupportedOperationException("The method is unsupported");
	}
	List<CountryResponse> findByName(String country);
}
