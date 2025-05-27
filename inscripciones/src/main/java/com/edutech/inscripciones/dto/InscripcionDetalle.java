package com.edutech.inscripciones.dto;

import java.time.LocalDate;

public class InscripcionDetalle {
    private Long id;
    private String nombreUsuario;
    private String tituloCurso;
    private LocalDate fecha;

    public InscripcionDetalle() {
    }

    public InscripcionDetalle(LocalDate fecha, Long id, String nombreUsuario, String tituloCurso) {
        this.fecha = fecha;
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.tituloCurso = tituloCurso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getTituloCurso() {
        return tituloCurso;
    }

    public void setTituloCurso(String tituloCurso) {
        this.tituloCurso = tituloCurso;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }


}
