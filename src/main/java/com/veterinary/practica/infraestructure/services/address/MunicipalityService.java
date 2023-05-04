package com.veterinary.practica.infraestructure.services.address;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.veterinary.practica.api.models.requests.address.MunicipalityRequest;
import com.veterinary.practica.api.models.responses.address.MunicipalityResponse;
import com.veterinary.practica.api.models.responses.address.StateCountryResponse;
import com.veterinary.practica.domains.entities.address.MunicipalityEntity;
import com.veterinary.practica.domains.repositories.address.MunicipalityRepository;
import com.veterinary.practica.domains.repositories.address.StateCountryRepository;
import com.veterinary.practica.infraestructure.abstract_services.address.IMunicipalityService;
import com.veterinary.practica.utils.exceptions.IdNotFoundException;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
@Transactional
@Service
public class MunicipalityService implements IMunicipalityService {

    private final MunicipalityRepository municipalityRepository;
    private final StateCountryRepository stateCountryRepository;

    @Override
    public MunicipalityResponse create(MunicipalityRequest request) {
        var byIdStateCountry = stateCountryRepository.findById(request.getIdStateCountry())
                .orElseThrow(() -> new IdNotFoundException("state country"));

        var built = MunicipalityEntity.builder()
                .name(request.getName())
                .stateCountry(byIdStateCountry)
                .build();
        var saved = municipalityRepository.save(built);
        log.info("Municipality saved with id: {}", saved.getId());
        return entityToResponse(saved);
    }

    @Override
    public MunicipalityResponse update(MunicipalityRequest request, Long id) {
        var stateCountry = stateCountryRepository.findById(request.getIdStateCountry())
                .orElseThrow(() -> new IdNotFoundException("state country"));
        var municipalityToUpdate = municipalityRepository.findById(id)
                .orElseThrow(() -> new IdNotFoundException("municipality"));

        municipalityToUpdate.setName(request.getName());
        municipalityToUpdate.setStateCountry(stateCountry);

        var municipalityUpdate = municipalityRepository.save(municipalityToUpdate);

        log.info("Municipality update with id {}", municipalityUpdate.getId());
        return entityToResponse(municipalityUpdate);
    }

    @Override
    public MunicipalityResponse read(Long id) {
        MunicipalityEntity byIdMuncipality = municipalityRepository.findById(id)
                .orElseThrow(() -> new IdNotFoundException("state country"));
        log.info("Country read with id: {}", byIdMuncipality.getId());
        return entityToResponse(byIdMuncipality);
    }

    @Override
    public Iterable<MunicipalityResponse> readAll() {
        var allMunicipalities = municipalityRepository.findAll();
        
        log.info("Find all municipalities {}" + allMunicipalities);

        List<MunicipalityResponse> municipalityResponses = new ArrayList<>();

        for (MunicipalityEntity municipalityEntity : allMunicipalities)
            municipalityResponses.add(entityToResponse(municipalityEntity));

        return municipalityResponses;
    }

    private MunicipalityResponse entityToResponse(MunicipalityEntity entity) {
        var response = new MunicipalityResponse();
        BeanUtils.copyProperties(entity, response);
        var stateCountryResponse = new StateCountryResponse();
        BeanUtils.copyProperties(entity.getStateCountry(), stateCountryResponse);
        response.setStateCountry(stateCountryResponse);
        return response;
    }

}
