package com.deccan.address.service.serviceImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deccan.address.dao.addressEntity;
import com.deccan.address.dto.addressDTO;
import com.deccan.address.entity.address;

import com.deccan.address.service.addressService;


@Service
public class addressServiceiMPL implements addressService{
   
@Autowired
private addressEntity _addressEntity;

@Autowired
private ModelMapper modelMapper;


    @Override
    public addressDTO saveAddressList(addressDTO _addressDTO) {
        address _address =
                modelMapper.map(_addressDTO, address.class);
                _addressEntity.save(_address);
        addressDTO _addressdto =
                modelMapper.map(_address, addressDTO.class);
        return  _addressdto;
    }

    @Override
    public List<addressDTO> getAddressesByEmployeeID(String employeeID) {
        return _addressEntity.findByEmployeeID(employeeID)
                .stream()
                .map(_address -> modelMapper.map(_address, addressDTO.class))
                .toList();
    }

}
