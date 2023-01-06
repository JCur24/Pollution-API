package com.example.pollutionapi.controller;

import com.example.pollutionapi.model.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@CrossOrigin
@RequestMapping("api/user")
public interface IUserController {

  public void registerUser(@RequestBody User user);

  public void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
