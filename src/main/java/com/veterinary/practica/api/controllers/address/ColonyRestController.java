package com.veterinary.practica.api.controllers.address;

import com.veterinary.practica.api.models.requests.address.ColonyRequest;
import com.veterinary.practica.api.models.responses.address.ColonyResponse;
import com.veterinary.practica.infraestructure.abstract_services.address.IColonyService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("address/colony")
@AllArgsConstructor
public class ColonyRestController {
    private final IColonyService service;

    @PostMapping
    public ResponseEntity<ColonyResponse> post(@RequestBody @Valid ColonyRequest request) {
        return ResponseEntity.ok(this.service.create(request));
    }

    @GetMapping
    public ResponseEntity<List<ColonyResponse>> getAll() {
        return ResponseEntity.ok((List<ColonyResponse>) this.service.readAll());
    }

    @GetMapping("search")
    public ResponseEntity<List<ColonyResponse>> getByName(@RequestParam String colony){
        var response = service.readByName(colony);
        return response.isEmpty() ?
                ResponseEntity.noContent().build() :
                ResponseEntity.ok(response);
    }

    @GetMapping("{id}")
    public ResponseEntity<ColonyResponse> get(@PathVariable Long id) {
        return ResponseEntity.ok(this.service.read(id));
    }



    @PutMapping("{id}")
    public ResponseEntity<ColonyResponse> put(
            @RequestBody @Valid ColonyRequest request, @PathVariable Long id) {
        return ResponseEntity.ok(this.service.update(request, id));
    }
}
