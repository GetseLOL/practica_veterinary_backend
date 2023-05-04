package com.veterinary.practica.api.controllers.address;

import com.veterinary.practica.api.models.requests.address.StateCountryRequest;
import com.veterinary.practica.api.models.responses.address.StateCountryResponse;
import com.veterinary.practica.infraestructure.abstract_services.address.IStateCountryService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("address/state_country")
@AllArgsConstructor
public class StateCountryRestController{

	private final IStateCountryService service;

	@PostMapping
	public ResponseEntity<StateCountryResponse> post(@RequestBody @Valid StateCountryRequest request){
		return ResponseEntity.ok(this.service.create(request));
	}

	@GetMapping("{id}")
	public ResponseEntity<StateCountryResponse> get(@PathVariable Long id){
		return ResponseEntity.ok(this.service.read(id));
	}

	@GetMapping
	public ResponseEntity<List<StateCountryResponse>> getAll(){
		return ResponseEntity.ok((List<StateCountryResponse>) this.service.readAll());
	}

	@PutMapping("{id}")
	public ResponseEntity<StateCountryResponse> put(@RequestBody @Valid StateCountryRequest request, @PathVariable Long id){
		return ResponseEntity.ok(this.service.update(request, id));
	}

}
