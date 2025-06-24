package com.edutech.inscripciones.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.edutech.inscripciones.dto.UsuarioDTO;
import com.edutech.inscripciones.model.Inscripcion;
import com.edutech.inscripciones.repository.InscripcionRepository;

@Service
public class InscripcionServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public UsuarioDTO obtenerUsuarioPorId(Long usuarioId) {
        String url = "http://localhost:8081/usuarios/" + usuarioId;
        UsuarioDTO usuario = restTemplate.getForObject(url, UsuarioDTO.class);
        return usuario;
    }
    private final InscripcionRepository inscripcionRepository;

    public InscripcionServiceImpl(InscripcionRepository inscripcionRepository) {
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
