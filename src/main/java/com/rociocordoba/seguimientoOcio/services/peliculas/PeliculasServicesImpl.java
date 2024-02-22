package com.rociocordoba.seguimientoOcio.services.peliculas;

import com.rociocordoba.seguimientoOcio.persistance.entities.Peliculas;
import com.rociocordoba.seguimientoOcio.persistance.repository.PeliculasRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PeliculasServicesImpl implements PeliculasServices{
    @Autowired
    PeliculasRepository peliculasRepository;


    @Override
    public void guardarPelicula(Peliculas pelicula) {
        peliculasRepository.save(pelicula);
    }

    @Override
    public List<Peliculas> verTodasLasPeliculas() {
        return (List<Peliculas>) peliculasRepository.findAll();
    }

    @Override
    public Optional<Peliculas> findPeliculaById(Long id) {
        return peliculasRepository.findById(id);
    }

    @Override
    public void eliminarPelicula(Peliculas pelicula) {
        peliculasRepository.delete(pelicula);
    }
}
