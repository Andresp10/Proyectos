/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class IndexAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form IndexAdministrador
     */
    public IndexAdministrador() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnRegistrarFuncionario = new javax.swing.JPanel();
        lblRegistrarFuncionario1 = new javax.swing.JLabel();
        lblRegistrarFuncionario3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblRegistrarFuncionario4 = new javax.swing.JLabel();
        lblRegistrarFuncionario5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblRegistrarFuncionario = new javax.swing.JLabel();
        lblRegistrarFuncionario2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblFuncionariosRegistrados = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Andres\\Documents\\NetBeansProjects\\SegurosClient\\src\\Recursos\\Security Checked_60px.png")); // NOI18N
        jLabel1.setText("Inicio");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Andres\\Documents\\NetBeansProjects\\SegurosClient\\src\\Recursos\\Shutdown_15px.png")); // NOI18N
        jLabel5.setText("Cerrar Sesión");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 90));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnRegistrarFuncionario.setBackground(new java.awt.Color(220, 140, 31));
        pnRegistrarFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnRegistrarFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnRegistrarFuncionarioMouseClicked(evt);
            }
        });
        pnRegistrarFuncionario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegistrarFuncionario1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblRegistrarFuncionario1.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrarFuncionario1.setText("Registrar");
        lblRegistrarFuncionario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarFuncionario1MouseClicked(evt);
            }
        });
        pnRegistrarFuncionario.add(lblRegistrarFuncionario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        lblRegistrarFuncionario3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblRegistrarFuncionario3.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrarFuncionario3.setText("Funcionario");
        lblRegistrarFuncionario3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarFuncionario3MouseClicked(evt);
            }
        });
        pnRegistrarFuncionario.add(lblRegistrarFuncionario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jPanel2.add(pnRegistrarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 180, 140));

        jPanel4.setBackground(new java.awt.Color(30, 182, 35));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        lblRegistrarFuncionario4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblRegistrarFuncionario4.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrarFuncionario4.setText("Registrar");
        lblRegistrarFuncionario4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarFuncionario4MouseClicked(evt);
            }
        });

        lblRegistrarFuncionario5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblRegistrarFuncionario5.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrarFuncionario5.setText("Siniestros");
        lblRegistrarFuncionario5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarFuncionario5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRegistrarFuncionario5)
                    .addComponent(lblRegistrarFuncionario4))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblRegistrarFuncionario4)
                .addGap(18, 18, 18)
                .addComponent(lblRegistrarFuncionario5)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 170, 140));

        jPanel5.setBackground(new java.awt.Color(59, 27, 203));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        lblRegistrarFuncionario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblRegistrarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrarFuncionario.setText("Registrar");
        lblRegistrarFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarFuncionarioMouseClicked(evt);
            }
        });

        lblRegistrarFuncionario2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblRegistrarFuncionario2.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrarFuncionario2.setText("Clientes");
        lblRegistrarFuncionario2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarFuncionario2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblRegistrarFuncionario2))
                    .addComponent(lblRegistrarFuncionario))
                .addGap(36, 36, 36))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblRegistrarFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRegistrarFuncionario2)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 170, 110));

        jPanel3.setBackground(new java.awt.Color(217, 158, 40));

        lblFuncionariosRegistrados.setForeground(new java.awt.Color(255, 255, 255));
        lblFuncionariosRegistrados.setText("Funcionarios Registrados");
        lblFuncionariosRegistrados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFuncionariosRegistrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFuncionariosRegistradosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(lblFuncionariosRegistrados)
                .addGap(29, 29, 29))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFuncionariosRegistrados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 180, 30));

        jPanel6.setBackground(new java.awt.Color(60, 105, 209));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Clientes Registrados");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(31, 31, 31))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 170, 30));

        jPanel7.setBackground(new java.awt.Color(29, 230, 46));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Siniestros Registrados");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 170, 30));

        jPanel8.setBackground(new java.awt.Color(60, 105, 209));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Editar Datos del Cliente");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(26, 26, 26))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 170, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 680, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnRegistrarFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnRegistrarFuncionarioMouseClicked
        // TODO add your handling code here:
        new RegistroFuncionario().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_pnRegistrarFuncionarioMouseClicked

    private void lblRegistrarFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarFuncionarioMouseClicked
        // TODO add your handling code here:
        new RegistroCliente().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblRegistrarFuncionarioMouseClicked

    private void lblRegistrarFuncionario2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarFuncionario2MouseClicked
        // TODO add your handling code here:
        new RegistroCliente().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblRegistrarFuncionario2MouseClicked

    private void lblFuncionariosRegistradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFuncionariosRegistradosMouseClicked
        // TODO add your handling code here:
        new FuncionariosRegistrados().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblFuncionariosRegistradosMouseClicked

    private void lblRegistrarFuncionario1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarFuncionario1MouseClicked
        // TODO add your handling code here:
        new RegistroFuncionario().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblRegistrarFuncionario1MouseClicked

    private void lblRegistrarFuncionario3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarFuncionario3MouseClicked
        // TODO add your handling code here:
        new RegistroFuncionario().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblRegistrarFuncionario3MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        new RegistroCliente().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        new ClientesRegistrados().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void lblRegistrarFuncionario4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarFuncionario4MouseClicked
        // TODO add your handling code here:
        new RegistroSiniestro().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblRegistrarFuncionario4MouseClicked

    private void lblRegistrarFuncionario5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarFuncionario5MouseClicked
        // TODO add your handling code here:
        new RegistroSiniestro().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblRegistrarFuncionario5MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        new RegistroSiniestro().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        new EditarCliente().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        new SiniestrosRegistrados().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(IndexAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndexAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndexAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndexAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndexAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblFuncionariosRegistrados;
    private javax.swing.JLabel lblRegistrarFuncionario;
    private javax.swing.JLabel lblRegistrarFuncionario1;
    private javax.swing.JLabel lblRegistrarFuncionario2;
    private javax.swing.JLabel lblRegistrarFuncionario3;
    private javax.swing.JLabel lblRegistrarFuncionario4;
    private javax.swing.JLabel lblRegistrarFuncionario5;
    private javax.swing.JPanel pnRegistrarFuncionario;
    // End of variables declaration//GEN-END:variables
}
