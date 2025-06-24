package com.edutech.inscripciones.service;

import java.util.List;

import com.edutech.inscripciones.model.Inscripcion;


public interface InscripcionService {
    List<Inscripcion> listar();
    Inscripcion guardar(Inscripcion inscripcion);
    Inscripcion obtenerPorId(Long id);
    void eliminar(Long id);
}
