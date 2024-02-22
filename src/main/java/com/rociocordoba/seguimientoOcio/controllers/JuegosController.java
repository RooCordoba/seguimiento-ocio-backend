package com.rociocordoba.seguimientoOcio.controllers;

import com.rociocordoba.seguimientoOcio.persistance.entities.Juegos;
import com.rociocordoba.seguimientoOcio.services.juegos.JuegosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/juegos")
public class JuegosController {
    @Autowired
    JuegosServices juegosServices;

    @PostMapping("/guardar")
    public ResponseEntity<Map<String, String>> guardarJuego (Juegos juego){
        Map<String, String> response = new HashMap<>();
        try {
            juegosServices.guardarJuego(juego);
            response.put("message", "Juego Guardado Con Exito");
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (DataAccessException e){
            e.printStackTrace();
            response.put("message", "Error en la base de datos");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
