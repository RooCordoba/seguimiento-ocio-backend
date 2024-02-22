package com.rociocordoba.seguimientoOcio.persistance.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(schema = "juegos")
public class Juegos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String nombre;
    private int anio;
    private String empresa;
    private String descripcion;
    private String comentarios;
    private int puntuacion;

    private boolean noComenzado;
    private boolean enCurso;
    private boolean terminado;

    public Juegos(@NonNull String nombre,
                  int anio,
                  String empresa,
                  String descripcion,
                  String comentarios,
                  int puntuacion,
                  boolean noComenzado,
                  boolean enCurso,
                  boolean terminado) {
        this.nombre = nombre;
        this.anio = anio;
        this.empresa = empresa;
        this.descripcion = descripcion;
        this.comentarios = comentarios;
        this.puntuacion = puntuacion;
        this.noComenzado = noComenzado;
        this.enCurso = enCurso;
        this.terminado = terminado;
    }

    public Juegos() {

    }
}
