package com.example.flight.mapper;

import com.example.flight.model.Flight;
import com.example.flight.pojo.FlightDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-08T15:55:58+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class FlightMapperImpl implements FlightMapper {

    @Override
    public FlightDTO entityToDto(Flight entity) {
        if ( entity == null ) {
            return null;
        }

        FlightDTO flightDTO = new FlightDTO();

        flightDTO.setId( entity.getId() );
        flightDTO.setFlightNo( entity.getFlightNo() );
        flightDTO.setCarrierName( entity.getCarrierName() );
        flightDTO.setFlightModel( entity.getFlightModel() );

        return flightDTO;
    }

    @Override
    public Flight dtoToEntity(FlightDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Flight flight = new Flight();

        flight.setId( dto.getId() );
        flight.setFlightNo( dto.getFlightNo() );
        flight.setCarrierName( dto.getCarrierName() );
        flight.setFlightModel( dto.getFlightModel() );

        return flight;
    }
}
