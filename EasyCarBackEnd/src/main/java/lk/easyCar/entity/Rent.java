package lk.easyCar.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;



@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Rent {

//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String rentID;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "cusID",referencedColumnName = "cusNicID")
    private User cusID;

    @OneToMany(mappedBy = "rID",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<RentDetails> rentDetails = new ArrayList<>();

    public Rent() {
    }

    public Rent(String rentID, User cusID, List<RentDetails> rentDetails) {
        this.rentID = rentID;
        this.cusID = cusID;
        this.rentDetails = rentDetails;
    }

    public String getRentID() {
        return rentID;
    }

    public void setRentID(String rentID) {
        this.rentID = rentID;
    }

    public User getCusID() {
        return cusID;
    }

    public void setCusID(User cusID) {
        this.cusID = cusID;
    }

    public List<RentDetails> getRentDetails() {
        return rentDetails;
    }

    public void setRentDetails(List<RentDetails> rentDetails) {
        this.rentDetails = rentDetails;
    }

//    @Override
//    public String toString() {
//        return "Rent{" +
//                "rentID='" + rentID + '\'' +
//                ", cusID=" + cusID +
//                ", rentDetails=" + rentDetails +
//                '}';
//    }
}
