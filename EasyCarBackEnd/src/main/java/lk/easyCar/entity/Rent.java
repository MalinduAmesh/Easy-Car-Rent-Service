package lk.easyCar.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;



@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Rent {

//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String rentID;
    private String rentStatus;
    private String rentLosWaiverRecipt;
    private String pickUpDate;
    private String returnDate;
    private String rentTotal;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "cusID",referencedColumnName = "cusNicID")
    private User cusID;

    @OneToMany(mappedBy = "rID",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<RentDetails> rentDetails = new ArrayList<>();

    public Rent() {
    }

    public Rent(String rentID, String rentStatus, String rentLosWaiverRecipt, String pickUpDate, String returnDate, String rentTotal, User cusID, List<RentDetails> rentDetails) {
        this.rentID = rentID;
        this.rentStatus = rentStatus;
        this.rentLosWaiverRecipt = rentLosWaiverRecipt;
        this.pickUpDate = pickUpDate;
        this.returnDate = returnDate;
        this.rentTotal = rentTotal;
        this.cusID = cusID;
        this.rentDetails = rentDetails;
    }

    public String getRentID() {
        return rentID;
    }

    public void setRentID(String rentID) {
        this.rentID = rentID;
    }

    public String getRentStatus() {
        return rentStatus;
    }

    public void setRentStatus(String rentStatus) {
        this.rentStatus = rentStatus;
    }

    public String getRentLosWaiverRecipt() {
        return rentLosWaiverRecipt;
    }

    public void setRentLosWaiverRecipt(String rentLosWaiverRecipt) {
        this.rentLosWaiverRecipt = rentLosWaiverRecipt;
    }

    public String getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(String pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getRentTotal() {
        return rentTotal;
    }

    public void setRentTotal(String rentTotal) {
        this.rentTotal = rentTotal;
    }

    public User getCusID() {
        return cusID;
    }

    public void setCusID(User cusID) {
        this.cusID = cusID;
    }

    public List<RentDetails> getRentDetails() {
        return rentDetails;
    }

    public void setRentDetails(List<RentDetails> rentDetails) {
        this.rentDetails = rentDetails;
    }
}
