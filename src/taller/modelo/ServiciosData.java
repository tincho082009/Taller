/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ServiciosData {
    private Connection con;

    public ServiciosData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    
   public void guardarServicio(Servicios servicio){
        try {
            
            String sql = "INSERT INTO servicios (codigo, descripcion, costo) VALUES (? ,  ? , ? );";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
            ps.setInt(1, servicio.getCodigo());
            ps.setString(2, servicio.getDescripcion());
            ps.setDouble(3, servicio.getCosto());
            
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                servicio.setCodigo(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un servicio");
            }
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un servicio: " + ex.getMessage());
        }
    }
    
    public List<Servicios> obtenerServicios(){
        List<Servicios> servicios = new ArrayList<Servicios>();
            

        try {
            String sql = "SELECT * FROM servicios;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            Servicios servicio;
            while(resultSet.next()){
                servicio = new Servicios();
                servicio.setCodigo(resultSet.getInt("codigo"));
                servicio.setDescripcion(resultSet.getString("descripcion"));
                servicio.setCosto(resultSet.getDouble("costo"));
               

                servicios.add(servicio);
            }      
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los servicios: " + ex.getMessage());
        }
        
        
        return servicios;
    }
    
    public void borrarServicios(int codigo){
    try {
            
            String sql = "DELETE FROM servicios WHERE codigo =?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, codigo);
                      
            ps.executeUpdate();
                        
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar un servicio: " + ex.getMessage());
        }
        
    
    }
    
    public void actualizarServicios(Servicios servicio){
    
        try {
            
            String sql = "UPDATE servicios SET descripcion = ?, costo = ? , WHERE codigo = ?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, servicio.getDescripcion());
            ps.setDouble(2, servicio.getCosto());
            ps.setInt(3, servicio.getCodigo());
            
            ps.executeUpdate();
            
          
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al actualizar un servicio: " + ex.getMessage());
        }
    
    }
    
    public Servicios buscarServicios(int codigo){
    Servicios servicio=null;
    try {
            
            String sql = "SELECT * FROM servicios WHERE codigo =?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, codigo);
           
            
            ResultSet resultSet=ps.executeQuery();
            
            while(resultSet.next()){
                servicio = new Servicios();
                servicio.setCodigo(resultSet.getInt("codigo"));
                servicio.setDescripcion(resultSet.getString("descripcion"));
                servicio.setCosto(resultSet.getDouble("costo"));
               
                
            }      
            ps.close();
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al buscar un servicio: " + ex.getMessage());
        }
        
        return servicio;
    }
}

