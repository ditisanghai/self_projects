/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * books.java
 *
 * Created on 14 Apr, 2017, 3:42:25 PM
 */

package frames;

import javax.swing.ImageIcon;

/**
 *
 * @author AKSHAYA
 */
public class books extends javax.swing.JFrame {

    /** Creates new form books */
    public books() {
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
        jLabel2 = new javax.swing.JLabel();
        hp = new javax.swing.JLabel();
        hg = new javax.swing.JLabel();
        pj = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        l = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        E = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, -1, -1));

        jLabel2.setFont(new java.awt.Font("Waltograph", 0, 65));
        jLabel2.setText("BOOKS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, -20, 210, 100));

        hp.setFont(new java.awt.Font("Parry Hotter", 1, 36));
        hp.setText("Harry Potter");
        hp.setToolTipText("DOUBLE CLICK TO SEE THE MERCHANDISE");
        hp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hpMouseEntered(evt);
            }
        });
        getContentPane().add(hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        hg.setFont(new java.awt.Font("Hunger Games", 0, 24));
        hg.setText("The Hunger Games");
        hg.setToolTipText("THE HUNGER GAMES");
        hg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hgMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hgMouseEntered(evt);
            }
        });
        getContentPane().add(hg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 30));

        pj.setFont(new java.awt.Font("Windlass", 1, 24));
        pj.setText("Percy Jackson");
        pj.setToolTipText("PERCY JACKSON");
        pj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pjMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pjMouseEntered(evt);
            }
        });
        getContentPane().add(pj, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 30));

        d.setFont(new java.awt.Font("DIVERGENT", 1, 24));
        d.setText("Divergent");
        d.setToolTipText("DIVERGENT");
        d.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dMouseEntered(evt);
            }
        });
        getContentPane().add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        l.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lMouseClicked(evt);
            }
        });
        getContentPane().add(l, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 270, 350));

        t.setFont(new java.awt.Font("Twilight", 1, 36));
        t.setText("Twilight");
        t.setToolTipText("Twilight");
        t.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tMouseEntered(evt);
            }
        });
        getContentPane().add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        E.setFont(new java.awt.Font("Inheritance Font", 1, 36));
        E.setText("ERAGON");
        E.setToolTipText("Eragon");
        E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EMouseEntered(evt);
            }
        });
        getContentPane().add(E, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jButton1.setFont(new java.awt.Font("AR BONNIE", 1, 36)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 200, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lMouseClicked

}//GEN-LAST:event_lMouseClicked

    private void hpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hpMouseClicked
 harry n=new harry();
     n.setVisible(true);
     dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_hpMouseClicked

    private void hgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hgMouseClicked

        hunger n=new hunger();
     n.setVisible(true);
     dispose(); 
    }//GEN-LAST:event_hgMouseClicked

    private void pjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pjMouseClicked
     percy n=new percy();
     n.setVisible(true);
     dispose();     // TODO add your handling code here:
    }//GEN-LAST:event_pjMouseClicked

    private void dMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dMouseClicked
  DIVERGENT n=new DIVERGENT();
     n.setVisible(true);
     dispose();
    }//GEN-LAST:event_dMouseClicked

    private void tMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMouseClicked
 twilight n=new twilight();
     n.setVisible(true);
     dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_tMouseClicked

    private void EMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMouseClicked
   eragon n=new eragon();
     n.setVisible(true);
     dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_EMouseClicked

    private void hpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hpMouseEntered
  l.setIcon(new ImageIcon("C:\\Users\\MockingJay\\Desktop\\images.jpg"));      // TODO add your handling code here:
    }//GEN-LAST:event_hpMouseEntered

    private void hgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hgMouseEntered
   l.setIcon(new ImageIcon("C:\\Users\\MockingJay\\Desktop\\hg.jpg"));      // TODO add your handling code here:
    }//GEN-LAST:event_hgMouseEntered

    private void pjMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pjMouseEntered
     l.setIcon(new ImageIcon("C:\\Users\\MockingJay\\Desktop\\pj.jpg"));     // TODO add your handling code here:
    }//GEN-LAST:event_pjMouseEntered

    private void dMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dMouseEntered
       l.setIcon(new ImageIcon("C:\\Users\\MockingJay\\Desktop\\d.jpg"));  // TODO add your handling code here:
    }//GEN-LAST:event_dMouseEntered

    private void tMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMouseEntered
    l.setIcon(new ImageIcon("C:\\Users\\MockingJay\\Desktop\\twilight.jpg"));    // TODO add your handling code here:
    }//GEN-LAST:event_tMouseEntered

    private void EMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMouseEntered
   l.setIcon(new ImageIcon("C:\\Users\\MockingJay\\Desktop\\e.jpg"));     // TODO add your handling code here:
    }//GEN-LAST:event_EMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
species n=new species();
n.setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel E;
    private javax.swing.JLabel d;
    private javax.swing.JLabel hg;
    private javax.swing.JLabel hp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel l;
    private javax.swing.JLabel pj;
    private javax.swing.JLabel t;
    // End of variables declaration//GEN-END:variables

}
