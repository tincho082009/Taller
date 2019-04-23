/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.modelo;

/**
 *
 * @author Usuario
 */
public class Clientes {
    private long idCliente;
    private String nombre;
    private long dni;
    private String domicilio;
    private long celular;

    public Clientes() {
    }

    public Clientes(String nombre, long dni, String domicilio, long celular) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.celular = celular;
    }

    public Clientes(long idCliente, String nombre, long dni, String domicilio, long celular) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.celular = celular;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }
    
    public String toString(){
        return idCliente+"-"+nombre+"-"+dni+"-"+domicilio+"-"+celular;
    }
}

