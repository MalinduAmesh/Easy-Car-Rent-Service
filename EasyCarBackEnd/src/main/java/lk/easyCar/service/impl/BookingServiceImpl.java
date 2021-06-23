package lk.easyCar.service.impl;

import lk.easyCar.dto.BookingDTO;
import lk.easyCar.entity.Booking;
import lk.easyCar.exception.ValidationException;
import lk.easyCar.repo.BookingRepo;
import lk.easyCar.service.BookingService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepo bookingRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public boolean addBooking(BookingDTO bookingDTO) {
        if (bookingRepo.existsById(bookingDTO.getBookID())){
            throw new ValidationException( "Booking Already Exists");

        }

        Booking map = modelMapper.map(bookingDTO, Booking.class);
        bookingRepo.save(map);

        return true;
    }

    @Override
    public ArrayList<BookingDTO> getAllBookings() {
        List<Booking> bookings = bookingRepo.findAll();
        return modelMapper.map(bookings,new TypeToken<ArrayList<BookingDTO>>(){

        }.getType());
    }

    @Override
    public void updateBooking(BookingDTO bookingDTO) {
        if (bookingRepo.existsById(bookingDTO.getBookID())){
            Booking map = modelMapper.map(bookingDTO, Booking.class);
            bookingRepo.save(map);

            System.out.println("DEBUG@2"+bookingDTO);
        }
    }

    @Override
    public BookingDTO seacrhBooking(String id) {
        Optional<Booking> byId = bookingRepo.findById(id);

        if (byId.isPresent()){
            Booking booking = byId.get();
            return modelMapper.map(booking,BookingDTO.class);
        }

        return null;

    }
}
