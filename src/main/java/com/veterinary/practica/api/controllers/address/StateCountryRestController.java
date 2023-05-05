package com.veterinary.practica.api.controllers.address;

import com.veterinary.practica.api.models.requests.address.StateCountryRequest;
import com.veterinary.practica.api.models.responses.address.StateCountryResponse;
import com.veterinary.practica.infraestructure.abstract_services.address.IStateCountryService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

	@GetMapping("search")
	public ResponseEntity<List<StateCountryResponse>> getByName(@RequestParam String country) {
		var byNameStateCountry = service.findByName(country);
		return byNameStateCountry.isEmpty() ?
				ResponseEntity.noContent().build() :
				ResponseEntity.ok(byNameStateCountry);
	}

	@PutMapping("{id}")
	public ResponseEntity<StateCountryResponse> put(@RequestBody @Valid StateCountryRequest request, @PathVariable Long id){
		return ResponseEntity.ok(this.service.update(request, id));
	}

}
