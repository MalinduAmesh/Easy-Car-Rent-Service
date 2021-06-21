package lk.easyCar.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.EmbeddedId;
@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class RentDetails {

//    @EmbeddedId
//    private Car_RentDetails_FK fk;
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Id
    private String rentDetailID;

    private String rentLosWaiver;
    private String pickUpDate;
    private String returnDate;
    private String rentLosWaiverRecipt;
    private String rentTotal;
    private String rentStatus;


    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "rID",referencedColumnName = "rentID")
    private Rent rID;

    @ManyToOne
    @JoinColumn(name = "cID",referencedColumnName = "carID")
    private Vehicle cID;

    @ManyToOne
    @JoinColumn(name = "dIC",referencedColumnName = "driver_NIC")
     private Driver dIC;

    public RentDetails() {
    }

    public RentDetails(String rentDetailID, String rentLosWaiver, String pickUpDate, String returnDate, String rentLosWaiverRecipt, String rentTotal, String rentStatus, Rent rID, Vehicle cID, Driver dIC) {
        this.rentDetailID = rentDetailID;
        this.rentLosWaiver = rentLosWaiver;
        this.pickUpDate = pickUpDate;
        this.returnDate = returnDate;
        this.rentLosWaiverRecipt = rentLosWaiverRecipt;
        this.rentTotal = rentTotal;
        this.rentStatus = rentStatus;
        this.rID = rID;
        this.cID = cID;
        this.dIC = dIC;
    }

//    @Override
//    public String toString() {
//        return "RentDetails{" +
//                "rentDetailID='" + rentDetailID + '\'' +
//                ", rentLosWaiver='" + rentLosWaiver + '\'' +
//                ", pickUpDate='" + pickUpDate + '\'' +
//                ", returnDate='" + returnDate + '\'' +
//                ", rentLosWaiverRecipt='" + rentLosWaiverRecipt + '\'' +
//                ", rentTotal='" + rentTotal + '\'' +
//                ", rentStatus='" + rentStatus + '\'' +
//                ", rID=" + rID +
//                ", cID=" + cID +
//                ", dIC=" + dIC +
//                '}';
//    }

    public String getRentDetailID() {
        return rentDetailID;
    }

    public void setRentDetailID(String rentDetailID) {
        this.rentDetailID = rentDetailID;
    }

    public String getRentLosWaiver() {
        return rentLosWaiver;
    }

    public void setRentLosWaiver(String rentLosWaiver) {
        this.rentLosWaiver = rentLosWaiver;
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

    public String getRentLosWaiverRecipt() {
        return rentLosWaiverRecipt;
    }

    public void setRentLosWaiverRecipt(String rentLosWaiverRecipt) {
        this.rentLosWaiverRecipt = rentLosWaiverRecipt;
    }

    public String getRentTotal() {
        return rentTotal;
    }

    public void setRentTotal(String rentTotal) {
        this.rentTotal = rentTotal;
    }

    public String getRentStatus() {
        return rentStatus;
    }

    public void setRentStatus(String rentStatus) {
        this.rentStatus = rentStatus;
    }

    public Rent getrID() {
        return rID;
    }

    public void setrID(Rent rID) {
        this.rID = rID;
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