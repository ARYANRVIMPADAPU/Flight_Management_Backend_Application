package com.example.flight.service;

import com.example.flight.exception.KnownException;
import com.example.flight.mapper.FlightMapper;
import com.example.flight.model.Flight;
import com.example.flight.pojo.FlightDTO;
import com.example.flight.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private FlightMapper flightMapper;

    public List<FlightDTO> getFlights() {
        return flightRepository.findAll().stream().
                map(flightMapper :: entityToDto).
                collect(Collectors.toList());
    }

    public FlightDTO getFlights(Long id){
        //return flightRepository.findById(id).orElseThrow(() -> new KnownException("Flight with id " + id + " not found"));
        return flightMapper.entityToDto(flightRepository.findById(id).orElseThrow(() -> new KnownException("Flight with id " + id + " not found")));
    }

    public void addFlight(Flight flight) {
        flightRepository.save(flight);
    }


    public void updateFlight(long id, Flight flight) {
        Flight existingFlight = flightRepository.findById(id).orElseThrow(() -> new KnownException("Flight with id " + id + " not found"));
            existingFlight.setFlightNo(flight.getFlightNo());
            existingFlight.setFlightModel(flight.getFlightModel());
            existingFlight.setCarrierName(flight.getCarrierName());
            existingFlight.setSeatCapacity(flight.getSeatCapacity());
            flightRepository.save(existingFlight);

    }

    public void deleteFlight(Long id) {
        flightRepository.deleteById(id);
    }
}
