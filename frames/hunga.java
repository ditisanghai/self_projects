/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * hungergames.java
 *
 * Created on 19 Apr, 2017, 10:21:16 AM
 */

package frames;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author AKSHAYA
 */
public class hunga extends javax.swing.JFrame {

    /** Creates new form hungergames */
    public hunga() {
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

        jLabel1 = new javax.swing.JLabel();
        c1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        q5 = new javax.swing.JTextField();
        cb3 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        c2 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        q2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        c3 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        q3 = new javax.swing.JTextField();
        cb2 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        c4 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        q1 = new javax.swing.JTextField();
        cb1 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        c5 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        q4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 50, 0, 0));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/hg1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        c1.setFont(new java.awt.Font("Hunger Games", 0, 18)); // NOI18N
        c1.setText("CINNA T-SHIRT");
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel2.setText("QUANTITY");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));
        getContentPane().add(q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 600, 40, -1));

        cb3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));
        getContentPane().add(cb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/hg2.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 210, 240));

        c2.setFont(new java.awt.Font("Hunger Games", 0, 18));
        c2.setText("SALUTE SHIRT");
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        jLabel4.setText("QUANTITY");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));
        getContentPane().add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 40, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/hg3.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 210, 240));

        c3.setFont(new java.awt.Font("Hunger Games", 0, 18));
        c3.setText("HG TRAINING SUIT");
        getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        jLabel6.setText("QUANTITY");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, -1));
        getContentPane().add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 40, -1));

        cb2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));
        getContentPane().add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/hg4.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 200, 220));

        c4.setFont(new java.awt.Font("Hunger Games", 0, 18));
        c4.setText("MOCKINGJAY PIN");
        getContentPane().add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        jLabel8.setText("QUANTITY");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, -1, -1));
        getContentPane().add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 40, -1));

        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/hg5.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 200, 220));

        c5.setFont(new java.awt.Font("Hunger Games", 0, 18));
        c5.setText("HUNGER GAMES MUG");
        getContentPane().add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, -1, -1));

        jLabel10.setText("QUANTITY");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, -1, -1));
        getContentPane().add(q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, 40, -1));

        jButton1.setFont(new java.awt.Font("Hunger Games", 0, 24));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, -1, 50));

        jLabel11.setText("PRICE :299");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 620, -1, -1));

        jLabel12.setText("PRICE :399");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel13.setText("PRICE :249");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));

        jLabel14.setText("PRICE :249");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, -1));

        jLabel15.setText("PRICE :99");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, -1, -1));

        jButton2.setFont(new java.awt.Font("Hunger Games", 0, 24));
        jButton2.setText("ADD TO CART");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 403, -1, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_c1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hunger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c3;
    private javax.swing.JCheckBox c4;
    private javax.swing.JCheckBox c5;
    private javax.swing.JComboBox cb1;
    private javax.swing.JComboBox cb2;
    private javax.swing.JComboBox cb3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q3;
    private javax.swing.JTextField q4;
    private javax.swing.JTextField q5;
    // End of variables declaration//GEN-END:variables

}
