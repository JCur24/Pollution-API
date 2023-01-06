package com.example.pollutionapi.controller;

import com.example.pollutionapi.model.Sensor;
import com.example.pollutionapi.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/sensor")
public interface ISensorController {

    public void getSensor(@PathVariable String sensorId);

    public void registerSensor(@RequestBody Sensor sensor);

}
