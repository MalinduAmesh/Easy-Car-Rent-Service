package lk.easyCar.service;

import lk.easyCar.dto.RentDTO;
import lk.easyCar.dto.VehicleDTO;

import java.util.ArrayList;

public interface RentService {

    boolean addRent(RentDTO rentDTO);
    boolean deleteRent(String id);

    ArrayList<RentDTO>getAllRents();
    boolean updateRent(RentDTO rentDTO);

    RentDTO searchRent(String id);
}
