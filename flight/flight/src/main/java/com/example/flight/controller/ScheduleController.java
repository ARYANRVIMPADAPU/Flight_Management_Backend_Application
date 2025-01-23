package com.example.flight.controller;


import com.example.flight.model.Schedule;
import com.example.flight.pojo.ScheduleDTO;
import com.example.flight.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schedules")
public class ScheduleController {
    @Autowired
    ScheduleService scheduleService;

    @GetMapping
    public ResponseEntity<List<ScheduleDTO>> getSchedule(){
        return ResponseEntity.ok(scheduleService.getSchedule());
    }
    @GetMapping("/{id}")
    public ResponseEntity<ScheduleDTO> getSchedule(@PathVariable long id){
        return ResponseEntity.ok(scheduleService.getSchedule(id));
    }

    @PostMapping
    public ResponseEntity<String> addSchedule(@RequestBody Schedule schedule){
        scheduleService.addSchedule(schedule);
        return ResponseEntity.ok("Schedule done successfully");
    }

    @PostMapping("/list")
    public ResponseEntity<String> addSchedule(@RequestBody List<Schedule> schedules){
        for (Schedule schedule : schedules) {
            scheduleService.addSchedule(schedule);
        }
        return ResponseEntity.ok("Schedule done successfully");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateSchedule(@PathVariable long id, @RequestBody Schedule schedule){
        scheduleService.updateSchedule(id,schedule);
        return ResponseEntity.ok("Schedule update Successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteSchedule(@PathVariable long id){
        scheduleService.deleteSchedule(id);
        return ResponseEntity.ok("Schedule deleted Successfully");
    }


}
