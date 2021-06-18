package lk.easyCar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Admin {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String adminID;
    private String adminName;
    private String adminPassword;
}
