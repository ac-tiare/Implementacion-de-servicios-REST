package com.edutech.calificaciones.service;

import java.util.List;

import com.edutech.calificaciones.model.Calificacion;

public interface CalificacionService {
    List<Calificacion> obtenerTodas();
    Calificacion guardar(Calificacion calificacion);
    Calificacion obtenerPorId(Long id);
    Calificacion actualizar(Long id, Calificacion calificacion);
    void eliminar(Long id);
}
