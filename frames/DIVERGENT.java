/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DIVERGENT.java
 *
 * Created on 19 Apr, 2017, 3:15:40 PM
 */

package frames;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author AKSHAYA
 */
public class DIVERGENT extends javax.swing.JFrame {

    /** Creates new form DIVERGENT */
    public DIVERGENT() {
        initComponents();
    }



     public void method1(String fandom,String h,int q,String g,String size,int price,int tot)
    { int f=0;
      try{
   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ipproject","root","diti");
Statement stmt=conn.createStatement();
 String qwe="select item,size from cart ;";
 ResultSet rs=stmt.executeQuery(qwe);
 while(rs.next()){
 String hey=rs.getString("item");
 String siz=rs.getString("size");
if((g.equals(hey))&&(size.equals(siz)))
f++;}}
 catch(Exception e)
 {}
      if(f!=0)
          {try
 {
Connection cw=DriverManager.getConnection("jdbc:mysql://localhost:3306/ipproject","root","diti");
Statement set=cw.createStatement();
        String qw="update cart set quantity=quantity+"+q+" where item_no=\""+h+"\";";
         String qwer="update cart set total=rate*quantity;";
        set.executeUpdate(qw);
        set.executeUpdate(qwer);
 JOptionPane.showMessageDialog(null,"Quantity sucessfully changed");
 }
catch(Exception e){JOptionPane.showMessageDialog(null, "Technical Errors");}
}
else{
     try
 {
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ipproject","root","diti");
Statement stm=con.createStatement();
 String qwe="select * from products where product_code=\""+h+"\";";
 ResultSet rd=stm.executeQuery(qwe);
 while(rd.next()){
 fandom=rd.getString("fandoms");
price=rd.getInt("price");
 h=rd.getString("product_Code");
 tot=price*q;}
 }
catch(Exception e){JOptionPane.showMessageDialog(null,"error in connectivity");}
try{
    Connection cone=DriverManager.getConnection("jdbc:mysql://localhost:3306/ipproject","root","diti");
  Statement stamt=cone.createStatement();
String qwer="insert into cart values(\""+fandom+"\",\""+h+"\",\""+g+"\","+q+",\""+size+"\","+price+","+tot+");";
stamt.executeUpdate(qwer);
JOptionPane.showMessageDialog(null, "Your Item has been Successfully Added to Your Cart.");
}
catch(Exception e)
{JOptionPane.showMessageDialog(null,"Error in connectivity");}}}

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
        q1 = new javax.swing.JTextField();
        cb1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        c2 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        q2 = new javax.swing.JTextField();
        cb2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        c3 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        q3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        c4 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        q4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        c5 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        q5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/di1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, 220));

        c1.setFont(new java.awt.Font("DIVERGENT", 1, 14));
        c1.setText("RAVEN T-SHIRT");
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel2.setText("QUANTITY");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));
        getContentPane().add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 30, -1));

        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/di2.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 190, 220));

        c2.setFont(new java.awt.Font("DIVERGENT", 1, 14));
        c2.setText("FOUR & SIX T-SHIRT");
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        jLabel4.setText("QUANTITY");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));
        getContentPane().add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 30, -1));

        cb2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));
        getContentPane().add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/di3.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 190, 220));

        c3.setFont(new java.awt.Font("DIVERGENT", 1, 14));
        c3.setText("DAUNTLESS PENDANT");
        getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));

        jLabel6.setText("QUANTITY");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, -1, -1));
        getContentPane().add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 30, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/di4.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 200, 220));

        c4.setFont(new java.awt.Font("DIVERGENT", 1, 14));
        c4.setText("DIVERGENT BRACELETS");
        getContentPane().add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, -1, -1));

        jLabel8.setText("QUANTITY");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, -1));
        getContentPane().add(q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, 30, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/di5.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 190, 240));

        c5.setFont(new java.awt.Font("DIVERGENT", 1, 14));
        c5.setText("TOBIAS EATON POSTER");
        getContentPane().add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, -1, -1));

        jLabel10.setText("QUANTITY");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 620, -1, -1));
        getContentPane().add(q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 620, 30, -1));

        jButton1.setFont(new java.awt.Font("DIVERGENT", 1, 24));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, -1, -1));

        jLabel11.setText("PRICE:599");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        jLabel12.setText("PRICE:499");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, -1));

        jLabel13.setText("PRICE:499");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 640, -1, -1));

        jLabel14.setText("PRICE:599");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel15.setText("PRICE:899");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, -1, -1));

        jButton2.setFont(new java.awt.Font("DIVERGENT", 1, 24));
        jButton2.setText("ADD TO CART");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if((c1.isSelected()==false)&&(c2.isSelected()==false)&&(c3.isSelected()==false)&&(c4.isSelected()==false)&&(c5.isSelected()==false))
{JOptionPane.showMessageDialog(null, "PLEASE SELECT ALTEAST 1 ITEM");}


 if(c1.isSelected()==true)
{String z=q1.getText();
 if(z.equals(""))
 {JOptionPane.showMessageDialog(null, "Please enter the Quantity.");
 }
 else{
 int a=Integer.parseInt(z);
  String size=(String) cb1.getSelectedItem()  ;
   String itnam=c1.getText();
   int tot=0,price=0;
   String fandom = null,procod = "DI2011";
  method1(fandom,procod,a,itnam,size,price,tot);}}




if(c2.isSelected()==true)
{String z=q2.getText();
 if(z.equals(""))
 {JOptionPane.showMessageDialog(null, "Please enter the Quantity.");
 }
 else{
 int a=Integer.parseInt(z);
  String size=(String) cb2.getSelectedItem()  ;
   String itnam=c2.getText();
   int tot=0,price=0;
   String fandom = null,procod = "DI2012";
  method1(fandom,procod,a,itnam,size,price,tot);}}



if(c3.isSelected()==true)
{String z=q3.getText();
 if(z.equals(""))
 {JOptionPane.showMessageDialog(null, "Please enter the Quantity.");
 }
 else{
 int a=Integer.parseInt(z);
  String size="null"  ;
   String itnam=c3.getText();
   int tot=0,price=0;
   String fandom = null,procod = "DI2031";
  method1(fandom,procod,a,itnam,size,price,tot);}}




   if(c4.isSelected()==true)
{String z=q4.getText();
 if(z.equals(""))
 {JOptionPane.showMessageDialog(null, "Please enter the Quantity.");
 }
 else{
 int a=Integer.parseInt(z);
  String size="null"  ;
   String itnam=c4.getText();
   int tot=0,price=0;
   String fandom = null,procod = "DI2032";
  method1(fandom,procod,a,itnam,size,price,tot);}}



   if(c5.isSelected()==true)
{String z=q5.getText();
 if(z.equals(""))
 {JOptionPane.showMessageDialog(null, "Please enter the Quantity.");
 }
 else{
 int a=Integer.parseInt(z);
  String size="null";
   String itnam=c5.getText();
   int tot=0,price=0;
   String fandom = null,procod = "DI2021";
  method1(fandom,procod,a,itnam,size,price,tot);}}


NewJFrame n=new NewJFrame();
n.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
books n=new books();
n.setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DIVERGENT().setVisible(true);
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
