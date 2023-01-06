package com.example.pollutionapi.service;


import com.example.pollutionapi.model.Sensor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SensorService implements ISensorService {

    @Override
    public Sensor getSensor(String sensorSerialNum) {
        return null;
    }

    @Override
    public Sensor registerSensor(Sensor sensor) {
        return null;
    }
}