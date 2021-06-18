package lk.easyCar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    @Id
    private String cusNicID;
    private String name;
    private String address;
    private String email;
    private String password;
    private String nicImage;
    private String licNo;
    private String licImage;
    private String contact;


}
