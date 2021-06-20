package lk.easyCar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Car_RentDetails_FK implements Serializable {
    private String rentID;
    private String carID;



}
