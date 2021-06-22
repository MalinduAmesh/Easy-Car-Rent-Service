package lk.easyCar.dto;

import lk.easyCar.entity.RentDetails;
import lk.easyCar.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

//@AllArgsConstructor
//@NoArgsConstructor
//@Data
public class RentDTO {

    private String rentID;
    private String rentStatus;
    private String rentLosWaiverRecipt;
    private String pickUpDate;
    private String returnDate;
    private String rentTotal;

    private User cusID;
    private List<RentDetailsDTO> rentDetails = new ArrayList<>();


    public RentDTO() {
    }

    public RentDTO(String rentID, String rentStatus, String rentLosWaiverRecipt, String pickUpDate, String returnDate, String rentTotal, User cusID, List<RentDetailsDTO> rentDetails) {
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

    public List<RentDetailsDTO> getRentDetails() {
        return rentDetails;
    }

    public void setRentDetails(List<RentDetailsDTO> rentDetails) {
        this.rentDetails = rentDetails;
    }
}
