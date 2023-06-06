package br.com.andersonchoren.intro_spring.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/celsius/kelvin")
public class Convert {
    @PostMapping
    public String convert(@RequestBody String celsius) {
        float gCelsius = Float.parseFloat(celsius);
        float kelvin = gCelsius + 273.15f;
        return kelvin + "k";
    }
}
