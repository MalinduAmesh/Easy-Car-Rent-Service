package lk.easyCar.dto;


import lk.easyCar.entity.User;

import java.util.ArrayList;
import java.util.List;

public class BookingDTO {

    private String bookID;
    private String bookStatus;
    private String bookLosWaiverRecipt;
    private String bookPickUpDate;
    private String bookReturnDate;
    private String bookRentTotal;

    private User cusID;
    private List<BookingDetailsDTO> bookingDetails = new ArrayList<>();

    public BookingDTO() {
    }


    public BookingDTO(String bookID, String bookStatus, String bookLosWaiverRecipt, String bookPickUpDate, String bookReturnDate, String bookRentTotal, User cusID, List<BookingDetailsDTO> bookingDetails) {
        this.bookID = bookID;
        this.bookStatus = bookStatus;
        this.bookLosWaiverRecipt = bookLosWaiverRecipt;
        this.bookPickUpDate = bookPickUpDate;
        this.bookReturnDate = bookReturnDate;
        this.bookRentTotal = bookRentTotal;
        this.cusID = cusID;
        this.bookingDetails = bookingDetails;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

    public String getBookLosWaiverRecipt() {
        return bookLosWaiverRecipt;
    }

    public void setBookLosWaiverRecipt(String bookLosWaiverRecipt) {
        this.bookLosWaiverRecipt = bookLosWaiverRecipt;
    }

    public String getBookPickUpDate() {
        return bookPickUpDate;
    }

    public void setBookPickUpDate(String bookPickUpDate) {
        this.bookPickUpDate = bookPickUpDate;
    }

    public String getBookReturnDate() {
        return bookReturnDate;
    }

    public void setBookReturnDate(String bookReturnDate) {
        this.bookReturnDate = bookReturnDate;
    }

    public String getBookRentTotal() {
        return bookRentTotal;
    }

    public void setBookRentTotal(String bookRentTotal) {
        this.bookRentTotal = bookRentTotal;
    }

    public User getCusID() {
        return cusID;
    }

    public void setCusID(User cusID) {
        this.cusID = cusID;
    }

    public List<BookingDetailsDTO> getBookingDetails() {
        return bookingDetails;
    }

    public void setBookingDetails(List<BookingDetailsDTO> bookingDetails) {
        this.bookingDetails = bookingDetails;
    }

    @Override
    public String toString() {
        return "BookingDTO{" +
                "bookID='" + bookID + '\'' +
                ", bookStatus='" + bookStatus + '\'' +
                ", bookLosWaiverRecipt='" + bookLosWaiverRecipt + '\'' +
                ", bookPickUpDate='" + bookPickUpDate + '\'' +
                ", bookReturnDate='" + bookReturnDate + '\'' +
                ", bookRentTotal='" + bookRentTotal + '\'' +
                ", cusID=" + cusID +
                ", bookingDetails=" + bookingDetails +
                '}';
    }
}