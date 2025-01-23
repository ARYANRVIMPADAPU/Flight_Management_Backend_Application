package com.example.flight.controller;

import com.example.flight.model.Passenger;
import com.example.flight.pojo.PassengerDTO;
import com.example.flight.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/passengers")
public class PassengerController {
    @Autowired
    PassengerService passengerService;
    @GetMapping
    public ResponseEntity<List<PassengerDTO>> getPassenger(){
        List<PassengerDTO> passenger = passengerService.getPassenger();
        return ResponseEntity.ok(passenger);
    }
    @GetMapping("/{id}")
    public ResponseEntity<PassengerDTO> getPassenger(@PathVariable Long id){
        PassengerDTO passenger = passengerService.getPassenger(id);
        return ResponseEntity.ok(passenger);
    }

    @PostMapping("/list")
    public ResponseEntity<String> addPassenger(@RequestBody List<Passenger> passengers){
        for (Passenger passenger : passengers) { passengerService.addPassenger(passenger); }
        return ResponseEntity.ok("Passenger added Successfully");
    }

    @PostMapping
    public ResponseEntity<String> addPassenger(@RequestBody Passenger passenger){
        passengerService.addPassenger(passenger);
        return ResponseEntity.ok("Passenger added Successfully");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updatePassenger(@PathVariable long id, @RequestBody Passenger passenger){
        passengerService.updatePassenger(id,passenger);
        return ResponseEntity.ok("Passenger updated Successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePassenger(@PathVariable Long id){
        passengerService.deletePassenger(id);
        return ResponseEntity.ok("Passenger deleted Successfully");
    }
}
