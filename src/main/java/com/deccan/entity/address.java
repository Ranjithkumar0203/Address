package com.deccan.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "address")
public class address {
    @Id
    private Long id;
    private List<address> addressList = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<address> addressList) {
        this.addressList = addressList;
    }

    public address(Long id, List<address> addressList) {
        this.id = id;
        this.addressList = addressList;
    }

    public address() {
    }
}
