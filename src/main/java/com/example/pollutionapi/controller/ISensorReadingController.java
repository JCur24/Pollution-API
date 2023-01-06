package com.example.pollutionapi.controller;

import com.example.pollutionapi.model.SensorReading;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/sensorreading")
public interface ISensorReadingController {

    public void getSensorReading();

    public void uploadSensorReading(@RequestBody SensorReading sensorReading);

}
