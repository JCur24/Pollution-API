package com.example.pollutionapi.service;


import com.example.pollutionapi.dao.SensorReadingRepository;
import com.example.pollutionapi.model.SensorReading;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SensorReadingService implements ISensorReadingService {

    private final SensorReadingRepository sensorReadingRepository;

    @Override
    public void uploadSensorReading(SensorReading sensorReading) {
        sensorReadingRepository.save(sensorReading);
    }

    @Override
    public SensorReading getSensorReading(String sensorReadingId) {
        return null;
    }

}
