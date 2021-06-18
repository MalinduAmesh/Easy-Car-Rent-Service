package lk.easyCar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VehicleDTO {
    private String carID;
    private String carModel;
    private String carType;
    private String carTransmissionType;
    private String carFuelType;
    private String carColor;
    private String carStatus;
    private String rentLosWaiver;
    private int passenger;
    private int carDailyRate;
    private int carMonthlyRate;
    private int carFreeKmForDay;
    private int carFreeKmForMonth;
    private int carPriceForExtraKm;

    private String carImg1;
    private String carImg2;
    private String carImg3;
    private String carImg4;

}
