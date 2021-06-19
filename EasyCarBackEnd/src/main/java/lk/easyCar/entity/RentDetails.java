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

    @EmbeddedId
    private Car_RentDetails_FK fk;


//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private String rentDetailID;

    private String rentLosWaiver;
    private String rentDetReturnDate;
    private String rentLosWaiverRecipt;
    private String rentTotal;


    @ManyToOne
    @JoinColumn(name = "rentID",referencedColumnName = "rentID",insertable = false,updatable = false)
    private Rent rentID;

    @ManyToOne
    @JoinColumn(name = "carID",referencedColumnName = "carID",insertable = false,updatable = false)
    private Vehicle carID;

    @ManyToOne
    @JoinColumn(name = "driver_NIC",referencedColumnName = "driver_NIC",insertable = false,updatable = false)
     private Driver driver_NIC;

}