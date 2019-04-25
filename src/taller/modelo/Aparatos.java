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
public class Aparatos {
    private int nroDeSerie;
    private Clientes dueño;
    private String tipoAparato;
    private LocalDate fechaIngreso;
    private LocalDate fechaEgreso;

    public Aparatos() {
    }

    public Aparatos(Clientes dueño, String tipoAparato, LocalDate fechaIngreso, LocalDate fechaEgreso) {
        this.dueño = dueño;
        this.tipoAparato = tipoAparato;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
    }

    public Aparatos(int nroDeSerie, Clientes dueño, String tipoAparato, LocalDate fechaIngreso, LocalDate fechaEgreso) {
        this.nroDeSerie = nroDeSerie;
        this.dueño = dueño;
        this.tipoAparato = tipoAparato;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
    }
    
    public int getNroDeSerie() {
        return nroDeSerie;
    }

    public void setNroDeSerie(int nroDeSerie) {
        this.nroDeSerie = nroDeSerie;
    }

    public Clientes getDueño() {
        return dueño;
    }

    public void setDueño(Clientes dueño) {
        this.dueño = dueño;
    }

    public String getTipoAparato() {
        return tipoAparato;
    }

    public void setTipoAparato(String tipoAparato) {
        this.tipoAparato = tipoAparato;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(LocalDate fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }
    
    public String toString(){
        return nroDeSerie+"-"+dueño+"-"+tipoAparato+"-"+fechaIngreso+"-"+fechaEgreso;
    }
}
