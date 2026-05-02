package com.deccan.dto;

import java.util.ArrayList;
import java.util.List;

import com.deccan.entity.address;

public class addressDTO {
    private List<address> addressList = new ArrayList<>();

    public List<address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<address> addressList) {
        this.addressList = addressList;
    }

    public addressDTO(List<address> addressList) {
        this.addressList = addressList;
    }

    public addressDTO() {
    }
}
