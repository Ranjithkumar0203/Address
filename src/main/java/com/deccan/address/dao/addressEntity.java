package com.deccan.address.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.deccan.address.entity.address;


@Repository
public interface addressEntity  extends MongoRepository<address, String> {

    List<address> findByEmployeeID(String employeeID);
    
}
