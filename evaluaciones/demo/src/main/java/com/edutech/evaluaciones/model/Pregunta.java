package com.edutech.evaluaciones.model;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pregunta;

    @ElementCollection
    private List<String> opciones;

    private String respuestaCorrecta;

    @ManyToOne
    @JoinColumn(name = "evaluacion_id")
    private Evaluacion evaluacion;

    public Pregunta() {
    }

    public Pregunta(Evaluacion evaluacion, Long id, List<String> opciones, String pregunta, String respuestaCorrecta) {
        this.evaluacion = evaluacion;
        this.id = id;
        this.opciones = opciones;
        this.pregunta = pregunta;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }
    public List<String> getOpciones() {
    return opciones;
    }

    public void setOpciones(List<String> opciones) {
    this.opciones = opciones;
    }

}



