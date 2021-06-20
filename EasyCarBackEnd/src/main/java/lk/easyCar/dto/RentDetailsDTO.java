package lk.easyCar.dto;

import lk.easyCar.entity.Driver;
import lk.easyCar.entity.Rent;
import lk.easyCar.entity.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
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

}
