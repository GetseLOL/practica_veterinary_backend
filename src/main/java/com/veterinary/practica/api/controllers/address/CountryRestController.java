package com.veterinary.practica.api.controllers.address;

import com.veterinary.practica.api.models.requests.address.CountryRequest;
import com.veterinary.practica.api.models.responses.address.CountryResponse;
import com.veterinary.practica.infraestructure.abstract_services.address.ICountryService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Digits;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("address/country")
@AllArgsConstructor
public class CountryRestController{

	private final ICountryService service;

	@PostMapping
	public ResponseEntity<CountryResponse> post(@RequestBody @Valid CountryRequest request){
		return ResponseEntity.ok(this.service.create(request));
	}

	@GetMapping
	public ResponseEntity<List<CountryResponse>> getAll(){
		return ResponseEntity.ok((List<CountryResponse>) this.service.readAll());
	}

	@GetMapping("{id}")
	public ResponseEntity<CountryResponse> get(@PathVariable Integer id){
		return ResponseEntity.ok(this.service.read(id));
	}

	@PutMapping("{id}")
	public ResponseEntity<CountryResponse> put(
			@RequestBody @Valid CountryRequest request, @PathVariable Integer id){
		return ResponseEntity.ok(this.service.update(request, id));
	}

	// @DeleteMapping("{id}")
	// public ResponseEntity<Void> delete(@PathVariable Integer id){
	// 	this.countryService.delete(id);
	// 	return ResponseEntity.noContent().build();
	// }
}
