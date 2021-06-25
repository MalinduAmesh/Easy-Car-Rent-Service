package lk.easyCar.repo;

import lk.easyCar.entity.RentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RentDetailsRepo extends JpaRepository<RentDetails,String> {

    @Query(value = "SELECT rentDetailID FROM RentDetails ORDER BY rentDetailID DESC LIMIT 1", nativeQuery = true)
    String getLastID();
}
