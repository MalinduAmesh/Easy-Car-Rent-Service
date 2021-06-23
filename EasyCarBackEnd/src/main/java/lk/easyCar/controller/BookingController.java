package lk.easyCar.controller;


import lk.easyCar.dto.BookingDTO;
import lk.easyCar.exception.NotFoundException;
import lk.easyCar.service.BookingService;
import lk.easyCar.utill.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/booking")
@CrossOrigin
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping
    public ResponseEntity saveBooking (@RequestBody BookingDTO bookingDTO){
        if (bookingDTO.getBookID().trim().length()<=0){
            throw new NotFoundException("Booking id Cannot to be null");

        }
        bookingService.addBooking(bookingDTO);

        return new ResponseEntity(new StandardResponse("201","Done",bookingDTO), HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity allBookings(){
        ArrayList<BookingDTO> bookingDTOS = bookingService.getAllBookings();
        return new ResponseEntity(new StandardResponse("200","Done",bookingDTOS),  HttpStatus.CREATED);

    }

    @GetMapping(path = "/{id}")
    public ResponseEntity searchBooking(@PathVariable String id){
        BookingDTO bookingDTO = bookingService.seacrhBooking(id);
        return new ResponseEntity(new StandardResponse("200","Done",bookingDTO), HttpStatus.OK);

    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateBooking(@RequestBody BookingDTO bookingDTO){
        if (bookingDTO.getBookID().trim().length()<=0){
            throw new NotFoundException("No ID Provider Update");

        }
        System.out.println("Debug 1"+bookingDTO);
        bookingService.updateBooking(bookingDTO);
        System.out.println("Debug 3"+bookingDTO);

        return new ResponseEntity(new StandardResponse("200","Done",bookingDTO), HttpStatus.OK);


    }

}
