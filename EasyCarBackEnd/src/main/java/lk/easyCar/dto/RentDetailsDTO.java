package lk.easyCar.dto;

import lk.easyCar.entity.Driver;
import lk.easyCar.entity.Rent;
import lk.easyCar.entity.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class RentDetailsDTO {

    private String rentDetailID;

    private String rentLosWaiver;
    private String pickUpDate;
    private String returnDate;
    private String rentLosWaiverRecipt;
    private String rentTotal;
    private String rentStatus;

    private Driver dIC;
    private Rent rID;
    private Vehicle cID;

    public RentDetailsDTO() {
    }

//    @Override
//    public String toString() {
//        return "RentDetailsDTO{" +
//                "rentDetailID='" + rentDetailID + '\'' +
//                ", rentLosWaiver='" + rentLosWaiver + '\'' +
//                ", pickUpDate='" + pickUpDate + '\'' +
//                ", returnDate='" + returnDate + '\'' +
//                ", rentLosWaiverRecipt='" + rentLosWaiverRecipt + '\'' +
//                ", rentTotal='" + rentTotal + '\'' +
//                ", rentStatus='" + rentStatus + '\'' +
//                ", dIC=" + dIC +
//                ", rID=" + rID +
//                ", cID=" + cID +
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

    public Driver getdIC() {
        return dIC;
    }

    public void setdIC(Driver dIC) {
        this.dIC = dIC;
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

    public RentDetailsDTO(String rentDetailID, String rentLosWaiver, String pickUpDate, String returnDate, String rentLosWaiverRecipt, String rentTotal, String rentStatus, Driver dIC, Rent rID, Vehicle cID) {
        this.rentDetailID = rentDetailID;
        this.rentLosWaiver = rentLosWaiver;
        this.pickUpDate = pickUpDate;
        this.returnDate = returnDate;
        this.rentLosWaiverRecipt = rentLosWaiverRecipt;
        this.rentTotal = rentTotal;
        this.rentStatus = rentStatus;
        this.dIC = dIC;
        this.rID = rID;
        this.cID = cID;
    }
}
