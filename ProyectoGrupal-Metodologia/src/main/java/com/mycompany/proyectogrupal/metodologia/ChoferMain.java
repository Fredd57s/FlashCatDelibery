/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectogrupal.metodologia;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import Clases.RegistroPaquete;

/**
 *
 * @author USER
 */
public class ChoferMain extends javax.swing.JFrame {
private ImageIcon backgroundImage;
RegistroPaquete rp=new RegistroPaquete();
    /**
     * Creates new form ChoferMain
     */
    public ChoferMain() {
        this.setExtendedState(ChoferMain.MAXIMIZED_BOTH); // Maximizar
        setLayout(new BorderLayout());
        backgroundImage = new ImageIcon(getClass().getClassLoader().getResource("imagenes/Fondo1.png"));
        
        
        //Panel1.setBounds(50, 50, 300, 200);
        initComponents();
        CuadroCode.setVisible(false);
        RoundedPanelUI roundedPanelUI = new RoundedPanelUI(15);
        Panel1.setUI(roundedPanelUI);
        Panel1.setOpaque(false);  // Para asegurar que el fondo sea transparente y no cubra los bordes redondeados
        Panel1.setBackground(new java.awt.Color(51, 51, 51));  // Asegura el color de fondo
        
        Panel1.revalidate();
        Panel1.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        CuadroCode = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        CodeC = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NameD = new javax.swing.JTextField();
        ID_D = new javax.swing.JTextField();
        DirectionD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescriptionP = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        Dimentions = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Weight = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        Tarifa = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        CellD = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        NameR = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        DirectionR = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        CellR = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ID_R = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1366, 768));

        jPanel2.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel2.setPreferredSize(new java.awt.Dimension(1336, 768));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Rastreo de Envíos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 194, 190, 71));

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Seguridad del paquete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 271, 190, 71));

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Envío de Paquetes");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 117, 190, 71));
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 80, 50));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 770));

        Panel1.setBackground(new java.awt.Color(51, 51, 51));
        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Envío de paquetes");
        Panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CuadroCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CuadroCode.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setText("Código:");
        CuadroCode.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 27, -1, -1));

        CodeC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodeCActionPerformed(evt);
            }
        });
        CuadroCode.add(CodeC, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 61, 108, -1));

        jButton8.setText("Cerrar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        CuadroCode.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 101, -1, -1));

        jPanel5.add(CuadroCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 310, 160));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel4.setText("Nombre:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel5.setText("Cédula:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel6.setText("Teléfono:");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, -1, -1));

        NameD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameDActionPerformed(evt);
            }
        });
        jPanel5.add(NameD, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 360, 32));
        jPanel5.add(ID_D, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 350, 32));
        jPanel5.add(DirectionD, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 360, 32));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setText("Remitente");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel7.setText("Descripción del paquete:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        DescriptionP.setColumns(20);
        DescriptionP.setRows(5);
        jScrollPane1.setViewportView(DescriptionP);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 410, 100));

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel8.setText("Peso:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, -1, -1));
        jPanel5.add(Dimentions, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 220, 32));

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel9.setText("Dimensiones:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, -1));
        jPanel5.add(Weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, 170, 32));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel3.setText("Paquete");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jButton4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton4.setText("Calcular Tarifa");
        jButton4.setBorder(null);
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 170, 30));

        Tarifa.setText("2");
        Tarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TarifaActionPerformed(evt);
            }
        });
        jPanel5.add(Tarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 90, 30));

        jButton6.setText("?");
        jPanel5.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 490, -1, -1));

        jLabel10.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel10.setText("Dirección:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));
        jPanel5.add(CellD, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 350, 32));

        jLabel11.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel11.setText("Nombre:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        NameR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameRActionPerformed(evt);
            }
        });
        jPanel5.add(NameR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 360, 32));

        jLabel12.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel12.setText("Dirección:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        jPanel5.add(DirectionR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 360, 32));

        jLabel13.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel13.setText("Teléfono:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));
        jPanel5.add(CellR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 350, 32));

        jLabel14.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel14.setText("Destinatario");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        jLabel15.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel15.setText("Cédula:");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));
        jPanel5.add(ID_R, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 350, 32));

        jButton7.setText("Pagar Tarifa y registrar paquete");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, -1, -1));

        Panel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 940, 590));

        jPanel2.add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 1060, 690));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo1 (1).png"))); // NOI18N
        jPanel2.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void NameDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameDActionPerformed

    private void TarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TarifaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TarifaActionPerformed

    private void NameRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameRActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        rp.RegisterPack(NameR, DirectionR, CellR, ID_R, NameD, DirectionD, CellD, ID_D, DescriptionP, Dimentions, Weight, Tarifa,CodeC);
        CuadroCode.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void CodeCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodeCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodeCActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        CuadroCode.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(ChoferMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChoferMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChoferMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChoferMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChoferMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CellD;
    private javax.swing.JTextField CellR;
    private javax.swing.JTextField CodeC;
    private javax.swing.JPanel CuadroCode;
    private javax.swing.JTextArea DescriptionP;
    private javax.swing.JTextField Dimentions;
    private javax.swing.JTextField DirectionD;
    private javax.swing.JTextField DirectionR;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField ID_D;
    private javax.swing.JTextField ID_R;
    private javax.swing.JTextField NameD;
    private javax.swing.JTextField NameR;
    private javax.swing.JPanel Panel1;
    private javax.swing.JTextField Tarifa;
    private javax.swing.JTextField Weight;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}