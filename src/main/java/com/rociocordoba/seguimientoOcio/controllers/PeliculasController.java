package com.rociocordoba.seguimientoOcio.controllers;

import com.rociocordoba.seguimientoOcio.services.peliculas.PeliculasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/peliculas")
public class PeliculasController {
    @Autowired
    PeliculasServices peliculasServices;
}
