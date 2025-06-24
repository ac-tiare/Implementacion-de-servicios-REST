package com.edutech.calificaciones.dto;

public class EvaluacionDTO {
    private Long id;
    private String nombre;
    private String tipo;
    private Long cursoId;

    public EvaluacionDTO() {
    }
    
    public EvaluacionDTO(Long id, String nombre, String tipo, Long cursoId) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.cursoId = cursoId;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Long getCursoId() {
        return cursoId;
    }
    public void setCursoId(Long cursoId) {
        this.cursoId = cursoId;
    }
}
