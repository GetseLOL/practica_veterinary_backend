package com.veterinary.practica.infraestructure.abstract_services.address;

import com.veterinary.practica.api.models.requests.address.ColonyRequest;
import com.veterinary.practica.api.models.responses.address.ColonyResponse;
import com.veterinary.practica.infraestructure.abstract_services.shared.CrudService;

import java.util.List;

public interface IColonyService extends CrudService<ColonyRequest, ColonyResponse, Long> {
    default void delete(Long id) {
        throw new UnsupportedOperationException("The method is unsupported");
    }

    List<ColonyResponse> readByName(String colony);
}
