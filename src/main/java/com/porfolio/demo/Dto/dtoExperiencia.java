package com.porfolio.demo.Dto;

import jakarta.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String nombreEmpresa;
    private String esTrabajoActual;
    @NotBlank
    private String fechaInicio;
    private String fechaFin;
    @NotBlank
    private String descripcionE;

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String nombreEmpresa, String esTrabajoActual, String fechaInicio, String fechaFin, String descripcionE) {
        this.nombreE = nombreE;
        this.nombreEmpresa = nombreEmpresa;
        this.esTrabajoActual = esTrabajoActual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcionE = descripcionE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getEsTrabajoActual() {
        return esTrabajoActual;
    }

    public void setEsTrabajoActual(String esTrabajoActual) {
        this.esTrabajoActual = esTrabajoActual;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
    
}
