package lk.easyCar.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BookingDetails {
    @Id
    private String bookDetailID;

    private String bookLoseWFee;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "bID",referencedColumnName = "bookID")
    private Booking bID;

    @ManyToOne
    @JoinColumn(name = "cID",referencedColumnName = "carID")
    private Vehicle cID;

    @ManyToOne
    @JoinColumn(name = "dIC",referencedColumnName = "driver_NIC")
    private Driver dIC;

    public BookingDetails() {
    }

    public BookingDetails(String bookDetailID, String bookLoseWFee, Booking bID, Vehicle cID, Driver dIC) {
        this.bookDetailID = bookDetailID;
        this.bookLoseWFee = bookLoseWFee;
        this.bID = bID;
        this.cID = cID;
        this.dIC = dIC;
    }

    public String getBookDetailID() {
        return bookDetailID;
    }

    public void setBookDetailID(String bookDetailID) {
        this.bookDetailID = bookDetailID;
    }

    public String getBookLoseWFee() {
        return bookLoseWFee;
    }

    public void setBookLoseWFee(String bookLoseWFee) {
        this.bookLoseWFee = bookLoseWFee;
    }

    public Booking getbID() {
        return bID;
    }

    public void setbID(Booking bID) {
        this.bID = bID;
    }

    public Vehicle getcID() {
        return cID;
    }

    public void setcID(Vehicle cID) {
        this.cID = cID;
    }

    public Driver getdIC() {
        return dIC;
    }

    public void setdIC(Driver dIC) {
        this.dIC = dIC;
    }
}
