package com.example.pollutionapi.service;

import com.example.pollutionapi.model.User;

public interface IUserService {
    public void registerUser(User user);

    public User getUserByEmail(String email);

}
