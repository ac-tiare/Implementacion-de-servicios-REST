package com.edutech.usuarios.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.edutech.usuarios.model.Usuario;
import com.edutech.usuarios.service.UsuarioService;

@Controller
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/details")
    public String inicio(Model model) {
        List<Usuario> usuarios = usuarioService.listaUsuarios();
        model.addAttribute("usuarios", usuarios);
        return "index";
    }
}
