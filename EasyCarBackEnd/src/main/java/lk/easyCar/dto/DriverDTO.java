package lk.easyCar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class DriverDTO {

    private String driver_NIC;
    private  String driver_name;
    private String driver_Address;
    private int driver_contact;
    private String driver_Stauts;
    private String driver_ShecduleDec;
    private String userName;
    private String password;

    public DriverDTO() {
    }

    public DriverDTO(String driver_NIC, String driver_name, String driver_Address, int driver_contact, String driver_Stauts, String driver_ShecduleDec, String userName, String password) {
        this.driver_NIC = driver_NIC;
        this.driver_name = driver_name;
        this.driver_Address = driver_Address;
        this.driver_contact = driver_contact;
        this.driver_Stauts = driver_Stauts;
        this.driver_ShecduleDec = driver_ShecduleDec;
        this.userName = userName;
        this.password = password;
    }

    public String getDriver_NIC() {
        return driver_NIC;
    }

    public void setDriver_NIC(String driver_NIC) {
        this.driver_NIC = driver_NIC;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public String getDriver_Address() {
        return driver_Address;
    }

    public void setDriver_Address(String driver_Address) {
        this.driver_Address = driver_Address;
    }

    public int getDriver_contact() {
        return driver_contact;
    }

    public void setDriver_contact(int driver_contact) {
        this.driver_contact = driver_contact;
    }

    public String getDriver_Stauts() {
        return driver_Stauts;
    }

    public void setDriver_Stauts(String driver_Stauts) {
        this.driver_Stauts = driver_Stauts;
    }

    public String getDriver_ShecduleDec() {
        return driver_ShecduleDec;
    }

    public void setDriver_ShecduleDec(String driver_ShecduleDec) {
        this.driver_ShecduleDec = driver_ShecduleDec;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "DriverDTO{" +
                "driver_NIC='" + driver_NIC + '\'' +
                ", driver_name='" + driver_name + '\'' +
                ", driver_Address='" + driver_Address + '\'' +
                ", driver_contact=" + driver_contact +
                ", driver_Stauts='" + driver_Stauts + '\'' +
                ", driver_ShecduleDec='" + driver_ShecduleDec + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
