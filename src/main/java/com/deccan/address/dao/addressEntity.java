package com.deccan.address.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface addressEntity  extends MongoRepository<addressEntity, Long> {
    
}
