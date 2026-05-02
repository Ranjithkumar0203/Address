package com.deccan.service.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deccan.dao.addressEntity;
import com.deccan.dto.addressDTO;
import com.deccan.entity.address;
import com.deccan.model.addressList;
import com.deccan.service.addressService;


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