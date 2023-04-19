package com.veterinary.practica.infraestructure.services.address;

import com.veterinary.practica.api.models.requests.address.StateCountryRequest;
import com.veterinary.practica.api.models.responses.address.StateCountryResponse;
import com.veterinary.practica.infraestructure.abstract_services.address.IStateCountryService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Slf4j
@Transactional
@Service
public class StateCountryService implements IStateCountryService{
	@Override
	public StateCountryResponse create(StateCountryRequest request){
		return null;
	}

	@Override
	public StateCountryResponse update(
			StateCountryRequest request,
			Long aLong){
		return null;
	}

	@Override
	public void delete(Long aLong){

	}

	@Override
	public StateCountryResponse read(Long aLong){
		return null;
	}

	@Override
	public Iterable<StateCountryResponse> readAll(){
		return null;
	}
}
