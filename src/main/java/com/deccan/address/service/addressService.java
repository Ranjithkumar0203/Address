package com.deccan.address.service;


import java.util.List;

import com.deccan.address.dto.EmployeeDTO;
import com.deccan.address.dto.addressDTO;


public interface addressService {

    addressDTO saveAddressList(addressDTO _addressDTO);

    List<addressDTO> getAddressesByEmployeeID(String employeeID);

    EmployeeDTO getEmployeeByMoreThanOneAddress(Long count);
    
}
