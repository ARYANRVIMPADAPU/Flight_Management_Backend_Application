package com.example.flight.mapper;

import com.example.flight.model.Airport;
import com.example.flight.model.Flight;
import com.example.flight.model.Schedule;
import com.example.flight.model.ScheduledFlight;
import com.example.flight.pojo.AirportDTO;
import com.example.flight.pojo.FlightDTO;
import com.example.flight.pojo.ScheduleDTO;
import com.example.flight.pojo.ScheduledFlightDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-08T15:55:58+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class ScheduledFlightMapperImpl implements ScheduledFlightMapper {

    @Override
    public ScheduledFlightDTO entityToDtoMapper(ScheduledFlight entity) {
        if ( entity == null ) {
            return null;
        }

        ScheduledFlightDTO scheduledFlightDTO = new ScheduledFlightDTO();

        scheduledFlightDTO.setId( entity.getId() );
        scheduledFlightDTO.setFlight( flightToFlightDTO( entity.getFlight() ) );
        scheduledFlightDTO.setSchedule( scheduleToScheduleDTO( entity.getSchedule() ) );
        scheduledFlightDTO.setAvailableSeats( entity.getAvailableSeats() );

        return scheduledFlightDTO;
    }

    @Override
    public ScheduledFlight dtoToEntityMapper(ScheduledFlightDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ScheduledFlight scheduledFlight = new ScheduledFlight();

        scheduledFlight.setId( dto.getId() );
        scheduledFlight.setFlight( flightDTOToFlight( dto.getFlight() ) );
        scheduledFlight.setSchedule( scheduleDTOToSchedule( dto.getSchedule() ) );
        scheduledFlight.setAvailableSeats( dto.getAvailableSeats() );

        return scheduledFlight;
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
}
