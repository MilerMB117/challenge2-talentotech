package com.example.reto2.controller;

import com.example.reto2.service.TemperatureConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grade")
public class TemperatureController {

    @Autowired
    private TemperatureConversionService temperatureConversionService;

    @GetMapping("/celsiusToFahrenheit/{celsius}")
    public double celsiusToFahrenheit(@PathVariable double celsius) {
        return temperatureConversionService.celsiusToFahrenheit(celsius);
    }

    @GetMapping("/celsiusToKelvin/{celsius}")
    public double celsiusToKelvin(@PathVariable double celsius) {
        return temperatureConversionService.celsiusToKelvin(celsius);
    }

    @GetMapping("/fahrenheitToCelcius/{fahrenheit}")
    public double fahrenheitToCelcius(@PathVariable double fahrenheit) {
        return temperatureConversionService.fahrenheitToCelcius(fahrenheit);
    }

    @GetMapping("/farenheitToKelvin/{fahrenheit}")
    public double fahrenheitToKelvin(@PathVariable double fahrenheit) {
        return temperatureConversionService.fahrenheitToKelvin(fahrenheit);
    }

    @GetMapping("/kelvinToCelsius/{kelvin}")
    public double kelvinToCelsius(@PathVariable double kelvin) {
        return temperatureConversionService.kelvinToCelsius(kelvin);
    }

    @GetMapping("/kelvinToFarenheit/{kelvin}")
    public double kelvinToFahrenheit(@PathVariable double kelvin) {
        return temperatureConversionService.kelvinToFahrenheit(kelvin);
    }
}
