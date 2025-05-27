package com.edutech.cursos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edutech.cursos.model.Curso;
import com.edutech.cursos.service.CursoService;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping
    public List<Curso> listar() {
        return cursoService.listarCursos();
    }

    @PostMapping
    public Curso guardar(@RequestBody Curso curso) {
        return cursoService.guardarCurso(curso);
    }

    @GetMapping("/{id}")
    public Curso obtener(@PathVariable Long id) {
        return cursoService.obtenerCurso(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        cursoService.eliminarCurso(id);
    }
}
