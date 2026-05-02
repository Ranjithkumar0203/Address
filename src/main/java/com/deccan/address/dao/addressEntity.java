package com.deccan.address.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.deccan.address.entity.address;


@Repository
public interface addressEntity  extends MongoRepository<address, Long> {
    
}
