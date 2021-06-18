package lk.easyCar.repo;

import lk.easyCar.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<User,String> {

}
