package com.edutech.calificaciones.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutech.calificaciones.model.Calificacion;
import com.edutech.calificaciones.repository.CalificacionRepository;

@Service
public class CalificacionServiceImpl implements CalificacionService {

    @Autowired
    private CalificacionRepository repository;

    @Override
    public List<Calificacion> obtenerTodas() {
        return repository.findAll();
    }

    @Override
    public Calificacion guardar(Calificacion calificacion) {
        return repository.save(calificacion);
    }

    @Override
    public Calificacion obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Calificacion actualizar(Long id, Calificacion nueva) {
        Calificacion actual = repository.findById(id).orElse(null);
        if (actual != null) {
            actual.setIdEstudiante(nueva.getIdEstudiante());
            actual.setIdCurso(nueva.getIdCurso());
            actual.setIdEvaluacion(nueva.getIdEvaluacion());
            actual.setNota(nueva.getNota());
            actual.setFechaCalificacion(nueva.getFechaCalificacion());
            return repository.save(actual);
        }
        return null;
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
