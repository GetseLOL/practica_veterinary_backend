package com.veterinary.practica.api.controllers.address;

import com.veterinary.practica.api.models.requests.address.CountryRequest;
import com.veterinary.practica.api.models.responses.address.CountryResponse;
import com.veterinary.practica.infraestructure.abstract_services.address.ICountryService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("country")
@AllArgsConstructor
public class CountryController {

	private final ICountryService countryService;

	@PostMapping
	public ResponseEntity<CountryResponse> post(@RequestBody @Valid CountryRequest request) {
		return ResponseEntity.ok(this.countryService.create(request));
	}

	@GetMapping
	public ResponseEntity<List<CountryResponse>> getAll() {
		return ResponseEntity.ok((List<CountryResponse>) this.countryService.readAll());
	}

	@GetMapping("{id}")
	public ResponseEntity<CountryResponse> get(@PathVariable @NotBlank @Positive Integer id) {
		return ResponseEntity.ok(this.countryService.read(id));
	}

	@PutMapping("{id}")
	public ResponseEntity<CountryResponse> put(@RequestBody @Valid CountryRequest request, @PathVariable @NotBlank @Positive Integer id) {
		return ResponseEntity.ok(this.countryService.update(request, id));
	}

	@DeleteMapping("{id}")
	public ResponseEntity<Void> delete(@PathVariable @NotBlank @Positive Integer id) {
		this.countryService.delete(id);
		return ResponseEntity.noContent().build();
	}
}
