package com.deccan.service;



import com.deccan.dto.addressDTO;
import com.deccan.model.addressList;

public interface addressService {

    addressList saveAddressList(addressDTO _addressDTO);
    
}
