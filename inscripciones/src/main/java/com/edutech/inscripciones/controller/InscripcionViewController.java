package com.edutech.inscripciones.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.edutech.inscripciones.dto.CursoDTO;
import com.edutech.inscripciones.dto.InscripcionDetalle;
import com.edutech.inscripciones.dto.UsuarioDTO;
import com.edutech.inscripciones.model.Inscripcion;
import com.edutech.inscripciones.service.InscripcionService;

@Controller
public class InscripcionViewController {

    private final InscripcionService inscripcionService;
    private final RestTemplate restTemplate = new RestTemplate();

    public InscripcionViewController(InscripcionService inscripcionService) {
        this.inscripcionService = inscripcionService;
    }

    @GetMapping("/")
    public String verInscripciones(Model model) {
        List<Inscripcion> lista = inscripcionService.listar();
        List<InscripcionDetalle> detalles = new ArrayList<>();

        for (Inscripcion i : lista) {
            UsuarioDTO usuario = restTemplate.getForObject(
                    "http://localhost:8081/usuarios/" + i.getUsuarioId(),
                    UsuarioDTO.class
            );
            CursoDTO curso = restTemplate.getForObject(
                    "http://localhost:8082/cursos/" + i.getCursoId(),
                    CursoDTO.class
            );

            InscripcionDetalle d = new InscripcionDetalle();
            d.setId(i.getId());
            d.setFecha(i.getFecha());
            d.setNombreUsuario(usuario != null ? usuario.getNombre() : "N/D");
            d.setTituloCurso(curso != null ? curso.getTitulo() : "N/D");

            detalles.add(d);
        }

        model.addAttribute("inscripciones", detalles);
        return "inscripciones";
    }

    @PostMapping("/inscripciones/agregar")
    public String guardar(@RequestParam Long usuarioId, @RequestParam Long cursoId) {
        Inscripcion nueva = new Inscripcion();
        nueva.setUsuarioId(usuarioId);
        nueva.setCursoId(cursoId);
        nueva.setFecha(LocalDate.now());
        inscripcionService.guardar(nueva);
        return "redirect:/";
    }
}

