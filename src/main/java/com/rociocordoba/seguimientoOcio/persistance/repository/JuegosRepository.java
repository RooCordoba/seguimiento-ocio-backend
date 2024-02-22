package com.rociocordoba.seguimientoOcio.persistance.repository;

import com.rociocordoba.seguimientoOcio.persistance.entities.Juegos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JuegosRepository extends CrudRepository<Juegos, Long> {
}
