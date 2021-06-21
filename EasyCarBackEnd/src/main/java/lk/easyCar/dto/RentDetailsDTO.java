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


    private Driver dIC;
    private Rent rID;
    private Vehicle cID;

    public RentDetailsDTO() {
    }

    public RentDetailsDTO(String rentDetailID, String rentLosWaiver, Driver dIC, Rent rID, Vehicle cID) {
        this.rentDetailID = rentDetailID;
        this.rentLosWaiver = rentLosWaiver;
        this.dIC = dIC;
        this.rID = rID;
        this.cID = cID;
    }

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
}
