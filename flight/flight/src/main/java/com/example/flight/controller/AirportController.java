package com.example.flight.controller;


import com.example.flight.model.Airport;
import com.example.flight.pojo.AirportDTO;
import com.example.flight.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/airports")
public class AirportController {

    @Autowired
    private AirportService airportService;

    @GetMapping
    public ResponseEntity<List<AirportDTO>> getAirports() {
        List<AirportDTO> airport = airportService.getAirport();
        return ResponseEntity.ok(airport);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AirportDTO> getAirport(@PathVariable Long id) {
        AirportDTO airport = airportService.getAirport(id);
        return ResponseEntity.ok(airport);
    }

    @PostMapping("/list")
    public ResponseEntity<String> addAirports(@RequestBody List<Airport> airports) {
        for (Airport airport : airports) {
            airportService.addAirport(airport);
        }
        return ResponseEntity.ok("Airports added successfully");
    }

    @PostMapping
    public ResponseEntity<String> addAirport(@RequestBody Airport airport) {
        airportService.addAirport(airport);
        return ResponseEntity.ok("Airport added successfully");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateAirport(@PathVariable long id, @RequestBody Airport airport) {
        airportService.updateAirport(id, airport);
        return ResponseEntity.ok("Airport updated successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAirport(@PathVariable Long id) {
        airportService.deleteAirport(id);
        return ResponseEntity.ok("Airport deleted successfully");
    }
}

