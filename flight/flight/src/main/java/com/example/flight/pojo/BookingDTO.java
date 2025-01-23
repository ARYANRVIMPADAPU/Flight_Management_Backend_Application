package com.example.flight.pojo;

import com.example.flight.model.Passenger;
import jakarta.persistence.*;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

public class BookingDTO {

    private long id;
    private String bookingDate;
    private PassengerDTO passenger;
    private ScheduledFlightDTO scheduledFlight;
    private String status;

    public BookingDTO(long id, String bookingDate, PassengerDTO passenger, String status, ScheduledFlightDTO scheduledFlight) {
        this.id = id;
        this.bookingDate = bookingDate;
        this.passenger = passenger;
        this.status = status;
        this.scheduledFlight = scheduledFlight;
    }

    public BookingDTO(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public PassengerDTO getPassenger() {
        return passenger;
    }

    public void setPassenger(PassengerDTO passenger) {
        this.passenger = passenger;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ScheduledFlightDTO getScheduledFlight() {
        return scheduledFlight;
    }

    public void setScheduledFlight(ScheduledFlightDTO scheduledFlight) {
        this.scheduledFlight = scheduledFlight;
    }
}