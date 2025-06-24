package com.edutech.cursos.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.edutech.cursos.model.Curso;
import com.edutech.cursos.service.CursoServiceImpl;

@Controller
public class CursoViewController {

    private final CursoServiceImpl cursoService;

    public CursoViewController(CursoServiceImpl cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping("/")
    public String mostrarCursos(Model model) {
        List<Curso> cursos = cursoService.listarCursos();
        model.addAttribute("cursos", cursos);
        return "cursos";
    }
}
