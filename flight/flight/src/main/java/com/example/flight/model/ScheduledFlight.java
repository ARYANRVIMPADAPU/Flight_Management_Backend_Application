package com.example.flight.model;

import jakarta.persistence.*;

@Entity
public class ScheduledFlight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Flight flight;
    @ManyToOne
    private Schedule schedule;
    private int availableSeats;

    public ScheduledFlight(){}

    public ScheduledFlight(long id, Flight flight, Schedule schedule, int availableSeats) {
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

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
}
