package com.dheepak.learning.java.random.buildcar;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Body {
    private String color;
    private Integer numberOfDoors;
    private String doorStatus;
    private String bootStatus;

}
