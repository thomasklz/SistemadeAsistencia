/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.INICIO;

import interfaz.registroSemestre;
import interfaz.registroDocente;
import interfaz.registroEstudiante;
import interfaz.registroMateria;

/**
 *
 * @author PRINCIPAL
 */
public class segundo extends javax.swing.JFrame {

    /**
     * Creates new form segundo
     */
    public segundo() {
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

        jPanelBackground = new javax.swing.JPanel();
        jButtonRsemestre = new javax.swing.JButton();
        jButtonRdocente = new javax.swing.JButton();
        jButtonRestudiante = new javax.swing.JButton();
        jButtonRmateria = new javax.swing.JButton();
        jButtonAsistencia = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBackground.setOpaque(false);
        jPanelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonRsemestre.setText("Registrar Semestre");
        jButtonRsemestre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRsemestreMouseClicked(evt);
            }
        });
        jButtonRsemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRsemestreActionPerformed(evt);
            }
        });
        jPanelBackground.add(jButtonRsemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jButtonRdocente.setText("Registrar Docente");
        jButtonRdocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRdocenteMouseClicked(evt);
            }
        });
        jButtonRdocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRdocenteActionPerformed(evt);
            }
        });
        jPanelBackground.add(jButtonRdocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        jButtonRestudiante.setText("Registrar Estudiante");
        jButtonRestudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRestudianteMouseClicked(evt);
            }
        });
        jButtonRestudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestudianteActionPerformed(evt);
            }
        });
        jPanelBackground.add(jButtonRestudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        jButtonRmateria.setText("Registrar Materia");
        jButtonRmateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRmateriaMouseClicked(evt);
            }
        });
        jButtonRmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRmateriaActionPerformed(evt);
            }
        });
        jPanelBackground.add(jButtonRmateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        jButtonAsistencia.setText("Asistencia");
        jButtonAsistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAsistenciaMouseClicked(evt);
            }
        });
        jPanelBackground.add(jButtonAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, -1, -1));

        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SISTEMA DE CONTROL DE ASSITENCIA (7).png"))); // NOI18N
        jPanelBackground.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        getContentPane().add(jPanelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRsemestreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRsemestreMouseClicked
        registroSemestre rs = new registroSemestre();
        rs.setVisible(true);
        rs.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonRsemestreMouseClicked

    private void jButtonRdocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRdocenteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRdocenteMouseClicked

    private void jButtonRdocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRdocenteActionPerformed
        registroDocente rd = new registroDocente();
        rd.setVisible(true);
        rd.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonRdocenteActionPerformed

    private void jButtonRestudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRestudianteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRestudianteMouseClicked

    private void jButtonRestudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestudianteActionPerformed
         registroEstudiante re = new registroEstudiante();
         re.setVisible(rootPaneCheckingEnabled);
         re.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonRestudianteActionPerformed

    private void jButtonRmateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRmateriaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRmateriaMouseClicked

    private void jButtonRmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRmateriaActionPerformed
        registroMateria rm = new registroMateria();
        rm.setVisible(true);
        rm.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonRmateriaActionPerformed

    private void jButtonAsistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAsistenciaMouseClicked
         Asistencia as = new Asistencia();
         as.setVisible(true);
         as.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonAsistenciaMouseClicked

    private void jButtonRsemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRsemestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRsemestreActionPerformed

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
            java.util.logging.Logger.getLogger(segundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(segundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(segundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(segundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new segundo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAsistencia;
    private javax.swing.JButton jButtonRdocente;
    private javax.swing.JButton jButtonRestudiante;
    private javax.swing.JButton jButtonRmateria;
    private javax.swing.JButton jButtonRsemestre;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JLabel label1;
    // End of variables declaration//GEN-END:variables
}
