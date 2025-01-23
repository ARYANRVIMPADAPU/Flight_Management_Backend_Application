package com.example.flight.mapper;



import com.example.flight.model.Flight;
import com.example.flight.pojo.FlightDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface FlightMapper {

    FlightMapper INSTANCE = Mappers.getMapper(FlightMapper.class);

    FlightDTO entityToDto(Flight entity);

    Flight dtoToEntity(FlightDTO dto);
}
