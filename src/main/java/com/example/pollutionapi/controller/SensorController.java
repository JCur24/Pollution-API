package com.example.pollutionapi.controller;

import com.example.pollutionapi.model.Sensor;
import com.example.pollutionapi.service.SensorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/sensor")
@CrossOrigin
@RequiredArgsConstructor
public class SensorController implements ISensorController {

    private final SensorService sensorService;

    @Override
    @GetMapping("/{sensorId}")
    public void getSensor(@PathVariable(value = "sensorId") String sensorId) {

    }

    @Override
    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public void registerSensor(@RequestBody Sensor sensor) {

    };
}
