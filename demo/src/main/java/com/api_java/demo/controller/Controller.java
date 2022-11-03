package com.api_java.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @GetMapping("/hello")
    public String hola() {

        return "Hola mi nombre es Luis Varas y esta es mi primera API";

    }
    @PostMapping("/goodbye")
    public String chau() {

        return "Hasta luego";

    }
}
