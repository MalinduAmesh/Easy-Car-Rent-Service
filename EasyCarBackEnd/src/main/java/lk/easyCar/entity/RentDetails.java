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






    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "rID",referencedColumnName = "rentID")
    private Rent rID;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "cID",referencedColumnName = "carID")
    private Vehicle cID;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "dIC",referencedColumnName = "driver_NIC")
     private Driver dIC;

    public RentDetails() {
    }

    public RentDetails(String rentDetailID, String rentLosWaiver, Rent rID, Vehicle cID, Driver dIC) {
        this.rentDetailID = rentDetailID;
        this.rentLosWaiver = rentLosWaiver;
        this.rID = rID;
        this.cID = cID;
        this.dIC = dIC;
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