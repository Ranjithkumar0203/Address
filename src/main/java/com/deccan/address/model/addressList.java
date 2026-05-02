package com.deccan.address.model;

import java.util.ArrayList;
import java.util.List;

public class addressList {
    private List<Address> addressList = new ArrayList<>();

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public addressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public addressList() {
    }

}

class Address {
    private String city;
    private String pincode;
    private String address;
    private String phoneNumber;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address(String city, String pincode, String address, String phoneNumber) {
        this.city = city;
        this.pincode = pincode;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Address() {
    }

}