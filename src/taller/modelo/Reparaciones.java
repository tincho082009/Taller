/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.modelo;

import java.time.LocalDate;

/**
 *
 * @author Agustin
 */
public class Reparaciones {
    private int idReparacion;
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

    public Reparaciones(int idReparacion, Aparatos nroDeSerie, Servicios codigo, LocalDate fechaRealizacion, boolean estado) {
        this.idReparacion = idReparacion;
        this.nroDeSerie = nroDeSerie;
        this.codigo = codigo;
        this.fechaRealizacion = fechaRealizacion;
        this.estado = estado;
    }

    public int getIdReparacion() {
        return idReparacion;
    }

    public void setIdReparacion(int idReparacion) {
        this.idReparacion = idReparacion;
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
        return idReparacion+"-"+nroDeSerie+"-"+codigo+"-"+fechaRealizacion+"-"+estado;
    }
}
