package lk.easyCar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Vehicle {

    @Id
    private String carID;
    private String carModel;
    private String carType;
    private String carTransmissionType;
    private String carFuelType;
    private String carColor;
    private String carStatus;
    private String rentLosWaiver;
    private int passenger;

    private String carImg1;
    private String carImg2;
    private String carImg3;
    private String carImg4;

    private int carDailyRate;
    private int carMonthlyRate;
    private int carFreeKmForDay;
    private int carFreeKmForMonth;
    private int carPriceForExtraKm;
    
}
