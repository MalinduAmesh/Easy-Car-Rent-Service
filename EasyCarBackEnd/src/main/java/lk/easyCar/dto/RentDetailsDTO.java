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


    private DriverDTO dIC;
    private RentDTO rID;
    private VehicleDTO cID;

    public RentDetailsDTO() {
    }

    public RentDetailsDTO(String rentDetailID, String rentLosWaiver, DriverDTO dIC, RentDTO rID, VehicleDTO cID) {
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

    public DriverDTO getdIC() {
        return dIC;
    }

    public void setdIC(DriverDTO dIC) {
        this.dIC = dIC;
    }

    public RentDTO getrID() {
        return rID;
    }

    public void setrID(RentDTO rID) {
        this.rID = rID;
    }

    public VehicleDTO getcID() {
        return cID;
    }

    public void setcID(VehicleDTO cID) {
        this.cID = cID;
    }
}
