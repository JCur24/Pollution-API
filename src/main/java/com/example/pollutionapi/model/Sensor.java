package com.example.pollutionapi.model;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigInteger;

@Document("sensor")
@Data
public class Sensor {
    @Id
    private BigInteger id;
    private Integer userId;
    private String serialNumber;
    private String status;
    private Integer latitude;
    private Integer longitude;
}
