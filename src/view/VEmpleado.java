/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import biz.Contrato;
import biz.Empleado;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import util.Util;

/**
 *
 * @author Camilo
 */
public class VEmpleado extends javax.swing.JFrame {
    
    final String NOM_ARCHIVO = "Empleado.dat";
    ArrayList<Object> objetos = new ArrayList<>();
    Util util = new Util();
    Empleado objeto;

    /**
     * Creates new form VEmpleado
     */
    public VEmpleado() {
        initComponents();
        setLocationRelativeTo(null);
        getObjetos(false, true, false);
    }
    
    private void getObjetos(boolean estNuevo, boolean estGuardar, boolean estBorrar) {
        
        txContrato.setText("");
        txCorreo.setText("");
        txIdentificacion.setText("");
        txNombre.setText("");
        jbNuevo.setText("Nuevo");
        jbGuardar.setText("Guardar");
        jbBorrar.setText("Borrar");
        jbCerrar.setText("Cerrar");
        objeto = new Empleado();
        setEstadoBotones(estNuevo, estGuardar, estBorrar);
        if (util.desSerializar(NOM_ARCHIVO) != null) {
            objetos = (ArrayList) util.desSerializar(NOM_ARCHIVO);
            String[] t = {"listado Contratos"};
            this.listado.setModel(new DefaultTableModel(util.setJTable(objetos), t));
        }
    }
    
    private void setEstadoBotones(boolean estNuevo, boolean estGuardar, boolean estBorrar) {
        jbNuevo.setEnabled(estNuevo);
        jbGuardar.setEnabled(estGuardar);
        jbBorrar.setEnabled(estBorrar);
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
        txNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txCorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txIdentificacion = new javax.swing.JTextField();
        jbCerrar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jbContrato = new javax.swing.JButton();
        txContrato = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empleados");

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Empleado");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");

        txNombre.setText("jTextField1");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Correo:");

        txCorreo.setText("jTextField1");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Identificación:");

        txIdentificacion.setText("jTextField1");

        jbCerrar.setText("Cerrar");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Contrato:");

        jbContrato.setText("jButton5");
        jbContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbContratoActionPerformed(evt);
            }
        });

        txContrato.setText("jTextField4");

        listado.setModel(new javax.swing.table.DefaultTableModel(
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
        listado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCerrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txContrato)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txCorreo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txIdentificacion))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbContrato))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbCerrar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbBorrar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listadoMouseClicked
        objeto = (Empleado) this.listado.getValueAt(listado.getSelectedRow(), 0);
        this.txCorreo.setText(String.valueOf(objeto.getCorreo()));
        this.txIdentificacion.setText(String.valueOf(objeto.getIdentificacion()));
        this.txNombre.setText(String.valueOf(objeto.getNombre()));
        setEstadoBotones(true, true, true);
    }//GEN-LAST:event_listadoMouseClicked

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        getObjetos(false, true, false);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        objetos.remove(objeto);
        util.serializar(NOM_ARCHIVO, objetos);
        getObjetos(false, true, false);
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        objeto.setCorreo(String.valueOf(txCorreo.getText()));
        objeto.setIdentificacion(Long.parseLong(txIdentificacion.getText()));
        objeto.setNombre(String.valueOf(txNombre.getText()));
        objeto.liquidarAnio(valmes(),valanodeduciones());
        objeto.liquidarMes(valano(),valmesdeduciones());
        objetos.remove(objeto);
        objetos.add(objeto);
        util.serializar(NOM_ARCHIVO, objetos);
        getObjetos(false, true, false);
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jbContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbContratoActionPerformed
        try {
            view.vFk fk = new view.vFk(this, "Contrato.dat", "Contratos", false);
            fk.setVisible(true);
            objeto.setContrato((Contrato) fk.getSeleccion().get(0));
            txContrato.setText(objeto.getContrato().toString());
        } catch (Exception e) {
            Logger.getLogger(VEmpleado.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jbContratoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(VEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VEmpleado().setVisible(true);
            }
        });
    }
    
    public int valano(){
        
        String cadena1 = txContrato.getText();
        
        String[] separador = cadena1.split(":");
        String valorseparado = separador[13];
        String[] separador2 = valorseparado.split("}");
        int valorano = Integer.parseInt(separador2[0].trim());
        
        return valorano;
    }
    
    public int valmes(){
        
        String cadena1 = txContrato.getText();
        
        String[] separador = cadena1.split(":");
        String valorseparado = separador[12];
        String[] separador2 = valorseparado.split("   ");
        int valormes = Integer.parseInt(separador2[0].trim());
        
        return valormes;
        
    }
    
    public int valanodeduciones(){
        
        String cadena1 = txContrato.getText();
        String[] separador = cadena1.split(":");
        String valorseparado = separador[6];
        String[] separador2 = valorseparado.split("Concepto");
        int valoranodeduccion = Integer.parseInt(separador2[0].trim());
        
        return valoranodeduccion;
    }
    
    public int valmesdeduciones(){
        
        String cadena1 = txContrato.getText();
        
        String[] separador = cadena1.split(":");
        String valorseparado = separador[5];
        String[] separador2 = valorseparado.split("AnioDeduccion");
        int valormesdeduccion = Integer.parseInt(separador2[0].trim());
        return valormesdeduccion;
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbContrato;
    public javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JTable listado;
    public javax.swing.JTextField txContrato;
    public javax.swing.JTextField txCorreo;
    public javax.swing.JTextField txIdentificacion;
    public javax.swing.JTextField txNombre;
    // End of variables declaration//GEN-END:variables
}
