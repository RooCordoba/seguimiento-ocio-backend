package com.rociocordoba.seguimientoOcio.persistance.repository;

import com.rociocordoba.seguimientoOcio.persistance.entities.Peliculas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculasRepository extends CrudRepository<Peliculas, Long> {
}
