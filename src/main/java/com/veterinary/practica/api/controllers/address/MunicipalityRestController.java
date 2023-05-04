package com.veterinary.practica.api.controllers.address;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veterinary.practica.api.models.requests.address.MunicipalityRequest;
import com.veterinary.practica.api.models.responses.address.MunicipalityResponse;
import com.veterinary.practica.infraestructure.abstract_services.address.IMunicipalityService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("address/municipality")
@AllArgsConstructor
public class MunicipalityRestController {

    private final IMunicipalityService service;

    @PostMapping
	public ResponseEntity<MunicipalityResponse> post(@RequestBody @Valid MunicipalityRequest request){
		return ResponseEntity.ok(this.service.create(request));
	}

	@GetMapping("{id}")
	public ResponseEntity<MunicipalityResponse> get(@PathVariable Long id){
		return ResponseEntity.ok(this.service.read(id));
	}

	@GetMapping
	public ResponseEntity<List<MunicipalityResponse>> getAll(){
		return ResponseEntity.ok((List<MunicipalityResponse>) this.service.readAll());
	}

	@PutMapping("{id}")
	public ResponseEntity<MunicipalityResponse> put(@RequestBody @Valid MunicipalityRequest request, @PathVariable Long id){
		return ResponseEntity.ok(this.service.update(request, id));
	}
    
}
