/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.vistas;

/**
 *
 * @author Usuario
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jmAparatos = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jmServicios = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jmClientes = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jmEstado = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar3.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar3.add(jMenu8);

        jMenu1.setText("File");
        jMenuBar4.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar4.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taller/vistas/iconoArchivo.png"))); // NOI18N
        jMenu3.setText("Archivo");
        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taller/vistas/iconoAparatos.png"))); // NOI18N
        jMenu4.setText("Aparatos");

        jmAparatos.setText("Formulario Aparatos");
        jmAparatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAparatosActionPerformed(evt);
            }
        });
        jMenu4.add(jmAparatos);

        jMenuBar1.add(jMenu4);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taller/vistas/iconoServicios.png"))); // NOI18N
        jMenu9.setText("Servicios");

        jmServicios.setText("Formulario Servicios");
        jmServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmServiciosActionPerformed(evt);
            }
        });
        jMenu9.add(jmServicios);

        jMenuBar1.add(jMenu9);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taller/vistas/iconoClientes.png"))); // NOI18N
        jMenu10.setText("Clientes");

        jmClientes.setText("Formulario Clientes");
        jmClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmClientesActionPerformed(evt);
            }
        });
        jMenu10.add(jmClientes);

        jMenuBar1.add(jMenu10);

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taller/vistas/iconoReparaciones.png"))); // NOI18N
        jMenu11.setText("Reparaciones");

        jmEstado.setText("Estado de los aparatos");
        jmEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEstadoActionPerformed(evt);
            }
        });
        jMenu11.add(jmEstado);

        jMenuBar1.add(jMenu11);

        jMenu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taller/vistas/iconoCosto.png"))); // NOI18N
        jMenu12.setText("CostoFinal");

        jMenuItem1.setText("CostoXAparato");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem1);

        jMenuBar1.add(jMenu12);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmAparatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAparatosActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        VistaAparatos va = new VistaAparatos();
        va.setVisible(true);
        Escritorio.add(va);
        Escritorio.moveToFront(va);
    }//GEN-LAST:event_jmAparatosActionPerformed

    private void jmServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmServiciosActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        VistaServicios vs = new VistaServicios();
        vs.setVisible(true);
        Escritorio.add(vs);
        Escritorio.moveToFront(vs);
    }//GEN-LAST:event_jmServiciosActionPerformed

    private void jmClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmClientesActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        VistaClientes vc = new VistaClientes();
        vc.setVisible(true);
        Escritorio.add(vc);
        Escritorio.moveToFront(vc);
    }//GEN-LAST:event_jmClientesActionPerformed

    private void jmEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEstadoActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        VistaReparaciones vr = new VistaReparaciones();
        vr.setVisible(true);
        Escritorio.add(vr);
        Escritorio.moveToFront(vr);      
    }//GEN-LAST:event_jmEstadoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        VistaCosto vc = new VistaCosto();
        vc.setVisible(true);
        Escritorio.add(vc);
        Escritorio.moveToFront(vc); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the 
        look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jmAparatos;
    private javax.swing.JMenuItem jmClientes;
    private javax.swing.JMenuItem jmEstado;
    private javax.swing.JMenuItem jmServicios;
    // End of variables declaration//GEN-END:variables
}
