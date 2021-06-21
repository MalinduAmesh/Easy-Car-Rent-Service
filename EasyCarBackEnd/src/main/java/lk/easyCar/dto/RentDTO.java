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

    private User cusID;
    private List<RentDetailsDTO> rentDetails = new ArrayList<>();

    public RentDTO(String rentID, User cusID, List<RentDetailsDTO> rentDetails) {
        this.rentID = rentID;
        this.cusID = cusID;
        this.rentDetails = rentDetails;
    }

    public RentDTO() {
    }


//
//    @Override
//    public String toString() {
//        return "RentDTO{" +
//                "rentID='" + rentID + '\'' +
//                ", cusID=" + cusID +
//                ", rentDetails=" + rentDetails +
//                '}';
//    }

    public String getRentID() {
        return rentID;
    }

    public void setRentID(String rentID) {
        this.rentID = rentID;
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
