package com.rociocordoba.seguimientoOcio.services.juegos;

import com.rociocordoba.seguimientoOcio.persistance.entities.Juegos;
import com.rociocordoba.seguimientoOcio.persistance.repository.JuegosRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class JuegosServicesImpl implements JuegosServices{
    @Autowired
    JuegosRepository juegosRepository;

    @Override
    public void guardarJuego(Juegos juego) {
        juegosRepository.save(juego);
    }

    @Override
    public List<Juegos> verTodosLosJuegos() {
        return (List<Juegos>) juegosRepository.findAll();
    }

    @Override
    public Optional<Juegos> findJuegoById(Long id) {
        return juegosRepository.findById(id);
    }

    @Override
    public void eliminarJuego(Juegos juego) {
        juegosRepository.delete(juego);
    }
}
