package com.platform.booking.controller;

import com.platform.booking.domain.Booking;
import com.platform.booking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @Autowired
    BookingService bookingService;

    @PostMapping("/makeBooking")
    public ResponseEntity<String> makeBooking(@RequestBody Booking booking) {
        String response = bookingService.makeBooking(booking);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/cancelBooking")
    public ResponseEntity<String> cancelBooking(@PathVariable String bookingId) {
        String response = bookingService.cancelBooking(bookingId);
        return ResponseEntity.ok(response);
    }
}
