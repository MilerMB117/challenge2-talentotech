
package com.example.reto2.service;

import org.springframework.stereotype.Service;

@Service
public class TemperatureConversionService {

    public double celsiusToFahrenheit(double celsius) {
        return roundToTwoDecimals(celsius * 9.0 / 5.0 + 32);
    }

    public double celsiusToKelvin(double celsius) {
        return roundToTwoDecimals(celsius + 273.15);
    }

    public double fahrenheitToCelcius(double fahrenheit) {
        return roundToTwoDecimals((fahrenheit - 32) * 5.0 / 9.0);
    }

    public double fahrenheitToKelvin(double fahrenheit) {
        return roundToTwoDecimals((fahrenheit - 32) * 5.0 / 9.0 + 273.15);
    }

    public double kelvinToCelsius(double kelvin) {
        return roundToTwoDecimals(kelvin - 273.15);
    }

    public double kelvinToFahrenheit(double kelvin) {
        return roundToTwoDecimals((kelvin - 273.15) * 9.0 / 5.0 + 32);
    }

    private double roundToTwoDecimals(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
