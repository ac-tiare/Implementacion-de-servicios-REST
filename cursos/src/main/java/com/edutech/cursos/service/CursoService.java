package com.edutech.cursos.service;

import java.util.List;

import com.edutech.cursos.model.Curso;

public interface CursoService {
    List<Curso> listarCursos();
    Curso guardarCurso(Curso curso);
    Curso obtenerCurso(Long id);
    void eliminarCurso(Long id);
}
