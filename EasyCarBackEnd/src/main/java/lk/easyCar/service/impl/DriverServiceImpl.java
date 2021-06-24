package lk.easyCar.service.impl;

import lk.easyCar.dto.DriverDTO;
import lk.easyCar.entity.Driver;
import lk.easyCar.exception.NotFoundException;
import lk.easyCar.exception.ValidationException;
import lk.easyCar.repo.DriverRepo;
import lk.easyCar.service.DriverService;
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
public class DriverServiceImpl implements DriverService {


    @Autowired
    private DriverRepo driverRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public boolean addDriver(DriverDTO dto) {
        if (driverRepo.existsById(dto.getDriver_NIC())){
            throw new ValidationException( "Driver Already Exists");
        }
        Driver map = modelMapper.map(dto, Driver.class);
        driverRepo.save(map);
        return true;
    }

    @Override
    public boolean deleteDriver(String id) {
        if (!driverRepo.existsById(id)){
            throw new ValidationException( "No Driver for Delete");
        }
        DriverDTO dto = searchDriver(id);
        Driver map = modelMapper.map(dto, Driver.class);
        driverRepo.delete(map);
        return true;
    }

//    isPresent ekn blnwa innwd ndda kyla

    @Override
    public DriverDTO searchDriver(String id) {
        Optional<Driver> byId = driverRepo.findById(id);
        System.out.println("DEBUG DRIVER ID 2"+id);

        if (byId.isPresent()) {
            Driver driver = byId.get();

            DriverDTO map = modelMapper.map(driver, DriverDTO.class);
            System.out.println("DEBUG Driver Obj 3"+map);

            return map;

        }

        return null;
    }

    @Override
    public ArrayList<DriverDTO> getAllDrivers() {

        List<Driver> all = driverRepo.findAll();

        return modelMapper.map(all, new TypeToken<ArrayList<DriverDTO>>() {
        }.getType());


    }

    @Override
    public boolean updateDriver(DriverDTO dto) {

        if (driverRepo.existsById(dto.getDriver_NIC())) {

            Driver map = modelMapper.map(dto, Driver.class);

            driverRepo.save(map);
            return true;
        }
        return false;
    }
}
