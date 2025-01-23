package com.example.flight.controller;

import com.example.flight.model.Flight;
import com.example.flight.pojo.FlightDTO;
import com.example.flight.repository.FlightRepository;
import com.example.flight.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
public class FlightController {
    @Autowired
    FlightService flightService;

    @GetMapping
    public ResponseEntity<List<FlightDTO>> getFlight(){
       List<FlightDTO> flight = flightService.getFlights();
       return ResponseEntity.ok(flight);
    }
    @GetMapping("/{id}")
    public ResponseEntity<FlightDTO> getFlight(@PathVariable Long id){
        FlightDTO flight = flightService.getFlights(id);
        return ResponseEntity.ok(flight);
    }

    @PostMapping
    public ResponseEntity<String> addFlight(@RequestBody Flight flight){
        flightService.addFlight(flight);
        return ResponseEntity.ok("Flight added Successfully");
    }

    @PostMapping("/list")
    public ResponseEntity<String> addFlight(@RequestBody List<Flight> flights){
        for (Flight flight : flights) { flightService.addFlight(flight); }
        return ResponseEntity.ok("Flight added Successfully");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateFlight(@PathVariable long id, @RequestBody Flight flight){
        flightService.updateFlight(id,flight);
        return ResponseEntity.ok("Flight updated Successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteFlight(@PathVariable Long id){
        flightService.deleteFlight(id);
        return ResponseEntity.ok("Flight deleted Successfully");
    }

}
