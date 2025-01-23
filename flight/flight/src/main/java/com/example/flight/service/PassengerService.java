package com.example.flight.service;

import com.example.flight.exception.KnownException;
import com.example.flight.mapper.PassengerMapper;
import com.example.flight.model.Passenger;
import com.example.flight.pojo.PassengerDTO;
import com.example.flight.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PassengerService {
    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    PassengerMapper passengerMapper;
    public List<PassengerDTO> getPassenger() {

        return passengerRepository.findAll().stream().
                map(passengerMapper :: entityToDto).collect(Collectors.toList());
    }

    public PassengerDTO getPassenger(long id) {
        return passengerMapper.entityToDto(passengerRepository.findById(id).orElseThrow(() -> new KnownException("Flight with id " + id + " not found")));
    }

    public void addPassenger(Passenger passenger) {
        passengerRepository.save(passenger);
    }

    public void updatePassenger(long id, Passenger passenger) {
        Passenger existingPassenger = passengerRepository.findById(id).orElseThrow(() -> new KnownException("Flight with id " + id + " not found"));

            existingPassenger.setFirstName(passenger.getFirstName());
            existingPassenger.setLastName(passenger.getLastName());
            existingPassenger.setEmail(passenger.getEmail());
            existingPassenger.setDob(passenger.getDob());
            existingPassenger.setPhoneNo(passenger.getPhoneNo());
            passengerRepository.save(existingPassenger);
    }

    public void deletePassenger(Long id) {
        passengerRepository.deleteById(id);
    }
}
