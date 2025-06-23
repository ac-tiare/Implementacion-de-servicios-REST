package com.edutech.calificaciones.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edutech.calificaciones.model.Calificacion;
import com.edutech.calificaciones.service.CalificacionService;

@Controller
@RequestMapping("/calificaciones")
public class CalificacionController {

    @Autowired
    private CalificacionService service;

    @GetMapping("/lista")
    public String mostrarLista(Model model) {
        model.addAttribute("calificaciones", service.obtenerTodas());
        return "lista";
    }

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("calificacion", new Calificacion());
        return "formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Calificacion calificacion) {
        service.guardar(calificacion);
        return "redirect:/calificaciones/lista";
    }
}
