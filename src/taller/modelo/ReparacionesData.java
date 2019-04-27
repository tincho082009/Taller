/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Agustin
 */
public class ReparacionesData {
    private Connection con = null;
    private Conexion conexion;

    public ReparacionesData(Conexion conexion) {
        try {
            this.conexion=conexion;
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    
   public void guardarReparacion(Reparaciones reparacion){
        try {
            
            String sql = "INSERT INTO reparaciones (nroDeSerie, codigo, fechaRealizacion, estado) VALUES (? ,  ? , ? , ?);";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
            ps.setInt(1, reparacion.getNroDeSerie().getNroDeSerie());
            ps.setInt(2, reparacion.getCodigo().getCodigo());
            ps.setDate(3, Date.valueOf(reparacion.getFechaRealizacion()));
            ps.setBoolean(4, reparacion.isEstado());
         
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                reparacion.setIdReparacion(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar una reparacion");
            }
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una reparacion: " + ex.getMessage());
        }
    }
    
    public List<Reparaciones> obtenerReparaciones(){
        List<Reparaciones> reparaciones = new ArrayList<Reparaciones>();
            

        try {
            String sql = "SELECT * FROM reparaciones;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            Reparaciones reparacion;
            while(resultSet.next()){
                reparacion = new Reparaciones();
                reparacion.setIdReparacion(resultSet.getInt("idReparacion"));
                
                Aparatos a=buscarAparato(resultSet.getInt("nroDeSerie"));
                reparacion.setNroDeSerie(a);
                
                Servicios ser=buscarServicio(resultSet.getInt("codigo"));
                reparacion.setCodigo(ser);
                
                reparacion.setFechaRealizacion(resultSet.getDate("fechaRealizacion").toLocalDate());
                
                reparacion.setEstado(resultSet.getBoolean("estado"));

                reparaciones.add(reparacion);
            }      
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las reparaciones: " + ex.getMessage());
        }
        
        
        return reparaciones;
    }
    
    public void borrarReparaciones(int idReparacion){
    try {
            
            String sql = "DELETE FROM reparaciones WHERE idReparacion =?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, idReparacion);
                      
            ps.executeUpdate();
                        
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una reparacion: " + ex.getMessage());
        }
        
    
    }
    
    public void actualizarReparaciones(Reparaciones reparacion){
    
        try {
            
            String sql = "UPDATE reparaciones SET nroDeSerie = ?, codigo = ? , "
                    + "fechaRealizacion =?, estado =? WHERE idReparacion = ?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, reparacion.getNroDeSerie().getNroDeSerie());
            ps.setInt(2, reparacion.getCodigo().getCodigo());
            ps.setDate(3, Date.valueOf(reparacion.getFechaRealizacion()));
            ps.setBoolean(4, reparacion.isEstado());
            ps.setInt(5, reparacion.getIdReparacion());
            ps.executeUpdate();
            
          
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al actualizar una reparacion: " + ex.getMessage());
        }
    
    }
    
    public Reparaciones buscarReparaciones(int idReparacion){
    Reparaciones reparacion=null;
    try {
            
            String sql = "SELECT * FROM reparaciones WHERE idReparacion =?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idReparacion);
           
            
            ResultSet resultSet=ps.executeQuery();
            
            while(resultSet.next()){
                reparacion = new Reparaciones();
                reparacion.setIdReparacion(resultSet.getInt("idReparacion"));
                
                Aparatos a=buscarAparato(resultSet.getInt("nroDeSerie"));
                reparacion.setNroDeSerie(a);
                
                Servicios ser=buscarServicio(resultSet.getInt("codigo"));
                reparacion.setCodigo(ser);
                
                reparacion.setFechaRealizacion(resultSet.getDate("fechaRealizacion").toLocalDate());
                reparacion.setEstado(resultSet.getBoolean("estado"));
                
            }      
            ps.close();
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al buscar una reparacion: " + ex.getMessage());
        }
        
        return reparacion;
    }
    
    public Aparatos buscarAparato(int nroDeSerie){
        AparatosData ad = new AparatosData(conexion);
        return ad.buscarAparatos(nroDeSerie);
    }
    
    public Servicios buscarServicio(int codigo){
        ServiciosData sd = new ServiciosData(conexion);
        return sd.buscarServicios(codigo);
    }
}

