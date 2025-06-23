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

    private Long idEstudiante;
    private Long idCurso;
    private Long idEvaluacion;
    private Double nota;
    private LocalDate fechaCalificacion;

    
    public Calificacion() {
    }
    
    public Calificacion(Long id, Long idEstudiante, Long idCurso, Long idEvaluacion, Double nota,
            LocalDate fechaCalificacion) {
        this.id = id;
        this.idEstudiante = idEstudiante;
        this.idCurso = idCurso;
        this.idEvaluacion = idEvaluacion;
        this.nota = nota;
        this.fechaCalificacion = fechaCalificacion;
    }

    public Long getId() {  return id; }
    public void setId(Long id) { this.id = id; }

    public Long getIdEstudiante() { return idEstudiante; }
    public void setIdEstudiante(Long idEstudiante) { this.idEstudiante = idEstudiante; }

    public Long getIdCurso() { return idCurso; }
    public void setIdCurso(Long idCurso) { this.idCurso = idCurso; }

    public Long getIdEvaluacion() { return idEvaluacion; }
    public void setIdEvaluacion(Long idEvaluacion) { this.idEvaluacion = idEvaluacion; }

    public Double getNota() { return nota; }
    public void setNota(Double nota) { this.nota = nota; }

    public LocalDate getFechaCalificacion() { return fechaCalificacion; }
    public void setFechaCalificacion(LocalDate fechaCalificacion) { this.fechaCalificacion = fechaCalificacion; }
}
