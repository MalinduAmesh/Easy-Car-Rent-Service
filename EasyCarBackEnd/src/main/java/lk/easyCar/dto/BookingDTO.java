package lk.easyCar.dto;


import java.util.ArrayList;
import java.util.List;

public class BookingDTO {

    private String bookID;
    private String bookStatus;
    private String bookLosWaiverRecipt;
    private String bookPickUpDate;
    private String bookReturnDate;
    private String bookRentTotal;

    private UserDTO userDTO;
    private List<BookingDetailsDTO> bookingDetailsDTOS =  new ArrayList<>();

    public BookingDTO() {
    }

    public BookingDTO(String bookID, String bookStatus, String bookLosWaiverRecipt, String bookPickUpDate, String bookReturnDate, String bookRentTotal, UserDTO userDTO, List<BookingDetailsDTO> bookingDetailsDTOS) {
        this.bookID = bookID;
        this.bookStatus = bookStatus;
        this.bookLosWaiverRecipt = bookLosWaiverRecipt;
        this.bookPickUpDate = bookPickUpDate;
        this.bookReturnDate = bookReturnDate;
        this.bookRentTotal = bookRentTotal;
        this.userDTO = userDTO;
        this.bookingDetailsDTOS = bookingDetailsDTOS;
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

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public List<BookingDetailsDTO> getBookingDetailsDTOS() {
        return bookingDetailsDTOS;
    }

    public void setBookingDetailsDTOS(List<BookingDetailsDTO> bookingDetailsDTOS) {
        this.bookingDetailsDTOS = bookingDetailsDTOS;
    }
}
