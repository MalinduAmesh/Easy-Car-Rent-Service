package lk.easyCar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DriverDTO {

    private String driver_NIC;
    private  String driver_name;
    private String driver_Address;
    private int driver_contact;
    private String driver_Stauts;
    private String driver_ShecduleDec;
    private String userName;
    private String password;

}
