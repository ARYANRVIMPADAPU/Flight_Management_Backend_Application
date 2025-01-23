package com.example.flight.repository;

import com.example.flight.model.ScheduledFlight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleFlightRepository extends JpaRepository<ScheduledFlight, Long> {
}
