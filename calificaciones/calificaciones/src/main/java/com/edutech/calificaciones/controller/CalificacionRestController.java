package com.edutech.calificaciones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edutech.calificaciones.model.Calificacion;
import com.edutech.calificaciones.service.CalificacionService;

@RestController
@RequestMapping("/api/calificaciones")
public class CalificacionRestController {

    @Autowired
    private CalificacionService service;

    @GetMapping
    public List<Calificacion> listar() {
        return service.obtenerTodas();
    }

    @PostMapping
    public Calificacion guardar(@RequestBody Calificacion calificacion) {
        return service.guardar(calificacion);
    }

    @GetMapping("/{id}")
    public Calificacion obtenerPorId(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @PutMapping("/{id}")
    public Calificacion actualizar(@PathVariable Long id, @RequestBody Calificacion calificacion) {
        return service.actualizar(id, calificacion);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
