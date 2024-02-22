package com.rociocordoba.seguimientoOcio.controllers;

import com.rociocordoba.seguimientoOcio.services.series.SeriesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/series")
public class SeriesController {
    @Autowired
    SeriesServices seriesServices;
}
