package lk.easyCar.repo;

import lk.easyCar.entity.Rent;
import lk.easyCar.entity.RentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface RentRepo extends JpaRepository<Rent,String> {

    List<Rent> getByRentDetails(String id);

    @Query(value = "SELECT rentID FROM Rent ORDER BY rentID DESC LIMIT 1", nativeQuery = true)
    String getLastID();
}
