package com.veterinary.practica.infraestructure.services.address;

import com.veterinary.practica.api.models.requests.address.CountryRequest;
import com.veterinary.practica.api.models.responses.address.CountryResponse;
import com.veterinary.practica.domains.entities.address.CountryEntity;
import com.veterinary.practica.domains.repositories.address.CountryRepository;
import com.veterinary.practica.infraestructure.abstract_services.address.ICountryService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Slf4j
@Transactional
@Service
public class CountryService implements ICountryService {

	private final CountryRepository countryRepository;

	@Override
	public CountryResponse create(CountryRequest request) {
		var builtCountry = CountryEntity.builder().name(request.getName()).build();
		var savedCountry = countryRepository.save(builtCountry);
		log.info("Country saved with id: {}", savedCountry.getId());
		return entityToResponse(savedCountry);
	}

	@Override
	public CountryResponse update(CountryRequest request, Integer id) {
		var findByIdCountry = countryRepository.findById(id).orElseThrow();
		findByIdCountry.setName(request.getName());
		var updatedByIdCountry = countryRepository.save(findByIdCountry);
		log.info("Country update with id {} ", updatedByIdCountry.getId());
		return entityToResponse(updatedByIdCountry);
	}

	@Override
	public CountryResponse read(Integer id) {
		var findByIdCountry = countryRepository.findById(id).orElseThrow();
		log.info("Country read with id: {}", findByIdCountry.getId());
		return entityToResponse(findByIdCountry);
	}

	@Override
	public Iterable<CountryResponse> readAll() {
		var allCountries = countryRepository.findAllByOrderByIdAsc();
		log.info("Countries read all {}", allCountries);
		List<CountryResponse> countriesResponseList = new ArrayList<>();
		for (CountryEntity entity : allCountries)
			countriesResponseList.add(entityToResponse(entity));
		return countriesResponseList;
	}

	private CountryResponse entityToResponse(CountryEntity entity) {
		var response = new CountryResponse();
		BeanUtils.copyProperties(entity, response);
		return response;
	}
}
