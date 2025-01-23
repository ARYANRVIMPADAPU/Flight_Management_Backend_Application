package com.example.flight.pojo;

import jakarta.persistence.*;

import java.time.LocalDateTime;

public class ScheduleDTO {
    private long id;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private AirportDTO departureAirport;
    private AirportDTO arrivalAirport;

    public ScheduleDTO(){
    }

    public ScheduleDTO(long id, LocalDateTime departureTime, LocalDateTime arrivalTime, AirportDTO departureAirport, AirportDTO arrivalAirport) {
        this.id = id;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public AirportDTO getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(AirportDTO departureAirport) {
        this.departureAirport = departureAirport;
    }

    public AirportDTO getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(AirportDTO arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }
}
