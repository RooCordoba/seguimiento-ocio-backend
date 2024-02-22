package com.rociocordoba.seguimientoOcio.services.juegos;

import com.rociocordoba.seguimientoOcio.persistance.entities.Juegos;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface JuegosServices {
    void guardarJuego(Juegos juego);

    List<Juegos> verTodosLosJuegos();

    Optional<Juegos> findJuegoById(Long id);
    void eliminarJuego(Juegos juego);
}
