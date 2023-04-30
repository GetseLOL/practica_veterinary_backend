package com.veterinary.practica.infraestructure.services.address;

import com.veterinary.practica.api.models.requests.address.StateCountryRequest;
import com.veterinary.practica.api.models.responses.address.CountryResponse;
import com.veterinary.practica.api.models.responses.address.StateCountryResponse;
import com.veterinary.practica.domains.entities.address.StateCountryEntity;
import com.veterinary.practica.domains.repositories.address.CountryRepository;
import com.veterinary.practica.domains.repositories.address.StateCountryRepository;
import com.veterinary.practica.infraestructure.abstract_services.address.IStateCountryService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Slf4j
@Transactional
@Service
public class StateCountryService implements IStateCountryService{

	private final CountryRepository countryRepository;
	private final StateCountryRepository stateCountryRepository;

	@Override
	public StateCountryResponse create(StateCountryRequest request){
		var byIdCountry = countryRepository.findById(request.getIdCountry()).orElseThrow();

		var built = StateCountryEntity.builder()
		                              .name(request.getName())
		                              .country(byIdCountry)
		                              .build();
		var saved = stateCountryRepository.save(built);
		log.info("State Country saved with id: {}", saved.getId());
		return entityToResponse(saved);
	}

	@Override
	public StateCountryResponse update(StateCountryRequest request, Long id){
		return null;
	}

	@Override
	public void delete(Long id){

	}

	@Override
	public StateCountryResponse read(Long id){
		return null;
	}

	@Override
	public Iterable<StateCountryResponse> readAll(){
		return null;
	}

	private StateCountryResponse entityToResponse(StateCountryEntity entity){
		var response = new StateCountryResponse();
		BeanUtils.copyProperties(entity, response);
		var countryResponse = new CountryResponse();
		BeanUtils.copyProperties(entity.getCountry(), countryResponse);
		response.setCountry(countryResponse);
		return response;
	}
}
