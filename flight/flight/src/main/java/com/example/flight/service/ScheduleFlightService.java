package com.example.flight.service;

import com.example.flight.exception.KnownException;
import com.example.flight.mapper.ScheduledFlightMapper;
import com.example.flight.model.ScheduledFlight;
import com.example.flight.pojo.ScheduledFlightDTO;
import com.example.flight.repository.ScheduleFlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScheduleFlightService {
    @Autowired
    ScheduleFlightRepository scheduleFlightRepository;

    @Autowired
    ScheduledFlightMapper scheduledFlightMapper;
    public List<ScheduledFlightDTO> getSchedule() {
        return scheduleFlightRepository.findAll().stream().
                map(scheduledFlightMapper ::entityToDto).
                collect(Collectors.toList());
    }
    public ScheduledFlightDTO getSchedule(long id){
        return scheduledFlightMapper.entityToDto(scheduleFlightRepository.findById(id).orElseThrow(() -> new KnownException("ScheduleFlight with id " + id + " not found")));

    }


    public void addSchedule(ScheduledFlight scheduledFlight) {
        scheduleFlightRepository.save(scheduledFlight);
    }

    public void updateSchedule(long id, ScheduledFlight scheduledFlight) {
        ScheduledFlight scheduledFlight1 = scheduleFlightRepository.findById(id).orElseThrow(() -> new KnownException("ScheduleFlight with id " + id + " not found"));
        scheduledFlight1.setSchedule(scheduledFlight.getSchedule());
        scheduledFlight1.setFlight(scheduledFlight.getFlight());
        scheduledFlight1.setAvailableSeats(scheduledFlight.getAvailableSeats());
        scheduleFlightRepository.save(scheduledFlight1);

    }

    public void deleteSchedule(long id) {
        scheduleFlightRepository.deleteById(id);
    }
}
