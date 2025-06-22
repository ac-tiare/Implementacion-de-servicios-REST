package com.edutech.evaluaciones.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edutech.evaluaciones.model.Evaluacion;
import com.edutech.evaluaciones.repository.EvaluacionRepository;

@Service
public class EvaluacionService {
    private final EvaluacionRepository repository;

    public EvaluacionService(EvaluacionRepository repository) {
        this.repository = repository;
    }

    public List<Evaluacion> listar() {
        return repository.findAll();
    }

    public Evaluacion guardar(Evaluacion evaluacion) {
        return repository.save(evaluacion);
    }
}

