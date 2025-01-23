package com.example.flight.mapper;

import com.example.flight.model.Airport;
import com.example.flight.model.Booking;
import com.example.flight.model.Flight;
import com.example.flight.model.Passenger;
import com.example.flight.model.Schedule;
import com.example.flight.model.ScheduledFlight;
import com.example.flight.pojo.AirportDTO;
import com.example.flight.pojo.BookingDTO;
import com.example.flight.pojo.FlightDTO;
import com.example.flight.pojo.PassengerDTO;
import com.example.flight.pojo.ScheduleDTO;
import com.example.flight.pojo.ScheduledFlightDTO;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-08T15:55:58+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class BookingMapperImpl implements BookingMapper {

    @Override
    public BookingDTO entityToDtoMapper(Booking booking) {
        if ( booking == null ) {
            return null;
        }

        BookingDTO bookingDTO = new BookingDTO();

        bookingDTO.setId( booking.getId() );
        bookingDTO.setPassenger( passengerToPassengerDTO( booking.getPassenger() ) );
        bookingDTO.setStatus( booking.getStatus() );
        bookingDTO.setScheduledFlight( scheduledFlightToScheduledFlightDTO( booking.getScheduledFlight() ) );

        bookingDTO.setBookingDate( booking.getBookingDate() != null ? booking.getBookingDate().format(java.time.format.DateTimeFormatter.ofPattern("dd-MM-yy")) : null );

        afterMapping( bookingDTO, booking );

        return bookingDTO;
    }

    @Override
    public Booking dtoToEntityMapper(BookingDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Booking booking = new Booking();

        booking.setStatus( dto.getStatus() );
        booking.setId( dto.getId() );
        if ( dto.getBookingDate() != null ) {
            booking.setBookingDate( LocalDateTime.parse( dto.getBookingDate() ) );
        }
        booking.setPassenger( passengerDTOToPassenger( dto.getPassenger() ) );
        booking.setScheduledFlight( scheduledFlightDTOToScheduledFlight( dto.getScheduledFlight() ) );

        return booking;
    }

    protected PassengerDTO passengerToPassengerDTO(Passenger passenger) {
        if ( passenger == null ) {
            return null;
        }

        PassengerDTO passengerDTO = new PassengerDTO();

        passengerDTO.setId( passenger.getId() );
        passengerDTO.setFirstName( passenger.getFirstName() );
        passengerDTO.setLastName( passenger.getLastName() );
        passengerDTO.setEmail( passenger.getEmail() );
        passengerDTO.setPhoneNo( passenger.getPhoneNo() );
        passengerDTO.setDob( passenger.getDob() );

        return passengerDTO;
    }

    protected FlightDTO flightToFlightDTO(Flight flight) {
        if ( flight == null ) {
            return null;
        }

        FlightDTO flightDTO = new FlightDTO();

        flightDTO.setId( flight.getId() );
        flightDTO.setFlightNo( flight.getFlightNo() );
        flightDTO.setCarrierName( flight.getCarrierName() );
        flightDTO.setFlightModel( flight.getFlightModel() );

        return flightDTO;
    }

    protected AirportDTO airportToAirportDTO(Airport airport) {
        if ( airport == null ) {
            return null;
        }

        AirportDTO airportDTO = new AirportDTO();

        airportDTO.setId( airport.getId() );
        airportDTO.setCode( airport.getCode() );
        airportDTO.setName( airport.getName() );
        airportDTO.setCity( airport.getCity() );
        airportDTO.setCountry( airport.getCountry() );

        return airportDTO;
    }

    protected ScheduleDTO scheduleToScheduleDTO(Schedule schedule) {
        if ( schedule == null ) {
            return null;
        }

        ScheduleDTO scheduleDTO = new ScheduleDTO();

        scheduleDTO.setId( schedule.getId() );
        scheduleDTO.setDepartureTime( schedule.getDepartureTime() );
        scheduleDTO.setArrivalTime( schedule.getArrivalTime() );
        scheduleDTO.setDepartureAirport( airportToAirportDTO( schedule.getDepartureAirport() ) );
        scheduleDTO.setArrivalAirport( airportToAirportDTO( schedule.getArrivalAirport() ) );

        return scheduleDTO;
    }

    protected ScheduledFlightDTO scheduledFlightToScheduledFlightDTO(ScheduledFlight scheduledFlight) {
        if ( scheduledFlight == null ) {
            return null;
        }

        ScheduledFlightDTO scheduledFlightDTO = new ScheduledFlightDTO();

        scheduledFlightDTO.setId( scheduledFlight.getId() );
        scheduledFlightDTO.setFlight( flightToFlightDTO( scheduledFlight.getFlight() ) );
        scheduledFlightDTO.setSchedule( scheduleToScheduleDTO( scheduledFlight.getSchedule() ) );
        scheduledFlightDTO.setAvailableSeats( scheduledFlight.getAvailableSeats() );

        return scheduledFlightDTO;
    }

    protected Passenger passengerDTOToPassenger(PassengerDTO passengerDTO) {
        if ( passengerDTO == null ) {
            return null;
        }

        Passenger passenger = new Passenger();

        passenger.setId( passengerDTO.getId() );
        passenger.setFirstName( passengerDTO.getFirstName() );
        passenger.setLastName( passengerDTO.getLastName() );
        passenger.setEmail( passengerDTO.getEmail() );
        passenger.setPhoneNo( passengerDTO.getPhoneNo() );
        passenger.setDob( passengerDTO.getDob() );

        return passenger;
    }

    protected Flight flightDTOToFlight(FlightDTO flightDTO) {
        if ( flightDTO == null ) {
            return null;
        }

        Flight flight = new Flight();

        flight.setId( flightDTO.getId() );
        flight.setFlightNo( flightDTO.getFlightNo() );
        flight.setCarrierName( flightDTO.getCarrierName() );
        flight.setFlightModel( flightDTO.getFlightModel() );

        return flight;
    }

    protected Airport airportDTOToAirport(AirportDTO airportDTO) {
        if ( airportDTO == null ) {
            return null;
        }

        Airport airport = new Airport();

        airport.setId( airportDTO.getId() );
        airport.setCode( airportDTO.getCode() );
        airport.setName( airportDTO.getName() );
        airport.setCity( airportDTO.getCity() );
        airport.setCountry( airportDTO.getCountry() );

        return airport;
    }

    protected Schedule scheduleDTOToSchedule(ScheduleDTO scheduleDTO) {
        if ( scheduleDTO == null ) {
            return null;
        }

        Schedule schedule = new Schedule();

        schedule.setId( scheduleDTO.getId() );
        schedule.setDepartureTime( scheduleDTO.getDepartureTime() );
        schedule.setArrivalTime( scheduleDTO.getArrivalTime() );
        schedule.setDepartureAirport( airportDTOToAirport( scheduleDTO.getDepartureAirport() ) );
        schedule.setArrivalAirport( airportDTOToAirport( scheduleDTO.getArrivalAirport() ) );

        return schedule;
    }

    protected ScheduledFlight scheduledFlightDTOToScheduledFlight(ScheduledFlightDTO scheduledFlightDTO) {
        if ( scheduledFlightDTO == null ) {
            return null;
        }

        ScheduledFlight scheduledFlight = new ScheduledFlight();

        scheduledFlight.setId( scheduledFlightDTO.getId() );
        scheduledFlight.setFlight( flightDTOToFlight( scheduledFlightDTO.getFlight() ) );
        scheduledFlight.setSchedule( scheduleDTOToSchedule( scheduledFlightDTO.getSchedule() ) );
        scheduledFlight.setAvailableSeats( scheduledFlightDTO.getAvailableSeats() );

        return scheduledFlight;
    }
}
