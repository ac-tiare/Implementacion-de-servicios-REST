package com.edutech.cursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edutech.cursos.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
