package com.rociocordoba.seguimientoOcio.services.peliculas;

import com.rociocordoba.seguimientoOcio.persistance.entities.Peliculas;
import com.rociocordoba.seguimientoOcio.persistance.repository.PeliculasRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PeliculasServices {

    void guardarPelicula(Peliculas pelicula);

    List<Peliculas> verTodasLasPeliculas();

    Optional<Peliculas> findPeliculaById(Long id);

    void eliminarPelicula(Peliculas pelicula);
}
