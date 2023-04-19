package com.veterinary.practica.infraestructure.abstract_services.address;

import com.veterinary.practica.api.models.requests.address.StateCountryRequest;
import com.veterinary.practica.api.models.responses.address.StateCountryResponse;
import com.veterinary.practica.infraestructure.abstract_services.shared.CrudService;

public interface IStateCountryService extends
                                      CrudService<StateCountryRequest, StateCountryResponse, Long>{

}
