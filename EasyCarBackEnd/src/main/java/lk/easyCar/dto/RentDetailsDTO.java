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

//    private String rentDetailID;

    private Car_RentDetails_FK fk;
    private String rentLosWaiver;
    private String rentDetReturnDate;
    private String rentLosWaiverRecipt;
    private String rentTotal;

}
