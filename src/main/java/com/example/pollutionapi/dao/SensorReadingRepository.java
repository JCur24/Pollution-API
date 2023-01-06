package com.example.pollutionapi.dao;

import com.example.pollutionapi.model.SensorReading;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface SensorReadingRepository extends MongoRepository<SensorReading, BigInteger> {
}
