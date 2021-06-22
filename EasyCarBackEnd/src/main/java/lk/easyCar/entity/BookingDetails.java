package lk.easyCar.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BookingDetails {
    @Id
    private String rentDetailID;

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
}
