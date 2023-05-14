package com.porfolio.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String nombreE;
    @NotNull
    private String nombreEmpresa;
    private String esTrabajoActual;
    @NotNull
    private String fechaInicio;
    private String fechaFin;
    @NotNull
    private String descripcionE;
    
    //Constructores
    
    public Experiencia() {    
    }

    public Experiencia(String nombreE, String nombreEmpresa, String esTrabajoActual, String fechaInicio, String fechaFin, String descripcionE) {
        this.nombreE = nombreE;
        this.nombreEmpresa = nombreEmpresa;
        this.esTrabajoActual = esTrabajoActual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcionE = descripcionE;
    }
    
    //g y s

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
