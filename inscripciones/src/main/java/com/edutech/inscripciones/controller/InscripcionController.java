package com.edutech.inscripciones.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edutech.inscripciones.dto.UsuarioDTO;
import com.edutech.inscripciones.model.Inscripcion;
import com.edutech.inscripciones.service.InscripcionServiceImpl;

@RestController
@RequestMapping("/inscripciones")
public class InscripcionController {

    private final InscripcionServiceImpl inscripcionService;

    public InscripcionController(InscripcionServiceImpl inscripcionService) {
        this.inscripcionService = inscripcionService;
    }

    @GetMapping("/usuarios-info/{id}")
    public UsuarioDTO obtenerUsuario(@PathVariable Long id) {
    return inscripcionService.obtenerUsuarioPorId(id);
    }

    @GetMapping
    public List<Inscripcion> listar() {
        return inscripcionService.listar();
    }

    @PostMapping
    public Inscripcion guardar(@RequestBody Inscripcion i) {
        return inscripcionService.guardar(i);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        inscripcionService.eliminar(id);
    }
}
