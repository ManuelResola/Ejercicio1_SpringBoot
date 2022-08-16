package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controlador1 {

    @PostMapping
    public Persona personaPost(@RequestBody Persona persona)
    {
        persona.setEdad (persona.getEdad() + 1);
        return persona;

    }

}
