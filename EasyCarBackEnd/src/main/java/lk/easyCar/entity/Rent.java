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

//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String rentID;
    private String rentDate;
    private String rentStatus;


    @ManyToOne
    @JoinColumn(name = "cusID",referencedColumnName = "cusNicID")
    private User cusID;

    @OneToMany(mappedBy = "rentID",cascade = CascadeType.ALL)
    private List<RentDetails> rentDetails = new ArrayList<>();

}
