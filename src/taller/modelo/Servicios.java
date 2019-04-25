/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.modelo;

/**
 *
 * @author Agustin
 */
public class Servicios {
    private int codigo;
    private String descripcion;
    private double costo;

    public Servicios() {
    }

    public Servicios(String descripcion, double costo) {
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public Servicios(int codigo, String descripcion, double costo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    public String toString(){
        return codigo+"-"+descripcion+"-"+costo;
    }
}
    
            
