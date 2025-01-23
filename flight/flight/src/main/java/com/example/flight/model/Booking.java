package com.example.flight.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;
    private LocalDateTime bookingDate;
    @ManyToOne
    @JoinColumn(name = "passenger_id")
    Passenger passenger;
    @ManyToOne
    private ScheduledFlight scheduledFlight;
    private String status;

    public Booking(long id, LocalDateTime bookingDate, Passenger passenger, String status, ScheduledFlight scheduledFlight) {
        this.id = id;
        this.bookingDate = bookingDate;
        this.passenger = passenger;
        this.status = status;
        this.scheduledFlight = scheduledFlight;
    }

    public Booking(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ScheduledFlight getScheduledFlight() {
        return scheduledFlight;
    }

    public void setScheduledFlight(ScheduledFlight scheduledFlight) {
        this.scheduledFlight = scheduledFlight;
    }
}