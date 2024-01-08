package com.platform.booking.service;

import com.platform.booking.domain.Booking;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    public  String makeBooking(Booking booking) {
        return "Successfully Booking";
    }

    public  String cancelBooking(String bookingId) {
        return "Successfully Cancelled Booking";
    }
}
