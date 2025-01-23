package com.example.flight.service;

import com.example.flight.exception.KnownException;
import com.example.flight.mapper.BookingMapper;
import com.example.flight.model.Booking;
import com.example.flight.pojo.BookingDTO;
import com.example.flight.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookingService {
    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    BookingMapper bookingMapper;
    public List<BookingDTO> getBooking() {
        return bookingRepository.findAll().stream().
                map(bookingMapper :: entityToDtoMapper).
                collect(Collectors.toList());
    }
    public BookingDTO getBooking(long id) {
        return bookingMapper.entityToDtoMapper(bookingRepository.findById(id).orElseThrow(() -> new KnownException("Booking with id " + id + " not found")));
    }

    public void addBooking(Booking booking) {
        bookingRepository.save(booking);
    }


    public void updateBooking(long id, Booking booking) {
        Booking booking1 = bookingRepository.findById(id).orElseThrow(() -> new KnownException("Booking with id " + id + " not found"));
        booking1.setBookingDate(booking.getBookingDate());
        booking1.setPassenger(booking.getPassenger());
        booking1.setStatus(booking.getStatus());
        booking1.setScheduledFlight(booking.getScheduledFlight());
        bookingRepository.save(booking1);
    }

    public void deleteBooking(long id){
        bookingRepository.deleteById(id);
    }
}
