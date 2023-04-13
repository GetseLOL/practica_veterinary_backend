package com.veterinary.practica;

import com.veterinary.practica.domains.entities.shareds.SocialNetworkEntity;
import com.veterinary.practica.domains.entities.clients.SocialNetworksClientsEntity;
import com.veterinary.practica.domains.repositories.address.*;
import com.veterinary.practica.domains.repositories.clients.ClientRepository;
import com.veterinary.practica.domains.repositories.clients.EmailClientRepository;
import com.veterinary.practica.domains.repositories.shared.GenderRepository;
import com.veterinary.practica.domains.repositories.shared.SocialNetworkRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
@Slf4j
public class VeterinaryApplication implements CommandLineRunner {

    private CountryRepository countryRepository;
    private StateCountryRepository stateCountryRepository;
    private MunicipalityRepository municipalityRepository;
    private ColonyRepository colonyRepository;
    private StreetRepository streetRepository;
    private AddressRepisotory addressRepisotory;
    private GenderRepository genderRepository;
    private EmailClientRepository emailClientRepository;
    private ClientRepository clientRepository;
    private SocialNetworkRepository socialNetwork;
    private SocialNetworksClientsEntity socialNetworksClients;


    public static void main(String[] args)  {
        SpringApplication.run(VeterinaryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var byIdCountry = countryRepository.findById(1);
        var byIdStateCountry = stateCountryRepository.findById(1L);
        var byIdMunicipality = municipalityRepository.findById(1L);
        var byIdColony = colonyRepository.findById(1L);
        var byIdStreet = streetRepository.findById(1L);
        var byIdAddress = addressRepisotory.findById(1L);
        var byIdGender = genderRepository.findById(1L);
        var byIdEmailClient = emailClientRepository.findById(1L);
        var byIdClient = clientRepository.findById(1L);
        socialNetwork.save(new SocialNetworkEntity(1, "Facebook"));
        var byIdSocialNetWork = socialNetwork.findById(1);
        log.info(byIdCountry.toString());
        log.info(byIdStateCountry.toString());
        log.info(byIdMunicipality.toString());
        log.info(byIdColony.toString());
        log.info(byIdStreet.toString());
        log.info(byIdAddress.toString());
        log.info(byIdGender.toString());
        log.info(byIdEmailClient.toString());
        log.info(byIdClient.toString());
        log.info(byIdSocialNetWork.toString());

    }
}
