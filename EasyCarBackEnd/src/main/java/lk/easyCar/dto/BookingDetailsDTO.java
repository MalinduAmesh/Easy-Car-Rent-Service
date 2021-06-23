package lk.easyCar.dto;

import lk.easyCar.entity.Booking;
import lk.easyCar.entity.Driver;
import lk.easyCar.entity.Vehicle;

public class BookingDetailsDTO {

    private String bookDetailID;
    private String bookLoseWFee;

    private Booking bID;
    private Vehicle cID;
    private Driver dIC;



    public BookingDetailsDTO() {
    }

    public BookingDetailsDTO(String bookDetailID, String bookLoseWFee, Booking bID, Vehicle cID, Driver dIC) {
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

    @Override
    public String toString() {
        return "BookingDetailsDTO{" +
                "bookDetailID='" + bookDetailID + '\'' +
                ", bookLoseWFee='" + bookLoseWFee + '\'' +
                ", bID=" + bID +
                ", cID=" + cID +
                ", dIC=" + dIC +
                '}';
    }
}
