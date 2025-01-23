package com.example.flight.controller;

import com.example.flight.model.Airport;
import com.example.flight.model.Booking;
import com.example.flight.pojo.BookingDTO;
import com.example.flight.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    @Autowired
    BookingService bookingService;

    @GetMapping
    public ResponseEntity<List<BookingDTO>> getBooking(){
        return ResponseEntity.ok(bookingService.getBooking());
    }
    @GetMapping("/{id}")
    public ResponseEntity<BookingDTO> getBooking(@PathVariable long id){
        return ResponseEntity.ok(bookingService.getBooking(id));
    }

    @PostMapping
    public ResponseEntity<String> addBooking(@RequestBody Booking booking){
        bookingService.addBooking(booking);
        return ResponseEntity.ok("Booking done successfully");
    }

    @PostMapping("/list")
    public ResponseEntity<String> addBooking(@RequestBody List<Booking> bookings){
        for (Booking booking : bookings) {
            bookingService.addBooking(booking);
        }
        return ResponseEntity.ok("Booking done successfully");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateBooking(@PathVariable long id, @RequestBody Booking booking){
        bookingService.updateBooking(id,booking);
        return ResponseEntity.ok("Booking update Successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBooking(@PathVariable long id){
        bookingService.deleteBooking(id);
        return ResponseEntity.ok("Booking deleted Successfully");
    }


}
