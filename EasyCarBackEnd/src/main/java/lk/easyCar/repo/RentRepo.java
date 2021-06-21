package lk.easyCar.repo;

import lk.easyCar.entity.Rent;
import lk.easyCar.entity.RentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RentRepo extends JpaRepository<Rent,String> {

    List<Rent> getByRentDetails(String id);


}
