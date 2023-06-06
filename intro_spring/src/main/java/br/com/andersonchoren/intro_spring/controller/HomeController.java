package br.com.andersonchoren.intro_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {
    @GetMapping
    public Resource home() {
        return new Resource("Celsius para Kelvin", "http://localhost:8080/api/celsius/kelvin");
    }
}

class Resource {
    public String description;
    public String route;

    public Resource(String description, String route) {
        this.description = description;
        this.route = route;
    }
}
