package lk.easyCar.service;

import lk.easyCar.dto.DriverDTO;
import lk.easyCar.dto.VehicleDTO;

import java.util.ArrayList;

public interface VehicleService {

    boolean addVehicle(VehicleDTO vehicleDTO);
    VehicleDTO searchVehicle(String id);
    ArrayList<VehicleDTO> getAllVehicles();
    boolean updateVehicle(VehicleDTO vehicleDTO);
    boolean deleteVehicle(String id);
}
