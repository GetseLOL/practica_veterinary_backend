package com.veterinary.practica.infraestructure.services.address;

import com.veterinary.practica.api.models.requests.address.ColonyRequest;
import com.veterinary.practica.api.models.responses.address.ColonyResponse;
import com.veterinary.practica.api.models.responses.address.CountryResponse;
import com.veterinary.practica.api.models.responses.address.MunicipalityResponse;
import com.veterinary.practica.api.models.responses.address.StateCountryResponse;
import com.veterinary.practica.domains.entities.address.ColonyEntity;
import com.veterinary.practica.domains.repositories.address.ColonyRepository;
import com.veterinary.practica.domains.repositories.address.MunicipalityRepository;
import com.veterinary.practica.infraestructure.abstract_services.address.IColonyService;
import com.veterinary.practica.utils.exceptions.IdNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Slf4j
@Transactional
@Service
public class ColonyService implements IColonyService {

    private final ColonyRepository colonyRepository;
    private final MunicipalityRepository municipalityRepository;

    @Override
    public ColonyResponse create(ColonyRequest request) {

        var municipality = municipalityRepository.findById(request.getMunicipality())
                .orElseThrow(() -> new IdNotFoundException("municipality"));

        var build = ColonyEntity.builder()
                .name(request.getName())
                .municipality(municipality)
                .build();

        log.info("Colony created with id {} ", build.getId());

        return entityToResponse(build);
    }

    @Override
    public ColonyResponse update(ColonyRequest request, Long id) {

        var colonyToUpdate = colonyRepository.findById(id)
                .orElseThrow(() -> new IdNotFoundException("colony"));

        var idMunicipality = municipalityRepository.findById(request.getMunicipality())
                .orElseThrow(() -> new IdNotFoundException("municipality"));

        colonyToUpdate.setName(request.getName());
        colonyToUpdate.setMunicipality(idMunicipality);

        var colonyUpdate = colonyRepository.save(colonyToUpdate);

        log.info("Colony update with id {} ", colonyUpdate.getId());

        return entityToResponse(colonyUpdate);
    }

    @Override
    public ColonyResponse read(Long id) {
        var idColony = colonyRepository.findById(id)
                .orElseThrow(() -> new IdNotFoundException("colony"));
        log.info("Colony read with id {} ", idColony);
        return entityToResponse(idColony);
    }

    @Override
    public Iterable<ColonyResponse> readAll() {
        var allColonies = colonyRepository.findAll();
        log.info("Find all colonies {}", allColonies);
        List<ColonyResponse> colonyResponseList = new ArrayList<>();
        for (ColonyEntity colonyEntity :allColonies)
            colonyResponseList.add(entityToResponse(colonyEntity));
        return colonyResponseList;
    }

    @Override
    public List<ColonyResponse> readByName(String colony) {
        var byNamesColonies = colonyRepository.findByName(colony);
        List<ColonyResponse> colonyResponseList = new ArrayList<>();
        for(ColonyEntity colonyEntity : byNamesColonies)
            colonyResponseList.add(entityToResponse(colonyEntity));
        log.info("Read colonies {}", byNamesColonies);
        return colonyResponseList;
    }

    @Override
    public ColonyResponse readByColonyNameAndMunicipalityName(String colony, String municipality) {
        var byNameAndMunicipalityName = colonyRepository.findByNameAndMunicipalityName(colony, municipality);
        log.info("Read colony and municipality with names {}", byNameAndMunicipalityName);
        return entityToResponse(byNameAndMunicipalityName);
    }

    private ColonyResponse entityToResponse(ColonyEntity entity) {
        var response = new ColonyResponse();
        BeanUtils.copyProperties(entity, response);

        var municipalityResponse = new MunicipalityResponse();
        BeanUtils.copyProperties(entity.getMunicipality(), municipalityResponse);
        response.setMunicipality(municipalityResponse);

        var stateCountryResponse = new StateCountryResponse();
        BeanUtils.copyProperties(entity.getMunicipality().getStateCountry(), stateCountryResponse);
        municipalityResponse.setStateCountry(stateCountryResponse);

        var countryResponse = new CountryResponse();
        BeanUtils.copyProperties(entity.getMunicipality().getStateCountry().getCountry(), countryResponse);
        stateCountryResponse.setCountry(countryResponse);

        return response;
    }
}
