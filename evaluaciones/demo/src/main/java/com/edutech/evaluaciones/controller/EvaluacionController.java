package com.edutech.evaluaciones.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edutech.evaluaciones.model.Evaluacion;
import com.edutech.evaluaciones.service.EvaluacionService;

@Controller
@RequestMapping("/evaluaciones")
public class EvaluacionController {
    private final EvaluacionService service;

    public EvaluacionController(EvaluacionService service) {
        this.service = service;
    }

    @GetMapping
    public List<Evaluacion> listar() {
        return service.listar();
    }

    @PostMapping
    public Evaluacion guardar(@RequestBody Evaluacion evaluacion) {
        return service.guardar(evaluacion);
    }
    @GetMapping("/vista-evaluaciones")
    public String mostrarEvaluaciones(Model model) {
    List<Evaluacion> evaluaciones = service.listar(); // Usar "service", no "evaluacionService"
    model.addAttribute("evaluaciones", evaluaciones);
    return "vista-evaluaciones";
}

}

