package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/saludo")
    public String enviarSaludo() {
        // Sustituye con tus datos reales
        String nombre = "Rene Emiliano Sánchez Saucedo";
        String calificacionEsperada = "10, por favor ;-;"; 
        
        return "Hola, mi nombre es " + nombre + 
               " y en esta práctica espero sacar un: " + calificacionEsperada;
    }
}