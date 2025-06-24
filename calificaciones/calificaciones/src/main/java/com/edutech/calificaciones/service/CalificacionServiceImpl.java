package com.edutech.calificaciones.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.edutech.calificaciones.dto.EvaluacionDTO;
import com.edutech.calificaciones.dto.UsuarioDTO;
import com.edutech.calificaciones.model.Calificacion;
import com.edutech.calificaciones.repository.CalificacionRepository;
@Service
public class CalificacionServiceImpl implements CalificacionService {

@Autowired
    private CalificacionRepository calificacionRepository;

    @Autowired
    private RestTemplate restTemplate;

    private final String URL_EVALUACIONES = "http://localhost:8084/evaluaciones/";
    private final String URL_USUARIOS = "http://localhost:8081/usuarios/";


    @Override
    public List<Calificacion> obtenerTodas() {
        return calificacionRepository.findAll();
    }

    @Override
    public Calificacion guardar(Calificacion calificacion) {
        EvaluacionDTO evaluacion = restTemplate.getForObject(URL_EVALUACIONES + calificacion.getEvaluacionId(), EvaluacionDTO.class);
        if (evaluacion == null) {
            throw new RuntimeException("Evaluación no encontrada con ID: " + calificacion.getEvaluacionId());
        }
        UsuarioDTO usuario = restTemplate.getForObject(URL_USUARIOS + calificacion.getUsuarioId(), UsuarioDTO.class);
        if (usuario == null) {
            throw new RuntimeException("Usuario no encontrado con ID: " + calificacion.getUsuarioId());
    }

        return calificacionRepository.save(calificacion);
    }

    @Override
    public Calificacion obtenerPorId(Long id) {
        return calificacionRepository.findById(id).orElse(null);
    }

    @Override
    public Calificacion actualizar(Long id, Calificacion nuevaCalificacion) {
        Optional<Calificacion> existente = calificacionRepository.findById(id);
        if (existente.isPresent()) {
            Calificacion c = existente.get();
            c.setNota(nuevaCalificacion.getNota());
            c.setEvaluacionId(nuevaCalificacion.getEvaluacionId());
            c.setUsuarioId(nuevaCalificacion.getUsuarioId());
            return calificacionRepository.save(c);
        }
        return null;
    }

    @Override
    public void eliminar(Long id) {
        calificacionRepository.deleteById(id);
    }
}