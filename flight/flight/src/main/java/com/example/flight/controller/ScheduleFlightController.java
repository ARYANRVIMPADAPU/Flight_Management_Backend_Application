package com.example.flight.controller;

import com.example.flight.model.Schedule;
import com.example.flight.model.ScheduledFlight;
import com.example.flight.pojo.ScheduledFlightDTO;
import com.example.flight.service.ScheduleFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/scheduleflight")
public class ScheduleFlightController {
    @Autowired
    ScheduleFlightService scheduleFlightService;
    @GetMapping
    public ResponseEntity<List<ScheduledFlightDTO>> getSchedule(){
        return ResponseEntity.ok(scheduleFlightService.getSchedule());
    }
    @GetMapping("/{id}")
    public ResponseEntity<ScheduledFlightDTO> getSchedule(@PathVariable long id){
        return ResponseEntity.ok(scheduleFlightService.getSchedule(id));
    }

    @PostMapping
    public ResponseEntity<String> addSchedule(@RequestBody ScheduledFlight scheduledFlight){
        scheduleFlightService.addSchedule(scheduledFlight);
        return ResponseEntity.ok("ScheduleFlight added successfully");
    }

    @PostMapping("/list")
    public ResponseEntity<String> addSchedule(@RequestBody List<ScheduledFlight> scheduledFlights){
        for (ScheduledFlight scheduledFlight : scheduledFlights) {
            scheduleFlightService.addSchedule(scheduledFlight);
        }
        return ResponseEntity.ok("ScheduleFlight added successfully");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateSchedule(@PathVariable long id, @RequestBody ScheduledFlight scheduledFlight){
        scheduleFlightService.updateSchedule(id,scheduledFlight);
        return ResponseEntity.ok("ScheduleFlight update Successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteSchedule(@PathVariable long id){
        scheduleFlightService.deleteSchedule(id);
        return ResponseEntity.ok("ScheduleFlight deleted Successfully");
    }

}
