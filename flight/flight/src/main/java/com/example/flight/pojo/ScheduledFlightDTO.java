package com.example.flight.pojo;

import jakarta.persistence.*;
import org.springframework.stereotype.Service;


public class ScheduledFlightDTO {

    private long id;
    private FlightDTO flight;
    private ScheduleDTO schedule;
    private int availableSeats;

    public ScheduledFlightDTO(){}

    public ScheduledFlightDTO(long id, FlightDTO flight, ScheduleDTO schedule, int availableSeats) {
        this.id = id;
        this.flight = flight;
        this.schedule = schedule;
        this.availableSeats = availableSeats;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public FlightDTO getFlight() {
        return flight;
    }

    public void setFlight(FlightDTO flight) {
        this.flight = flight;
    }

    public ScheduleDTO getSchedule() {
        return schedule;
    }

    public void setSchedule(ScheduleDTO schedule) {
        this.schedule = schedule;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
}
