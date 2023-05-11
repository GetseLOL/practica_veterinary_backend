package com.veterinary.practica.infraestructure.abstract_services.address;

import com.veterinary.practica.api.models.requests.address.MunicipalityRequest;
import com.veterinary.practica.api.models.responses.address.MunicipalityResponse;
import com.veterinary.practica.infraestructure.abstract_services.shared.CrudService;

import java.util.List;

public interface IMunicipalityService extends CrudService<MunicipalityRequest, MunicipalityResponse, Long> {

    default void delete(Long id) {
        throw new UnsupportedOperationException("The method is unsupported");
    }
    List<MunicipalityResponse> readByName(String name);
}
