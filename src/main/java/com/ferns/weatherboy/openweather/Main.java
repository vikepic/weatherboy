package com.ferns.weatherboy.openweather;

import lombok.Data;

@Data
public class Main {
    private float temp;
    private float pressure;
    private float humidity;
    private float temp_min;
    private float temp_max;
}
