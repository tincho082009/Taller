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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tinch
 */
public class AparatosData {
    private Connection con;
    
    public AparatosData(Conexion conexion){
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            Logger.getLogger(AparatosData.class.getName()).log(Level.SEVERE, null, ex);
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
            
             
        } catch (SQLException ex) {
            Logger.getLogger(AparatosData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
