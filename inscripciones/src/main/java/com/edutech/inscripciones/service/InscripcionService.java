package com.edutech.inscripciones.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edutech.inscripciones.model.Inscripcion;
import com.edutech.inscripciones.repository.InscripcionRepository;

@Service
public class InscripcionService {

    private final InscripcionRepository inscripcionRepository;

    public InscripcionService(InscripcionRepository inscripcionRepository) {
        this.inscripcionRepository = inscripcionRepository;
    }

    public List<Inscripcion> listar() {
        return inscripcionRepository.findAll();
    }

    public Inscripcion guardar(Inscripcion i) {
        return inscripcionRepository.save(i);
    }

    public void eliminar(Long id) {
        inscripcionRepository.deleteById(id);
    }
}
