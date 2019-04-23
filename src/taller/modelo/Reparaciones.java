/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.modelo;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Reparaciones {
    private int idReparaciones;
    private Aparatos nroDeSerie;
    private Servicios codigo;
    private LocalDate fechaRealizacion;
    private boolean estado;

    public Reparaciones() {
    }

    public Reparaciones(Aparatos nroDeSerie, Servicios codigo, LocalDate fechaRealizacion, boolean estado) {
        this.nroDeSerie = nroDeSerie;
        this.codigo = codigo;
        this.fechaRealizacion = fechaRealizacion;
        this.estado = estado;
    }

    public Reparaciones(int idReparaciones, Aparatos nroDeSerie, Servicios codigo, LocalDate fechaRealizacion, boolean estado) {
        this.idReparaciones = idReparaciones;
        this.nroDeSerie = nroDeSerie;
        this.codigo = codigo;
        this.fechaRealizacion = fechaRealizacion;
        this.estado = estado;
    }

    public int getIdReparaciones() {
        return idReparaciones;
    }

    public void setIdReparaciones(int idReparaciones) {
        this.idReparaciones = idReparaciones;
    }

    public Aparatos getNroDeSerie() {
        return nroDeSerie;
    }

    public void setNroDeSerie(Aparatos nroDeSerie) {
        this.nroDeSerie = nroDeSerie;
    }

    public Servicios getCodigo() {
        return codigo;
    }

    public void setCodigo(Servicios codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(LocalDate fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public String toString(){
        return idReparaciones+"-"+nroDeSerie+"-"+codigo+"-"+fechaRealizacion+"-"+estado;
    }
}
