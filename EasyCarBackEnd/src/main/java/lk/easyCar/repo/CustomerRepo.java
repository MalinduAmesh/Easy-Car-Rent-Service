package lk.easyCar.repo;

import lk.easyCar.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepo extends JpaRepository<User,String> {

    @Query(value = "SELECT cusNicID FROM User ORDER BY cusNicID DESC LIMIT 1", nativeQuery = true)
    String getLastID();
}
