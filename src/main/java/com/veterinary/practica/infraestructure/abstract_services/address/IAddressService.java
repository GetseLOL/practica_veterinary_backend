package com.veterinary.practica.infraestructure.abstract_services.address;

import com.veterinary.practica.api.models.requests.address.AddressRequest;
import com.veterinary.practica.api.models.responses.address.AddressResponse;
import com.veterinary.practica.infraestructure.abstract_services.shared.CrudCatalogService;

public interface IAddressService extends CrudCatalogService<AddressRequest, AddressResponse, Long> {
}
