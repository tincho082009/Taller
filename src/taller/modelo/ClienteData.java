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
public class ClienteData {
    private Connection con;

    public ClienteData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    
   public void guardarCliente(Clientes cliente){
        try {
            
            String sql = "INSERT INTO clientes (nombre, dni, domicilio, celular) VALUES (? ,  ? , ? , ? );";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
            ps.setString(1, cliente.getNombre());
            ps.setLong(2, cliente.getDni());
            ps.setString(3, cliente.getDomicilio());
            ps.setLong(4, cliente.getCelular());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                cliente.setIdCliente(rs.getLong(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un cliente");
            }
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un cliente: " + ex.getMessage());
        }
    }
    
    public List<Clientes> obtenerClientes(){
        List<Clientes> clientes = new ArrayList<Clientes>();
            

        try {
            String sql = "SELECT * FROM clientes;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            Clientes cliente;
            while(resultSet.next()){
                cliente = new Clientes();
                cliente.setIdCliente(resultSet.getInt("idCliente"));
                cliente.setNombre(resultSet.getString("nombre"));
                cliente.setDni(resultSet.getLong("dni"));
                cliente.setDomicilio(resultSet.getString("domicilio"));
                cliente.setCelular(resultSet.getLong("celular"));

                clientes.add(cliente);
            }      
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los clientes: " + ex.getMessage());
        }
        
        
        return clientes;
    }
    
    public void borrarClientes(long idCliente){
    try {
            
            String sql = "DELETE FROM clientes WHERE idCliente =?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, idCliente);
                      
            ps.executeUpdate();
                        
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un cliente: " + ex.getMessage());
        }
        
    
    }
    
    public void actualizarClientes(Clientes cliente){
    
        try {
            
            String sql = "UPDATE clientes SET nombre = ?, dni = ? , "
                    + "domicilio =?, celular =? WHERE idCliente = ?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cliente.getNombre());
            ps.setLong(2, cliente.getDni());
            ps.setString(3, cliente.getDomicilio());
            ps.setLong(4, cliente.getCelular());
            ps.setInt(5, (int) cliente.getIdCliente());
            ps.executeUpdate();
            
          
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un cliente: " + ex.getMessage());
        }
    
    }
    
    public Clientes buscarClientes(long idCliente){
    Clientes cliente=null;
    try {
            
            String sql = "SELECT * FROM clientes WHERE idCliente =?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, idCliente);
           
            
            ResultSet resultSet=ps.executeQuery();
            
            while(resultSet.next()){
                cliente = new Clientes();
                cliente.setIdCliente(resultSet.getLong("idCliente"));
                cliente.setNombre(resultSet.getString("nombre"));
                cliente.setDni(resultSet.getLong("dni"));
                cliente.setDomicilio(resultSet.getString("domicilio"));
                cliente.setCelular(resultSet.getLong("celular"));
                
            }      
            ps.close();
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un cliente: " + ex.getMessage());
        }
        
        return cliente;
    }
    
}
