/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.modelo;

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
                
                
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
