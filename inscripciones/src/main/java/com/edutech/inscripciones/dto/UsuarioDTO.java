package com.edutech.inscripciones.dto;

public class UsuarioDTO {
    private Long id;
    private String nombre;
    private String correo;

    public UsuarioDTO() {
    }

    public UsuarioDTO(String correo, Long id, String nombre) {
        this.correo = correo;
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }



}
