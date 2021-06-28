package com.example.put.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
public class CarDto {
    @JsonProperty("car_name")
    private String carName;
    @JsonProperty("car_number")
    private String carNumber;


    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "carName='" + carName + '\'' +
                ", carNumber='" + carNumber + '\'' +
                '}';
    }
}
