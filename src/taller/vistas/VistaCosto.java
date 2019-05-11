/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.vistas;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import taller.modelo.Aparatos;
import taller.modelo.AparatosData;
import taller.modelo.Clientes;
import taller.modelo.Conexion;
import taller.modelo.ReparacionesData;
import taller.modelo.Servicios;
import taller.modelo.ServiciosData;

/**
 *
 * @author tinch
 */
public class VistaCosto extends javax.swing.JInternalFrame {
    
     private Conexion conexion;
     private AparatosData ad;
     private ServiciosData sd;
     private DefaultTableModel modelo;
     private Clientes cliente;
     private ReparacionesData rd;
    /**
     * Creates new form VistaCosto
     */
    public VistaCosto() {
         try {
             initComponents();
             conexion = new Conexion();
             ad = new AparatosData(conexion);
             modelo= new DefaultTableModel();
             rd = new ReparacionesData(conexion);
             
             List<Aparatos> lista = ad.obtenerAparatos();
             for(Aparatos it: lista){
                 jcbAparatos.addItem(it);
             }
             
             armarCabeceraTabla();
             borrarFilas();
             cargarServicios();
             
             
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(VistaCosto.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbAparatos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtServicios = new javax.swing.JTable();
        jbCalcular = new javax.swing.JButton();
        jtCosto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 153));
        jLabel1.setText("Costo total por aparato");

        jLabel2.setText("Aparatos");

        jcbAparatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAparatosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 0));
        jLabel3.setText("Servicios aplicados");

        jtServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtServicios);

        jbCalcular.setText("Calcular");
        jbCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 51, 0));
        jLabel4.setText("Costo Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jcbAparatos, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbCalcular)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbAparatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCalcular)
                    .addComponent(jtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbAparatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAparatosActionPerformed
        // TODO add your handling code here:
        borrarFilas();
        cargarServicios();
       
    }//GEN-LAST:event_jcbAparatosActionPerformed

    private void jbCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularActionPerformed
        // TODO add your handling code here:     
        int cantidadDeFilas = jtServicios.getRowCount();
        int fila = 0;
        double costos = 0;
        while(fila < cantidadDeFilas){
           costos = costos + (Double) modelo.getValueAt(fila, 2);          
           fila++;
        }
         jtCosto.setText(costos + " ");  
           
    }//GEN-LAST:event_jbCalcularActionPerformed
    public void armarCabeceraTabla(){
        ArrayList<Object> columnas = new ArrayList<Object>();
         columnas.add("codigo");
         columnas.add("descripcion");
         columnas.add("costo");
         for(Object it: columnas){
             
             modelo.addColumn(it);
         }
         jtServicios.setModel(modelo);
    
}
    public void borrarFilas(){
        int a = modelo.getRowCount() - 1;
        
        for(int i=a; i>=0; i--){
            modelo.removeRow(i);
        }
    }
    
    public void cargarServicios(){
        
        Aparatos aparato = (Aparatos)jcbAparatos.getSelectedItem();
        List<Servicios> servicio = rd.obtenerServicios(aparato.getNroDeSerie());
        
        for(Servicios a: servicio){
            modelo.addRow(new Object[]{a.getCodigo(), a.getDescripcion(), a.getCosto()});
        }
       
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCalcular;
    private javax.swing.JComboBox<Aparatos> jcbAparatos;
    private javax.swing.JTextField jtCosto;
    private javax.swing.JTable jtServicios;
    // End of variables declaration//GEN-END:variables
}