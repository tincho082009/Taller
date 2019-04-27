/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.modelo;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Agustin
 */
public class Prueba {
    
    
    public static void main(String[] args) {
        try {
            
            //----    CLIENTES    ----//
            
            Conexion conectar = new Conexion();
            
            ClienteData cd = new ClienteData(conectar);
            
            //Clientes jorge = new Clientes("Jorge Perez", 43500500, "El Trapiche", 266454520);
            //cd.guardarCliente(Jorge);
            
            //cd.borrarClientes(14);
            
            //List<Clientes> misClientes = cd.obtenerClientes();
            //for(Clientes x: misClientes){
               //System.out.println("idCliente: " + x.getIdCliente());
                //System.out.println("Nombre: " + x.getNombre());
                //System.out.println("Dni: " + x.getDni());}
                
            //cd.actualizarClientes(jorge);
            
            //Clientes cliente = cd.buscarClientes(15);
            //System.out.println("Nombre: " + cliente.getNombre());
            //System.out.println("Dni:" + cliente.getDni());
              
           
            //----    APARATOS    ----//
            
            AparatosData ad = new AparatosData(conectar);
            
            //Aparatos motosierra = new Aparatos(5, ad.buscarCliente(13), "Motosierra", LocalDate.of(2019, 05, 10), LocalDate.of(2019, 05, 15));
            //ad.guardarAparato(motosierra);
            
            //ad.borrarAparatos(6);
            
            //List<Aparatos> misAparatos = ad.obtenerAparatos();
            //for(Aparatos x: misAparatos){
                //System.out.println("nroDeSerie: " + x.getNroDeSerie());
                //System.out.println("dueño: " + x.getDueño().getIdCliente());
                //System.out.println("tipoAparato: " + x.getTipoAparato());
                //System.out.println("Fecha de ingreso: " + x.getFechaIngreso());
                //System.out.println("Fecha de egreso: " + x.getFechaEgreso());}
                
            //Aparatos x = ad.buscarAparatos(4);
            //System.out.println("tipoAparato: " + x.getTipoAparato());
            
            //ad.actualizarAparatos(motosierra);
            
            //----     SERVICIOS    ----//
            
            ServiciosData sd = new ServiciosData(conectar);
            
            //Servicios servicio1 = new Servicios(3, "Arreglo de auriculares", 400.0);
            //sd.guardarServicio(servicio1);
            
            //sd.borrarServicios(4);
            
            //List<Servicios> listaServicios = sd.obtenerServicios();
            //for(Servicios x: listaServicios){
               //System.out.println("Descripcion: " + x.getDescripcion());
               // System.out.println("Costo: " + x.getCosto());}
            
            //Servicios servicio1 = sd.buscarServicios(2);
            //System.out.println("Descripcion: " + servicio1.getDescripcion());
            //System.out.println("Costo: " + servicio1.getCosto());
            
            //sd.actualizarServicios(servicio1);
            
            //----    REPARACIONES    ----//
            
            ReparacionesData rd = new ReparacionesData(conectar);
            
            Reparaciones rep1 = new Reparaciones(2, rd.buscarAparato(5), rd.buscarServicio(1), rd.buscarAparato(5).getFechaEgreso(), false);
            //rd.guardarReparacion(rep1);
            
            //List<Reparaciones> listaRep = rd.obtenerReparaciones();
            //for(Reparaciones x: listaRep){
                //System.out.println("nro de serie: " + x.getNroDeSerie().getNroDeSerie());
                //System.out.println("codigo: " + x.getCodigo().getCodigo());
                //System.out.println("estado: " + x.isEstado()); }
            
            //Reparaciones rep1 = rd.buscarReparaciones(2);
                //System.out.println("nro de serie: " + rep1.getNroDeSerie().getNroDeSerie());
                //System.out.println("codigo: " + rep1.getCodigo().getCodigo());
                //System.out.println("estado: " + rep1.isEstado()); 
            
            //rd.actualizarReparaciones(rep1);
            
            //rd.borrarReparaciones(2);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
