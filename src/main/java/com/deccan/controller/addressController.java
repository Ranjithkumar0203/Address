package com.deccan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deccan.dao.addressEntity;
import com.deccan.dto.addressDTO;
import com.deccan.model.addressList;
import com.deccan.service.serviceImpl.addressServiceiMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/address")
public class addressController {

    @Autowired
    public addressServiceiMPL _addressServiceiMPL;

    @GetMapping("/")
    public String Hello() {
        return "Hi Hello";
    }

    @PostMapping("/save")
    public addressList saveAddress(@RequestBody addressDTO _addressDTO) {
        addressList addresslist = _addressServiceiMPL.saveAddressList(_addressDTO);
        return addresslist;
    }

}
