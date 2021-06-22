package lk.easyCar.repo;

import lk.easyCar.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepo extends JpaRepository<Booking,String> {

}
