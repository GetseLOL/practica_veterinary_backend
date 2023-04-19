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
@RequestMapping("country")
@AllArgsConstructor
public class CountryRestController{

	private final ICountryService countryService;

	@PostMapping
	public ResponseEntity<CountryResponse> post(@RequestBody @Valid CountryRequest request){
		return ResponseEntity.ok(this.countryService.create(request));
	}

	@GetMapping
	public ResponseEntity<List<CountryResponse>> getAll(){
		return ResponseEntity.ok((List<CountryResponse>) this.countryService.readAll());
	}

	@GetMapping("{id}")
	public ResponseEntity<CountryResponse> get(@PathVariable
	                                               @Digits(message = "The id is required numeric",
			                                               integer = 0, fraction = 0)
	                                               Integer id){
		return ResponseEntity.ok(this.countryService.read(id));
	}

	@PutMapping("{id}")
	public ResponseEntity<CountryResponse> put(
			@RequestBody @Valid CountryRequest request, @PathVariable Integer id){
		return ResponseEntity.ok(this.countryService.update(request, id));
	}

	@DeleteMapping("{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		this.countryService.delete(id);
		return ResponseEntity.noContent().build();
	}
}
