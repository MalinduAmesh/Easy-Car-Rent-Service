package lk.easyCar.service.impl;

import lk.easyCar.dto.UserDTO;
import lk.easyCar.entity.User;
import lk.easyCar.exception.ValidationException;
import lk.easyCar.repo.CustomerRepo;
import lk.easyCar.service.CustomerService;
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
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public boolean addCustomer(UserDTO userDTO) {
        if (customerRepo.existsById(userDTO.getCusNicID())){
            throw new ValidationException("Customer Already Exists");
        }
        User map = modelMapper.map(userDTO, User.class);
        customerRepo.save(map);
        return true;
    }

    @Override
    public boolean deleteCustomer(String id) {
        if (!customerRepo.existsById(id)){
            throw new ValidationException( "No Custtomer for Delete");
        }

        UserDTO userDTO = searchCustomer(id);
        User map = modelMapper.map(userDTO, User.class);

        customerRepo.delete(map);
        return true;
    }

    @Override
    public UserDTO searchCustomer(String id) {
        Optional<User> byId = customerRepo.findById(id);

        if (byId.isPresent()){
            User user = byId.get();
            return modelMapper.map(user,UserDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<UserDTO> getALlCustomers() {
        List<User> all = customerRepo.findAll();

        return modelMapper.map(all,new TypeToken<ArrayList<UserDTO>>(){

        }.getType());
    }

    @Override
    public boolean updateCustomer(UserDTO userDTO) {
        if (customerRepo.existsById(userDTO.getCusNicID())){
            User map = modelMapper.map(userDTO, User.class);
            customerRepo.save(map);
            return true;
        }
        return false;
    }

    @Override
    public String getLastRid() {

            return customerRepo.getLastID();
    }
}
