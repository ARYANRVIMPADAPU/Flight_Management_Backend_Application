package com.example.flight.mapper;

import com.example.flight.model.Schedule;
import com.example.flight.model.ScheduledFlight;
import com.example.flight.pojo.ScheduleDTO;
import com.example.flight.pojo.ScheduledFlightDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.scheduling.annotation.Scheduled;

@Mapper(componentModel = "spring")
public interface ScheduleMapper {
    ScheduleMapper INSTANCE = Mappers.getMapper(ScheduleMapper.class);

    ScheduleDTO entityToDtoMapper(Schedule entity);

    Schedule dtoToEntityMapper(ScheduleDTO dto);
}
