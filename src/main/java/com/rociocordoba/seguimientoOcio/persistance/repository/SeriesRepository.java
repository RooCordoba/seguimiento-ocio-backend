package com.rociocordoba.seguimientoOcio.persistance.repository;

import com.rociocordoba.seguimientoOcio.persistance.entities.Series;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesRepository extends CrudRepository<Series, Long> {
}
