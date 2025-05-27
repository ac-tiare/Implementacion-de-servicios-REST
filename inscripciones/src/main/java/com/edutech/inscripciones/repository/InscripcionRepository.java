package com.edutech.inscripciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edutech.inscripciones.model.Inscripcion;

public interface InscripcionRepository extends JpaRepository<Inscripcion, Long> {
}
