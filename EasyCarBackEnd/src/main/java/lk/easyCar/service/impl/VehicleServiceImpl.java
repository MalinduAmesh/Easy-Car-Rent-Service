package lk.easyCar.service.impl;

import lk.easyCar.dto.DriverDTO;
import lk.easyCar.dto.VehicleDTO;
import lk.easyCar.entity.Driver;
import lk.easyCar.entity.Vehicle;
import lk.easyCar.exception.ValidationException;
import lk.easyCar.repo.VehicleRepo;
import lk.easyCar.service.VehicleService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepo vehicleRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public boolean addVehicle(VehicleDTO vehicleDTO) {
        if (vehicleRepo.existsById(vehicleDTO.getCarID())){
            throw new ValidationException( "Vehicle Already Exists");

        }
        Vehicle map = modelMapper.map(vehicleDTO, Vehicle.class);
        vehicleRepo.save(map);
        return true;
    }

    @Override
    public VehicleDTO searchVehicle(String id) {
        Optional<Vehicle> byId = vehicleRepo.findById(id);

        if (byId.isPresent()){
            Vehicle vehicle = byId.get();
            return modelMapper.map(vehicle,VehicleDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<VehicleDTO> getAllVehicles() {

        List<Vehicle> all = vehicleRepo.findAll();

        return modelMapper.map(all,new TypeToken<ArrayList<VehicleDTO>>(){

        }.getType());

    }

    @Override
    public boolean updateVehicle(VehicleDTO vehicleDTO) {
        if (vehicleRepo.existsById(vehicleDTO.getCarID())){

            Vehicle map = modelMapper.map(vehicleDTO, Vehicle.class);

            vehicleRepo.save(map);

            return true;
        }
        return false;
    }

    @Override
    public boolean deleteVehicle(String id) {
        if (!vehicleRepo.existsById(id)){
            throw new ValidationException("No Driver for Delete");

        }
        VehicleDTO vehicleDTO = searchVehicle(id);
        Vehicle map = modelMapper.map(vehicleDTO, Vehicle.class);
        vehicleRepo.delete(map);
        return true;

    }
}
