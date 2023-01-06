package com.example.pollutionapi.controller;

import com.example.pollutionapi.model.SensorReading;
import com.example.pollutionapi.service.ISensorReadingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/sensorreading")
@CrossOrigin
@RequiredArgsConstructor
public class SensorReadingController implements ISensorReadingController {

    private final ISensorReadingService sensorReadingService;

    @Override
    @GetMapping("/{sensorId}")
    public void getSensorReading() {
    }

    @Override
    @PostMapping("/upload")
    @ResponseStatus(HttpStatus.CREATED)
    public void uploadSensorReading(@RequestBody SensorReading sensorReading) {
        sensorReadingService.uploadSensorReading(sensorReading);
    }

}
