/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;
import Controleur.cltClient;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Timer; 
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author benndui
 */
public class GSBapplication extends javax.swing.JFrame {

    /**
     * Creates new form GSBapplication
     */
  
    public GSBapplication() throws SQLException {
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

        mainPanel = new javax.swing.JPanel();
        modifierBtn = new javax.swing.JLabel();
        modifierBtn1 = new javax.swing.JLabel();
        saisirBtn = new javax.swing.JLabel();
        deconnectedBtn = new javax.swing.JLabel();
        exitCross = new javax.swing.JLabel();
        clipboardBack = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modifierBtn.setFont(new java.awt.Font("Galvji", 1, 14)); // NOI18N
        modifierBtn.setForeground(new java.awt.Color(13, 108, 148));
        modifierBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modifierBtn.setText("Consulter");
        modifierBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consulterBtnMouseClicked(evt);
            }
        });
        mainPanel.add(modifierBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 80, -1));

        modifierBtn1.setFont(new java.awt.Font("Galvji", 1, 14)); // NOI18N
        modifierBtn1.setForeground(new java.awt.Color(255, 93, 94));
        modifierBtn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modifierBtn1.setText("Modifier");
        modifierBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifierBtn1MouseClicked(evt);
            }
        });
        mainPanel.add(modifierBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 80, 20));

        saisirBtn.setFont(new java.awt.Font("Galvji", 1, 14)); // NOI18N
        saisirBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saisirBtn.setText("Saisir");
        saisirBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saisirBtnMouseClicked(evt);
            }
        });
        mainPanel.add(saisirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 140, -1));

        deconnectedBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deconnectedBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        deconnectedBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        deconnectedBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deconnectedBtnMouseClicked(evt);
            }
        });
        mainPanel.add(deconnectedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 40, -1));

        exitCross.setBackground(new java.awt.Color(255, 255, 255));
        exitCross.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        exitCross.setForeground(new java.awt.Color(237, 125, 43));
        exitCross.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitCross.setText("X");
        exitCross.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitCrossMouseClicked(evt);
            }
        });
        mainPanel.add(exitCross, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, -1));

        clipboardBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clipboard.png"))); // NOI18N
        mainPanel.add(clipboardBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 350, 390));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gsbHome.jpg"))); // NOI18N
        mainPanel.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitCrossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitCrossMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitCrossMouseClicked

    private void modifierBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierBtn1MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            cltClient.setSource(true);
            new Choisissez().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(GSBapplication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modifierBtn1MouseClicked

    private void saisirBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saisirBtnMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.setBackground(new Color(0, 0, 0, 0));
        this.dispose();
        try {
            new SaisirScreen().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(GSBapplication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saisirBtnMouseClicked

    private void consulterBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consulterBtnMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            cltClient.setSource(false);
            new Choisissez().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(GSBapplication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_consulterBtnMouseClicked

    private void deconnectedBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deconnectedBtnMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            new Home().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(GSBapplication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deconnectedBtnMouseClicked

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
            java.util.logging.Logger.getLogger(GSBapplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GSBapplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GSBapplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GSBapplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GSBapplication().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(GSBapplication.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel clipboardBack;
    private javax.swing.JLabel deconnectedBtn;
    private javax.swing.JLabel exitCross;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel modifierBtn;
    private javax.swing.JLabel modifierBtn1;
    private javax.swing.JLabel saisirBtn;
    // End of variables declaration//GEN-END:variables
}
