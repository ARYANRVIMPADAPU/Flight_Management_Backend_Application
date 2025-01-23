package com.example.flight.mapper;

import com.example.flight.model.Airport;
import com.example.flight.model.Schedule;
import com.example.flight.pojo.AirportDTO;
import com.example.flight.pojo.ScheduleDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-08T15:55:58+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class ScheduleMapperImpl implements ScheduleMapper {

    @Override
    public ScheduleDTO entityToDtoMapper(Schedule entity) {
        if ( entity == null ) {
            return null;
        }

        ScheduleDTO scheduleDTO = new ScheduleDTO();

        scheduleDTO.setId( entity.getId() );
        scheduleDTO.setDepartureTime( entity.getDepartureTime() );
        scheduleDTO.setArrivalTime( entity.getArrivalTime() );
        scheduleDTO.setDepartureAirport( airportToAirportDTO( entity.getDepartureAirport() ) );
        scheduleDTO.setArrivalAirport( airportToAirportDTO( entity.getArrivalAirport() ) );

        return scheduleDTO;
    }

    @Override
    public Schedule dtoToEntityMapper(ScheduleDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Schedule schedule = new Schedule();

        schedule.setId( dto.getId() );
        schedule.setDepartureTime( dto.getDepartureTime() );
        schedule.setArrivalTime( dto.getArrivalTime() );
        schedule.setDepartureAirport( airportDTOToAirport( dto.getDepartureAirport() ) );
        schedule.setArrivalAirport( airportDTOToAirport( dto.getArrivalAirport() ) );

        return schedule;
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
}
