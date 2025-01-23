package com.example.flight.mapper;

import com.example.flight.model.Passenger;
import com.example.flight.pojo.PassengerDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-08T15:55:58+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class PassengerMapperImpl implements PassengerMapper {

    @Override
    public PassengerDTO entityToDtoMapper(PassengerDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PassengerDTO passengerDTO = new PassengerDTO();

        passengerDTO.setId( dto.getId() );
        passengerDTO.setFirstName( dto.getFirstName() );
        passengerDTO.setLastName( dto.getLastName() );
        passengerDTO.setEmail( dto.getEmail() );
        passengerDTO.setPhoneNo( dto.getPhoneNo() );
        passengerDTO.setDob( dto.getDob() );

        return passengerDTO;
    }

    @Override
    public Passenger DtoToEntityMapper(Passenger entity) {
        if ( entity == null ) {
            return null;
        }

        Passenger passenger = new Passenger();

        passenger.setId( entity.getId() );
        passenger.setFirstName( entity.getFirstName() );
        passenger.setLastName( entity.getLastName() );
        passenger.setEmail( entity.getEmail() );
        passenger.setPhoneNo( entity.getPhoneNo() );
        passenger.setDob( entity.getDob() );

        return passenger;
    }
}
