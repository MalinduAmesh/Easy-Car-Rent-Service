package lk.easyCar.service;

import lk.easyCar.dto.RentDTO;
import lk.easyCar.dto.VehicleDTO;
import lk.easyCar.entity.Rent;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface RentService {

    boolean addRent(RentDTO rentDTO);
    boolean deleteRent(String id);

    ArrayList<RentDTO>getAllRents();
    boolean updateRent(RentDTO rentDTO);

    RentDTO searchRent(String id);

    List<Rent> getByRentDetails(String id);

    String getLastRid();
}
