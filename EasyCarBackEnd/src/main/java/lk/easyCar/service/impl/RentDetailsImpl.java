package lk.easyCar.service.impl;

import lk.easyCar.dto.RentDetailsDTO;
import lk.easyCar.entity.RentDetails;
import lk.easyCar.repo.RentDetailsRepo;
import lk.easyCar.service.RentDetailsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class RentDetailsImpl implements RentDetailsService {

    @Autowired
    private RentDetailsRepo rentDetailsRepo;

    @Autowired
   private ModelMapper modelMapper;

    @Override
    public RentDetailsDTO searchRentDet(String id) {
        Optional<RentDetails> byId = rentDetailsRepo.findById(id);

        if (byId.isPresent()){
            RentDetails rentDetails = byId.get();
            return modelMapper.map(rentDetails,RentDetailsDTO.class);
        }
        return  null;
    }

    @Override
    public String getLastRid() {
        return rentDetailsRepo.getLastID();
    }
}
