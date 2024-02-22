package com.rociocordoba.seguimientoOcio.services.series;

import com.rociocordoba.seguimientoOcio.persistance.entities.Series;
import com.rociocordoba.seguimientoOcio.persistance.repository.SeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class SeriesServicesImpl implements SeriesServices{
    @Autowired
    SeriesRepository seriesRepository;


    @Override
    public void guardarSerie(Series serie) {
        seriesRepository.save(serie);
    }

    @Override
    public List<Series> verTodasLasSeries() {
        return (List<Series>) seriesRepository.findAll();
    }

    @Override
    public Optional<Series> findSerieById(Long id) {
        return seriesRepository.findById(id);
    }

    @Override
    public void eliminarSerie(Series serie) {
        seriesRepository.delete(serie);
    }
}
