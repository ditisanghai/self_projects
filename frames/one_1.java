/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * one.java
 *
 * Created on 14 Apr, 2017, 10:55:36 AM
 */

package frames;

import fandom.*;

/**
 *
 * @author AKSHAYA
 */
public class one_1 extends javax.swing.JFrame {

    /** Creates new form one */
    public one_1() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ADMIN = new javax.swing.JButton();
        USER = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("THE FANDOM SHOP-LOGIN");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ADMIN.setBackground(new java.awt.Color(219, 139, 58));
        ADMIN.setFont(new java.awt.Font("AR DESTINE", 1, 36));
        ADMIN.setText("ADMIN");
        ADMIN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ADMIN.setFocusPainted(false);
        getContentPane().add(ADMIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 140, 40));

        USER.setBackground(new java.awt.Color(215, 135, 55));
        USER.setFont(new java.awt.Font("AR DESTINE", 1, 36));
        USER.setText("USER");
        USER.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        USER.setFocusPainted(false);
        USER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USERActionPerformed(evt);
            }
        });
        getContentPane().add(USER, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 140, 40));

        jButton3.setFont(new java.awt.Font("AR DARLING", 1, 56));
        jButton3.setText("LOGIN");
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/321149_1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void USERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USERActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_USERActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
USER.setVisible(true);
ADMIN.setVisible(true);
jButton3.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
USER.setVisible(false);
ADMIN.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new one().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADMIN;
    private javax.swing.JButton USER;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
