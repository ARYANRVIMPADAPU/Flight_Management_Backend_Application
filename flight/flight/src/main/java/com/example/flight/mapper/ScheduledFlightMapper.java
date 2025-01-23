package com.example.flight.mapper;

import com.example.flight.model.ScheduledFlight;
import com.example.flight.pojo.ScheduledFlightDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ScheduledFlightMapper {
    ScheduledFlightMapper INSTANCE = Mappers.getMapper(ScheduledFlightMapper.class);

    ScheduledFlightDTO entityToDto(ScheduledFlight entity);

    ScheduledFlight dtoToEntityMapper(ScheduledFlightDTO dto);
}
