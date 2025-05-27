package com.edutech.cursos.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.edutech.cursos.model.Curso;
import com.edutech.cursos.service.CursoService;

@Controller
public class CursoViewController {

    private final CursoService cursoService;

    public CursoViewController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping("/")
    public String mostrarCursos(Model model) {
        List<Curso> cursos = cursoService.listarCursos();
        model.addAttribute("cursos", cursos);
        return "cursos";
    }
}
