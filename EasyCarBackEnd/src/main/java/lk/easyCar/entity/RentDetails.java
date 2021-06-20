package lk.easyCar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.EmbeddedId;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
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
    @JoinColumn(name = "rID",referencedColumnName = "rentID")
    private Rent rID;

    @ManyToOne
    @JoinColumn(name = "cID",referencedColumnName = "carID")
    private Vehicle cID;

    @ManyToOne
    @JoinColumn(name = "dIC",referencedColumnName = "driver_NIC")
     private Driver dIC;

}