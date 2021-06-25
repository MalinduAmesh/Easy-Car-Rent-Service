package lk.easyCar.service;

import lk.easyCar.dto.RentDetailsDTO;

public interface RentDetailsService {

    RentDetailsDTO searchRentDet(String id);


    String getLastRid();
}
