package com.deccan.address.service.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deccan.address.dao.addressEntity;
import com.deccan.address.dto.addressDTO;
import com.deccan.address.entity.address;
import com.deccan.address.model.addressList;
import com.deccan.address.service.addressService;


@Service
public class addressServiceiMPL implements addressService{
   
@Autowired
private addressEntity _addressEntity;

@Autowired
private ModelMapper modelMapper;


    @Override
    public addressList saveAddressList(addressDTO _addressDTO) {
        addressList addressLIST =
                modelMapper.map(_addressDTO, addressList.class);
        return addressLIST;
    }

}