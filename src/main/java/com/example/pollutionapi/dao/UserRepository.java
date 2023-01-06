package com.example.pollutionapi.dao;

import com.example.pollutionapi.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface UserRepository extends MongoRepository<User, BigInteger> {
    User findUserByEmail(String email);
}
