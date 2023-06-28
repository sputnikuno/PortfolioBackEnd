package com.porfolio.demo.Dto;

import jakarta.validation.constraints.NotBlank;

public class dtoPersona {

    @NotBlank
    private String nombre;
    @NotBlank
    private String text;
    @NotBlank
    private String image;

    @NotBlank

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String text, String image) {
        this.nombre = nombre;
        this.text = text;
        this.image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
