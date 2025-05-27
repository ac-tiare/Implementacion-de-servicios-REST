package com.edutech.inscripciones.dto;

public class CursoDTO {
    private Long id;
    private String titulo;
    private String descripcion;

    public CursoDTO() {
    }

    public CursoDTO(String descripcion, Long id, String titulo) {
        this.descripcion = descripcion;
        this.id = id;
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
