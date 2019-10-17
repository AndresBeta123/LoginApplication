/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;
import Entidad.*;
import Frontera.*;
import Control.*;
/**
 *
 * @author Estudiante
 */
public class Registro extends javax.swing.JPanel {
    public Sistema sistema = FramePrincipal.sistema;
    /**
     * Creates new form Registro
     */
    public Registro() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreTF = new javax.swing.JTextField();
        contrasenioaTF = new javax.swing.JTextField();
        validarContraseniaTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Salida = new javax.swing.JLabel();

        jLabel1.setText("Nombre");

        jLabel2.setText("Contraseña");

        jLabel3.setText("Validar contraseña");

        nombreTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTFActionPerformed(evt);
            }
        });

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3))
                    .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nombreTF, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .addComponent(contrasenioaTF)
                        .addComponent(validarContraseniaTF))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(contrasenioaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(validarContraseniaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Usuario usuario = new Usuario();
        usuario.setNombre(nombreTF.getText());
        usuario.setPassword(contrasenioaTF.getText());
        Usuario contrasenia = new Usuario();
        contrasenia.setNombre(contrasenioaTF.getText());
        contrasenia.setPassword(validarContraseniaTF.getText());
        ValidarRegistro validarRegistro = new ValidarRegistro();
        System.out.println("-------------");
        String resultado = validarRegistro.validarDatos(usuario,contrasenia);
        System.out.println(resultado);
        if(validarRegistro.confirmarValidacion(usuario, contrasenia)){
            sistema.getUsuarios().add(usuario);
        }
        Salida.setText(resultado);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Salida;
    private javax.swing.JTextField contrasenioaTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nombreTF;
    private javax.swing.JTextField validarContraseniaTF;
    // End of variables declaration//GEN-END:variables
}
