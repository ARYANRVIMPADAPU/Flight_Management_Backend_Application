package com.example.flight.mapper;

import com.example.flight.model.Airport;
import com.example.flight.pojo.AirportDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-08T15:55:58+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class AirportMapperImpl implements AirportMapper {

    @Override
    public AirportDTO entityToDtoMapper(Airport entity) {
        if ( entity == null ) {
            return null;
        }

        AirportDTO airportDTO = new AirportDTO();

        airportDTO.setId( entity.getId() );
        airportDTO.setCode( entity.getCode() );
        airportDTO.setName( entity.getName() );
        airportDTO.setCity( entity.getCity() );
        airportDTO.setCountry( entity.getCountry() );

        return airportDTO;
    }

    @Override
    public Airport dtoToEntityMapper(AirportDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Airport airport = new Airport();

        airport.setId( dto.getId() );
        airport.setCode( dto.getCode() );
        airport.setName( dto.getName() );
        airport.setCity( dto.getCity() );
        airport.setCountry( dto.getCountry() );

        return airport;
    }
}
