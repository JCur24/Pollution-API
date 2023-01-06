package com.example.pollutionapi.service;

import com.example.pollutionapi.model.SensorReading;

public interface ISensorReadingService {
    public void uploadSensorReading(SensorReading sensorReading);

    public SensorReading getSensorReading(String sensorReadingId);
}
