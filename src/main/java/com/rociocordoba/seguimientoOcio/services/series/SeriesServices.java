package com.rociocordoba.seguimientoOcio.services.series;

import com.rociocordoba.seguimientoOcio.persistance.entities.Series;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SeriesServices {
    void guardarSerie(Series serie);

    List<Series> verTodasLasSeries();

    Optional<Series> findSerieById(Long id);

    void eliminarSerie(Series serie);
}
