package com.deccan.address.service;



import com.deccan.address.dto.addressDTO;
import com.deccan.address.model.addressList;

public interface addressService {

    addressList saveAddressList(addressDTO _addressDTO);
    
}
