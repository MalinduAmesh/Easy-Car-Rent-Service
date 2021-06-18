package lk.easyCar.service;

import lk.easyCar.dto.DriverDTO;

import java.util.ArrayList;

public interface DriverService {

    boolean addDriver(DriverDTO dto);
    boolean deleteDriver(String id);
    DriverDTO searchDriver(String id);
    ArrayList<DriverDTO> getAllDrivers();
    boolean updateDriver(DriverDTO dto);
}
