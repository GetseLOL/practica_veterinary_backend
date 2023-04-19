package com.veterinary.practica.api.controllers.address;

import com.veterinary.practica.api.models.requests.address.StateCountryRequest;
import com.veterinary.practica.api.models.responses.address.StateCountryResponse;
import com.veterinary.practica.infraestructure.abstract_services.address.IStateCountryService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("address/state_country")
@AllArgsConstructor
public class StateCountryRestController{

	private final IStateCountryService countryService;

	@PostMapping
	public ResponseEntity<StateCountryResponse> post(@RequestBody @Valid StateCountryRequest request){
		return ResponseEntity.ok(this.countryService.create(request));
	}

}
