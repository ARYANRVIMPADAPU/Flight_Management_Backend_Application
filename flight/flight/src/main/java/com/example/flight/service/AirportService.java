package com.example.flight.service;


import com.example.flight.exception.KnownException;
import com.example.flight.mapper.AirportMapper;
import com.example.flight.model.Airport;
import com.example.flight.pojo.AirportDTO;
import com.example.flight.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AirportService {

    @Autowired
    private AirportRepository airportRepository;

    @Autowired
    private AirportMapper airportMapper;

    public List<AirportDTO> getAirport() {
        return airportRepository.findAll().stream()
                .map(airportMapper::entityToDtoMapper)
                .collect(Collectors.toList());
    }


    public AirportDTO getAirport(long id) {
        //return airportRepository.findById(id).orElseThrow(() -> new KnownException("Airport with id " + id + " not found"));
        return airportMapper.entityToDtoMapper(airportRepository.findById(id).orElseThrow(() -> new KnownException("Airport with id " + id + " not found")));
    }

    public void addAirport(Airport airport) {
        airportRepository.save(airport);
    }

    public void updateAirport(long id, Airport airport) {
        Airport existingAirport = airportRepository.findById(id).orElse(null);
        existingAirport.setCode(airport.getCode());
        existingAirport.setName(airport.getName());
        existingAirport.setCity(airport.getCity());
        existingAirport.setCountry(airport.getCountry());
        existingAirport.setLatitude(airport.getLatitude());
        existingAirport.setLongitude(airport.getLongitude());
        airportRepository.save(existingAirport);
    }

    public void deleteAirport(Long id) {
        airportRepository.deleteById(id);
    }
}
