package com.example.flight.mapper;

import com.example.flight.model.Passenger;
import com.example.flight.pojo.PassengerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")

public interface PassengerMapper {
    PassengerMapper instance =  Mappers.getMapper(PassengerMapper.class);
    PassengerDTO entityToDto(Passenger dto);
    Passenger DtoToEntityMapper(Passenger entity);
}
