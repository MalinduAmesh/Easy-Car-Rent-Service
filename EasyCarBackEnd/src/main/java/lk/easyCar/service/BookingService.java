package lk.easyCar.service;

import lk.easyCar.dto.BookingDTO;
import lk.easyCar.entity.Booking;

import java.util.ArrayList;

public interface BookingService {

    boolean addBooking(BookingDTO bookingDTO);
    ArrayList<BookingDTO>getAllBookings();
    void updateBooking(BookingDTO bookingDTO);
    BookingDTO seacrhBooking(String id);
}
