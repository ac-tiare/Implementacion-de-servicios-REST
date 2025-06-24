package com.edutech.cursos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edutech.cursos.model.Curso;
import com.edutech.cursos.repository.CursoRepository;

@Service
public class CursoServiceImpl {

    private final CursoRepository cursoRepository;

    public CursoServiceImpl(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }

    public Curso guardarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public Curso obtenerCurso(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    public void eliminarCurso(Long id) {
        cursoRepository.deleteById(id);
    }
}
