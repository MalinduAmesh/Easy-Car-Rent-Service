package lk.easyCar.service;

import lk.easyCar.dto.UserDTO;

import java.util.ArrayList;

public interface CustomerService  {

    boolean addCustomer(UserDTO userDTO);
    boolean deleteCustomer(String id);
    UserDTO searchCustomer(String id);
    ArrayList<UserDTO> getALlCustomers();
    boolean updateCustomer (UserDTO userDTO);

    String getLastRid();
}
