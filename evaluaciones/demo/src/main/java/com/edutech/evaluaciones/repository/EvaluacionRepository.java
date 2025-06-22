package com.edutech.evaluaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edutech.evaluaciones.model.Evaluacion;

public interface EvaluacionRepository extends JpaRepository<Evaluacion, Long> {
}
