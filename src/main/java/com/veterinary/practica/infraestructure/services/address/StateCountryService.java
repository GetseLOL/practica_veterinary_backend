package com.veterinary.practica.infraestructure.services.address;

import com.veterinary.practica.api.models.requests.address.StateCountryRequest;
import com.veterinary.practica.api.models.responses.address.CountryResponse;
import com.veterinary.practica.api.models.responses.address.StateCountryResponse;
import com.veterinary.practica.domains.entities.address.StateCountryEntity;
import com.veterinary.practica.domains.repositories.address.CountryRepository;
import com.veterinary.practica.domains.repositories.address.StateCountryRepository;
import com.veterinary.practica.infraestructure.abstract_services.address.IStateCountryService;
import com.veterinary.practica.utils.exceptions.IdNotFoundException;
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
public class StateCountryService implements IStateCountryService {

	private final CountryRepository countryRepository;
	private final StateCountryRepository stateCountryRepository;

	@Override
	public StateCountryResponse create(StateCountryRequest request) {
		var byIdCountry = countryRepository.findById(request.getIdCountry())
				.orElseThrow(() -> new IdNotFoundException("state country"));

		var built = StateCountryEntity.builder()
				.name(request.getName())
				.country(byIdCountry)
				.build();
		var saved = stateCountryRepository.save(built);
		log.info("State Country saved with id: {}", saved.getId());
		return entityToResponse(saved);
	}

	@Override
	public StateCountryResponse update(StateCountryRequest request, Long id) {
		var stateCountryToUpdate = stateCountryRepository.findById(id)
				.orElseThrow(() -> new IdNotFoundException("state country"));
		var country = countryRepository.findById(request.getIdCountry())
				.orElseThrow(() -> new IdNotFoundException("country"));

		stateCountryToUpdate.setName(request.getName());
		stateCountryToUpdate.setCountry(country);

		var stateCountryUpdate = stateCountryRepository.save(stateCountryToUpdate);

		log.info("State country update with id {}", stateCountryUpdate.getId());
		return entityToResponse(stateCountryUpdate);
	}

	@Override
	@Transactional(readOnly = true)
	public StateCountryResponse read(Long id) {
		StateCountryEntity byIdStateCountry = stateCountryRepository.findById(id)
				.orElseThrow(() -> new IdNotFoundException("state country"));
		log.info("Country read with id: {}", byIdStateCountry.getId());
		return entityToResponse(byIdStateCountry);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<StateCountryResponse> readAll() {
		var allStateCountries = stateCountryRepository.findAll();
		log.info("State countries all {}", allStateCountries);

		List<StateCountryResponse> stateCountryResponseList = new ArrayList<>();

		for (StateCountryEntity stateCountry : allStateCountries)
			stateCountryResponseList.add(entityToResponse(stateCountry));

		return stateCountryResponseList;
	}

	private StateCountryResponse entityToResponse(StateCountryEntity entity) {
		var response = new StateCountryResponse();
		BeanUtils.copyProperties(entity, response);
		var countryResponse = new CountryResponse();
		BeanUtils.copyProperties(entity.getCountry(), countryResponse);
		response.setCountry(countryResponse);
		return response;
	}
}
