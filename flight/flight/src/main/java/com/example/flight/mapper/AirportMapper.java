package com.example.flight.mapper;

import com.example.flight.model.Airport;
import com.example.flight.pojo.AirportDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AirportMapper {
	AirportMapper instance =  Mappers.getMapper(AirportMapper.class);
	AirportDTO entityToDtoMapper(Airport entity);
	Airport dtoToEntityMapper(AirportDTO dto);

}
