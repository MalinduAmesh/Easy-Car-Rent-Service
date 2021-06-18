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
//    private Car_RentDetails_FK car_rentDetails_fk;
//


    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String rentDetailID;
    private String rentLosWaiver;

    @ManyToOne
    @JoinColumn(name = "rID",referencedColumnName = "rentID")
    private Rent rID;

    @ManyToOne
    @JoinColumn(name = "cID",referencedColumnName = "carID")
    private Vehicle cID;

    @ManyToOne
    @JoinColumn(name = "dNIC",referencedColumnName = "driver_NIC")
     private Driver dNIC;

}
