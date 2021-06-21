package lk.easyCar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Request {

    @Id
    private String rentID;
    private String rentStatus;
    private String rentLosWaiverRecipt;
    private String pickUpDate;
    private String returnDate;
    private String rentTotal;

}
