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
 * @author Usuario
 */
public class AparatosData {
     private Connection con;

    public AparatosData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    
   public void guardarAparato(Aparatos aparato){
        try {
            String sq1 = "INSERT INTO aparatos (dueño, tipoAparato, fechaIngreso, fechaEgreso) VALUES (?, ?, ?, ?);";
            PreparedStatement ps = con.prepareStatement(sq1, Statement.RETURN_GENERATED_KEYS);
             ps.setInt(1, aparato.getDueño());
             ps.setString(2, aparato.getTipoAparato());
             ps.setDate(3, Date.valueOf(aparato.getFechaIngreso()));
             ps.setDate(4, Date.valueOf(aparato.getFechaEgreso()));
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                aparato.setNroDeSerie(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un aparato");
            }
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un aparato: " + ex.getMessage());
        }
    }
    
    public List<Aparatos> obtenerAparatos(){
        List<Aparatos> aparatos = new ArrayList<Aparatos>();
            

        try {
            String sql = "SELECT * FROM Aparatos;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            Aparatos aparato;
            while(resultSet.next()){
                aparato = new Aparatos();
                aparato.setNroDeSerie(resultSet.getInt("nroDeSeie"));
                aparato.setDueño(resultSet.getInt("dueño"));
                aparato.setTipoAparato(resultSet.getString("tipoAparato"));
                aparato.setFechaIngreso(resultSet.getDate("fechaIngreso").toLocalDate());
                aparato.setFechaEgreso(resultSet.getDate("fechaEgreso").toLocalDate());

                aparatos.add(aparato);
            }      
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los aparatos: " + ex.getMessage());
        }
        
        
        return aparatos;
    }
    
    public void borrarAparatos(int nroDeSerie){
    try {
            
            String sql = "DELETE FROM aparatos WHERE nroDeSerie =?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, nroDeSerie);
                      
            ps.executeUpdate();
                        
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un aparato: " + ex.getMessage());
        }
        
    
    }
    
    public void actualizarAparatos(Aparatos aparatos){
    
        try {
            
            String sql = "UPDATE aparatos SET dueño = ? , "
                    + "tipoAparato =?, fechaEgreso =?, fechaIngreso =?, WHERE nroDeSerie = ?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, aparatos.getNroDeSerie());
            ps.setInt(2, aparatos.getDueño());
            ps.setString(3, aparatos.getTipoAparato());
            ps.setDate(4, Date.valueOf(aparatos.getFechaIngreso()));
            ps.setDate(5, Date.valueOf(aparatos.getFechaEgreso()));
            ps.executeUpdate();
            
          
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un aparato: " + ex.getMessage());
        }
    
    }
    
    public Aparatos buscarAparatos(int nroDeSerie){
    Aparatos aparato=null;
    try {
            
            String sql = "SELECT * FROM aparatos WHERE nroDeSerie =?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, nroDeSerie);
           
            
            ResultSet resultSet=ps.executeQuery();
            
            while(resultSet.next()){
                aparato = new Aparatos();
                aparato.setNroDeSerie(resultSet.getInt("nroDeSerie"));
                aparato.setDueño(resultSet.getInt("dueño"));
                aparato.setTipoAparato(resultSet.getString("tipoAparato"));
                aparato.setFechaIngreso(resultSet.getDate("fechaIngreso").toLocalDate());
                aparato.setFechaEgreso(resultSet.getDate("fechaEgreso").toLocalDate());
                
                
            }      
            ps.close();
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar aparato: " + ex.getMessage());
        }
        
        return aparato;
    }
    
}

