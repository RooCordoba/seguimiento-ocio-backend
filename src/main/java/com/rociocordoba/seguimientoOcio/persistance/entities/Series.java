package com.rociocordoba.seguimientoOcio.persistance.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(schema = "series")
public class Series {
    @Id
    private Long id;
    @NonNull
    private String nombre;
    private int anio;
    private String director;
    private String descripcion;
    private String comentarios;
    private int puntuacion;

    private boolean noComenzado;
    private boolean enCurso;
    private boolean terminado;

    public Series(@NonNull String nombre,
                  int anio,
                  String director,
                  String descripcion,
                  String comentarios,
                  int puntuacion,
                  boolean noComenzado,
                  boolean enCurso,
                  boolean terminado) {
        this.nombre = nombre;
        this.anio = anio;
        this.director = director;
        this.descripcion = descripcion;
        this.comentarios = comentarios;
        this.puntuacion = puntuacion;
        this.noComenzado = noComenzado;
        this.enCurso = enCurso;
        this.terminado = terminado;
    }

    public Series() {

    }
}
