/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.INICIO;
import AppPackage.AnimationClass;
import com.sun.org.apache.xerces.internal.impl.dv.xs.YearMonthDV;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import sun.org.mozilla.javascript.internal.ast.Yield;
/**
 *
 * @author PRINCIPAL
 */
public class primero extends javax.swing.JFrame {

    /**
     * Creates new form primero
     */
    public primero() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogin = new javax.swing.JPanel();
        jLabelIngreso3 = new javax.swing.JLabel();
        jTextFieldUSER = new javax.swing.JTextField();
        jLabelIngreso2 = new javax.swing.JLabel();
        jLabelIngreso1 = new javax.swing.JLabel();
        jPasswordFieldCONTRASEÑA = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JPanel();
        salir = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        disminuir = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        principal = new javax.swing.JLabel();
        secundario = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelLogin.setOpaque(false);
        jPanelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIngreso3.setFont(new java.awt.Font("DotumChe", 1, 12)); // NOI18N
        jLabelIngreso3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIngreso3.setText("::::::::::");
        jLabelIngreso3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelIngreso3MouseClicked(evt);
            }
        });
        jPanelLogin.add(jLabelIngreso3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 70, -1));

        jTextFieldUSER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUSERActionPerformed(evt);
            }
        });
        jPanelLogin.add(jTextFieldUSER, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 160, 30));

        jLabelIngreso2.setFont(new java.awt.Font("DotumChe", 1, 12)); // NOI18N
        jLabelIngreso2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIngreso2.setText("USUARIO:");
        jPanelLogin.add(jLabelIngreso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, -1));

        jLabelIngreso1.setFont(new java.awt.Font("DotumChe", 1, 12)); // NOI18N
        jLabelIngreso1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIngreso1.setText("CONTRASEÑA:");
        jPanelLogin.add(jLabelIngreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, -1));

        jPasswordFieldCONTRASEÑA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldCONTRASEÑAActionPerformed(evt);
            }
        });
        jPanelLogin.add(jPasswordFieldCONTRASEÑA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 170, 30));

        jButtonLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GO_LOG_ON.png"))); // NOI18N
        jButtonLogin.setBorder(null);
        jButtonLogin.setContentAreaFilled(false);
        jButtonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLoginMouseClicked(evt);
            }
        });
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanelLogin.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 70, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LOGIN_INGRESO.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanelLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 200));

        getContentPane().add(jPanelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, -170, 250, 230));

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Delete_32px.png"))); // NOI18N
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        background.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/paloPublic.png"))); // NOI18N
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 1000, 10));

        disminuir.setForeground(new java.awt.Color(255, 255, 255));
        disminuir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        disminuir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disminuirMouseClicked(evt);
            }
        });
        background.add(disminuir, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 40, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/paloPublic.png"))); // NOI18N
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 94, 1000, 10));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NEXT.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        background.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BACK.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        background.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 430, -1, -1));

        principal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/INTEGRANTES.png"))); // NOI18N
        background.add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, 340));

        secundario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/INTEGRANTES (3).png"))); // NOI18N
        background.add(secundario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1000, 520));

        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SISTEMA DE CONTROL DE ASSITENCIA (7).png"))); // NOI18N
        background.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1000, 500));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1000, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       AnimationClass  ac= new AnimationClass();
       ac.jLabelXRight(-1000, 0, 25, 5, principal);
       
        AnimationClass  ac1= new AnimationClass();
       ac1.jLabelXRight(0, 1000, 25, 5, secundario);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       
         AnimationClass  ac= new AnimationClass();
       ac.jLabelXLeft(0, -1000, 25, 5, principal);
       
        AnimationClass  ac1= new AnimationClass();
       ac1.jLabelXLeft(1000, 0, 25, 5, secundario);
    
    }//GEN-LAST:event_jButton2MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        AnimationClass  ac= new AnimationClass();
       ac.jLabelXLeft(0, -1000, 25, 5, principal);
       
        AnimationClass  ac1= new AnimationClass();
       ac1.jLabelXLeft(1000, 0, 25, 5, secundario);
    
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void disminuirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disminuirMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_disminuirMouseClicked

    private void jButtonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLoginMouseClicked
        String user = "villavicencio";
        String contraseña = "2020";
        if (jTextFieldUSER.getText()=="" && jPasswordFieldCONTRASEÑA.getText()=="") {
            JOptionPane.showMessageDialog(this, "SIN DATOS");
        }else{
            if (jTextFieldUSER.getText().equals(user) &&  jPasswordFieldCONTRASEÑA.getText().equals(contraseña)) {
                Menu MENU = new Menu();
                dispose();
                
                MENU.setVisible(true);
                MENU.setLocationRelativeTo(null);
            }else{
                JOptionPane.showMessageDialog(this, "DATOS INVÁLIDOS :(");
            }
        }
    }//GEN-LAST:event_jButtonLoginMouseClicked

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jTextFieldUSERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUSERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUSERActionPerformed

    private void jPasswordFieldCONTRASEÑAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldCONTRASEÑAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldCONTRASEÑAActionPerformed

    private void jLabelIngreso3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIngreso3MouseClicked
        if (this.jPanelLogin.getLocation().y==-170) {
            this.jPanelLogin.setLocation(390, 0);
        }else {
            this.jPanelLogin.setLocation(390, -170);
        }
    }//GEN-LAST:event_jLabelIngreso3MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if (this.jPanelLogin.getLocation().y==-170) {
            this.jPanelLogin.setLocation(390, 0);
        }else {
            this.jPanelLogin.setLocation(390, -170);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        try {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int resul=JOptionPane.showConfirmDialog(null, "DESEA CERRAR EL SITEMA","SALIR",dialogButton);
            if(resul==0){
                //                System.exit(0);
                primero pr = new primero();
                pr.setVisible(true);
                pr.setLocationRelativeTo(null);
                dispose();
            }
        } catch(Exception e){
            JOptionPane.showConfirmDialog(this, e);
        }
    }//GEN-LAST:event_salirMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(primero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(primero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(primero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(primero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new primero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel disminuir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelIngreso1;
    private javax.swing.JLabel jLabelIngreso2;
    private javax.swing.JLabel jLabelIngreso3;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPasswordField jPasswordFieldCONTRASEÑA;
    private javax.swing.JTextField jTextFieldUSER;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel principal;
    private javax.swing.JLabel salir;
    private javax.swing.JLabel secundario;
    // End of variables declaration//GEN-END:variables

    private void setState() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}