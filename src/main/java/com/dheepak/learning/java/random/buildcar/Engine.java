package com.dheepak.learning.java.random.buildcar;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Engine{
    private String name;
    private String fuelType;
    private Integer capacity;
    private String ignition;
}
