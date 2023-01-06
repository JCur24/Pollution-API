package com.example.pollutionapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


import javax.persistence.Id;
import java.math.BigInteger;


@Document("sensor reading")
@Data
@AllArgsConstructor
public class SensorReading {

    @Id
    private BigInteger id;
    private Long serialNumber;
    private String timeStamp;
    private Integer voc;
    private Integer co2;
    private Integer spm1_0;
    private Integer spm2_5;
    private Integer spm10;
    private Integer aec1_0;
    private Integer aec2_5;
    private Integer aec10;

}
