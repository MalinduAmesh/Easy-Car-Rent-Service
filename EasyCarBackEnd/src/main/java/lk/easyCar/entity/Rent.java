package lk.easyCar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Rent {


    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String rentID;
    private String rentDate;
    private String rentStatus;
    private String rentLosWaiverRecipt;
    private String rentTotal;

    @ManyToOne
    @JoinColumn(name = "cusID",referencedColumnName = "cusNicID")
    private User cusID;

    @OneToMany(mappedBy = "rID",cascade = CascadeType.ALL)
    private List<RentDetails> rentDetails = new ArrayList<>();

}
