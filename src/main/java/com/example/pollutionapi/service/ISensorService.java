package com.example.pollutionapi.service;

import com.example.pollutionapi.model.Sensor;

public interface ISensorService {
    public Sensor getSensor(String sensorSerialNum);

    public Sensor registerSensor(Sensor sensor);
}
