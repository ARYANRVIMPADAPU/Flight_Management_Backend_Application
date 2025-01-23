package com.example.flight.service;

import com.example.flight.exception.KnownException;
import com.example.flight.mapper.ScheduleMapper;
import com.example.flight.model.Schedule;
import com.example.flight.model.ScheduledFlight;
import com.example.flight.pojo.ScheduleDTO;
import com.example.flight.pojo.ScheduledFlightDTO;
import com.example.flight.repository.ScheduleRepository;
import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScheduleService {
    @Autowired
    ScheduleRepository scheduleRepository;

    @Autowired
    ScheduleMapper scheduleMapper;
    public List<ScheduleDTO> getSchedule() {
        return scheduleRepository.findAll().stream().
                map(scheduleMapper :: entityToDtoMapper).
                collect(Collectors.toList());
    }
    public ScheduleDTO getSchedule(long id){
        return scheduleMapper.entityToDtoMapper(scheduleRepository.findById(id).orElseThrow(() -> new KnownException("Schedule with id " + id + " not found")));
    }


    public void addSchedule(Schedule schedule) {
        scheduleRepository.save(schedule);
    }

    public void updateSchedule(long id, Schedule schedule) {
        Schedule schedule1 = scheduleRepository.findById(id).orElseThrow(() -> new KnownException("Schedule with id " + id + " not found"));
        schedule1.setArrivalAirport(schedule.getArrivalAirport());
        schedule1.setArrivalTime(schedule.getArrivalTime());
        schedule1.setDepartureAirport(schedule.getDepartureAirport());
        schedule1.setDepartureTime(schedule.getDepartureTime());
        scheduleRepository.save(schedule1);
    }

    public void deleteSchedule(long id) {
        scheduleRepository.deleteById(id);
    }
}
