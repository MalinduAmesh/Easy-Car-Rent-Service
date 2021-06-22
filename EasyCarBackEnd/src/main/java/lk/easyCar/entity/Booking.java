
package lk.easyCar.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Booking {
    @Id
    private String bookID;
    private String bookStatus;
    private String bookLosWaiverRecipt;
    private String bookPickUpDate;
    private String bookReturnDate;
    private String bookRentTotal;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "cusID",referencedColumnName = "cusNicID")
    private User cusID;

    @OneToMany(mappedBy = "bID",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<BookingDetails>bookingDetails =  new ArrayList<>();


    public Booking() {
    }

    public Booking(String bookID, String bookStatus, String bookLosWaiverRecipt, String bookPickUpDate, String bookReturnDate, String bookRentTotal, User cusID, List<BookingDetails> bookingDetails) {
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

    public List<BookingDetails> getBookingDetails() {
        return bookingDetails;
    }

    public void setBookingDetails(List<BookingDetails> bookingDetails) {
        this.bookingDetails = bookingDetails;
    }
}
