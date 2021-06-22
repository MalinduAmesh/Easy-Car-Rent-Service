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

}
