package com.example.flight.mapper;

import com.example.flight.model.Booking;
import com.example.flight.pojo.BookingDTO;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface BookingMapper {

	@Mapping(target = "bookingDate", expression = "java(booking.getBookingDate() != null ? booking.getBookingDate().format(java.time.format.DateTimeFormatter.ofPattern(\"dd-MM-yy\")) : null)")
	BookingDTO entityToDtoMapper(Booking booking);

	@Mapping(source = "status", target = "status")
		//@Mapping(source = "bookingDate", target = "dto.bookingDate")
	Booking dtoToEntityMapper(BookingDTO dto);

	@AfterMapping
	default void afterMapping(@MappingTarget BookingDTO dto, Booking entity) {
		dto.setStatus(entity.getStatus().toUpperCase());
	}
}
