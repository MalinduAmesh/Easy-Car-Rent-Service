package lk.easyCar.service.impl;

import lk.easyCar.dto.RentDTO;
import lk.easyCar.dto.VehicleDTO;
import lk.easyCar.entity.Rent;
import lk.easyCar.exception.ValidationException;
import lk.easyCar.repo.RentRepo;
import lk.easyCar.service.RentService;
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
public class RentServiceImpl implements RentService {

    @Autowired
    private RentRepo rentRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public boolean addRent(RentDTO rentDTO) {
        if (rentRepo.existsById(rentDTO.getRentID())){
            throw new ValidationException( "Rent Already Exists");

        }

        Rent map = modelMapper.map(rentDTO, Rent.class);
        rentRepo.save(map);

        return true;
    }

    @Override
    public boolean deleteRent(String id) {

        if (!rentRepo.existsById(id)){
            throw new ValidationException( "No Driver for Delete");

        }
        RentDTO rentDTO = searchRent(id);
        Rent map = modelMapper.map(rentDTO, Rent.class);
        rentRepo.delete(map);

        return true;
    }

    @Override
    public ArrayList<RentDTO> getAllRents() {

//        ArrayList<RentDTO> allRentsDet = new ArrayList<>();
//        List<Rent> all = rentRepo.findAll();
//        for (Rent rent:all){
//            allRentsDet.add(new RentDTO(rent.getRentID(),rent.getCusID(),rent.getRentDetails() ));
//        }
//        return allRentsDet;
        List<Rent> all = rentRepo.findAll();

      return   modelMapper.map(all,new TypeToken<ArrayList<RentDTO>>(){

        }.getType());

    }

    @Override
    public boolean updateRent(RentDTO rentDTO) {
        if (rentRepo.existsById(rentDTO.getRentID())){

            Rent map = modelMapper.map(rentDTO, Rent.class);

            rentRepo.save(map);

            return true;

        }
        return false;
    }

    @Override
    public RentDTO searchRent(String id) {
        Optional<Rent> byId = rentRepo.findById(id);
        if (byId.isPresent()){
            Rent rent = byId.get();
            return modelMapper.map(rent,RentDTO.class);
        }
        return null;
    }

    @Override
    public List<Rent> getByRentDetails(String id) {
//        List<Rent>rents = rentRepo.getByRentDetails(id);
        List<Rent>rents = rentRepo.getByRentDetails(id);

        return modelMapper.map(rents,new TypeToken<List<Rent>>(){

        }.getType());
    }

    @Override
    public String getLastRid() {
        return rentRepo.getLastID();
    }

}
