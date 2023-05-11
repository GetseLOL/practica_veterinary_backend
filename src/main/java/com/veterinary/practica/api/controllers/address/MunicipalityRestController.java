package com.veterinary.practica.api.controllers.address;

import com.veterinary.practica.api.models.requests.address.MunicipalityRequest;
import com.veterinary.practica.api.models.responses.address.MunicipalityResponse;
import com.veterinary.practica.infraestructure.abstract_services.address.IMunicipalityService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("address/municipality")
@AllArgsConstructor
public class MunicipalityRestController {

	private final IMunicipalityService service;

	@PostMapping
	public ResponseEntity<MunicipalityResponse> post(@RequestBody @Valid MunicipalityRequest request) {
		return ResponseEntity.ok(this.service.create(request));
	}

	@GetMapping("{id}")
	public ResponseEntity<MunicipalityResponse> get(@PathVariable Long id) {
		return ResponseEntity.ok(this.service.read(id));
	}

	@GetMapping
	public ResponseEntity<List<MunicipalityResponse>> getAll() {
		return ResponseEntity.ok((List<MunicipalityResponse>) this.service.readAll());
	}

	@GetMapping("search")
	public ResponseEntity<List<MunicipalityResponse>> getByName(@RequestParam String name) {
		if(name.equals(""))
			return ResponseEntity.noContent().build();
		var response = this.service.readByName(name);
		return response.isEmpty() ?
				ResponseEntity.noContent().build() :
				ResponseEntity.ok(this.service.readByName(name));
	}

	@PutMapping("{id}")
	public ResponseEntity<MunicipalityResponse> put(@RequestBody @Valid MunicipalityRequest request,
			@PathVariable Long id) {
		return ResponseEntity.ok(this.service.update(request, id));
	}

}
