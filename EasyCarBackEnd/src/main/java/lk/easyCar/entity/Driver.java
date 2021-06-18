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
public class Driver {
    @Id
    private String driver_NIC;
    private  String driver_name;
    private String driver_Address;
    private int driver_contact;
    private String driver_Stauts;
    private String driver_ShecduleDec;
    private String userName;
    private String password;

}
