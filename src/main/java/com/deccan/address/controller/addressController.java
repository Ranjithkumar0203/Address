package com.deccan.address.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deccan.address.dto.addressDTO;
import com.deccan.address.entity.address;
import com.deccan.address.service.serviceImpl.addressServiceiMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/address")
public class addressController {

    @Autowired
    public addressServiceiMPL _addressServiceiMPL;

    @GetMapping()
    public String Hello() {
        return "Hi Hello";
    }

    @PostMapping("/save")
    public addressDTO saveAddress(@RequestBody addressDTO _addressDto) {
        addressDTO address = _addressServiceiMPL.saveAddressList(_addressDto);
        return address;
    }

}
