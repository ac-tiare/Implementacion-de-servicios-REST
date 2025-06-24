package com.edutech.calificaciones.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Calificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long usuarioId;
    private Long idCurso;
    private Long evaluacionId;
    private Double nota;
    private LocalDate fechaCalificacion;

    
    public Calificacion() {
    }
    
    public Calificacion(Long id, Long usuarioId, Long idCurso, Long evaluacionId, Double nota,
            LocalDate fechaCalificacion) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.idCurso = idCurso;
        this.evaluacionId = evaluacionId;
        this.nota = nota;
        this.fechaCalificacion = fechaCalificacion;
    }

    public Long getId() {  return id; }
    public void setId(Long id) { this.id = id; }

    public Long getUsuarioId() { return usuarioId; }
    public void setUsuarioId(Long usuarioId) { this.usuarioId = usuarioId; }

    public Long getIdCurso() { return idCurso; }
    public void setIdCurso(Long idCurso) { this.idCurso = idCurso; }

    public Long getEvaluacionId() { return evaluacionId; }
    public void setEvaluacionId(Long evaluacionId) { this.evaluacionId = evaluacionId; }

    public Double getNota() { return nota; }
    public void setNota(Double nota) { this.nota = nota; }

    public LocalDate getFechaCalificacion() { return fechaCalificacion; }
    public void setFechaCalificacion(LocalDate fechaCalificacion) { this.fechaCalificacion = fechaCalificacion; }
}
