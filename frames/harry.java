/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Frontpage.java
 *
 * Created on 15 Apr, 2017, 12:57:57 PM
 */

package frames;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author mridulamadhur
 */
public class harry extends javax.swing.JFrame {

    /** Creates new form Frontpage */
    public harry() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        n3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cb6 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        n2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        n1 = new javax.swing.JTextField();
        n6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        n5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cb5 = new javax.swing.JComboBox();
        n4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        c1 = new javax.swing.JCheckBox();
        c2 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JComboBox();
        c6 = new javax.swing.JCheckBox();
        c4 = new javax.swing.JCheckBox();
        c5 = new javax.swing.JCheckBox();
        c3 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        cb4 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/hp1.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 11));
        jLabel10.setText("Quantity:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));
        getContentPane().add(n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 30, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/hp5.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, 150));

        cb6.setFont(new java.awt.Font("Times New Roman", 0, 11));
        cb6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));
        cb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb6ActionPerformed(evt);
            }
        });
        getContentPane().add(cb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 80, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/hp2.JPG"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/hp4.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, 150));
        getContentPane().add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 30, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 11));
        jLabel8.setText("Quantity:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, -1));
        getContentPane().add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 30, -1));

        n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ActionPerformed(evt);
            }
        });
        getContentPane().add(n6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, 30, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 11));
        jLabel9.setText("Quantity:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/hp6.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, -1));
        getContentPane().add(n5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 30, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 11));
        jLabel13.setText("Quantity:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/hp3.jpg"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, 190));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 11));
        jLabel12.setText("Quantity:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 11));
        jLabel15.setText("Quantity:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        cb5.setFont(new java.awt.Font("Times New Roman", 0, 11));
        cb5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));
        getContentPane().add(cb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 80, 20));
        getContentPane().add(n4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 30, -1));

        jButton1.setFont(new java.awt.Font("Parry Hotter", 0, 24));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 200, -1));

        c1.setFont(new java.awt.Font("Parry Hotter", 0, 18));
        c1.setText("Espresso Purronum Mug");
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        c2.setFont(new java.awt.Font("Parry Hotter", 0, 18));
        c2.setText("Hogwarts HP Mug");
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        cb3.setFont(new java.awt.Font("Times New Roman", 0, 11));
        cb3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));
        getContentPane().add(cb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 80, 20));

        c6.setFont(new java.awt.Font("Parry Hotter", 0, 18));
        c6.setText("Harry Potter snitch");
        getContentPane().add(c6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, -1, -1));

        c4.setFont(new java.awt.Font("Parry Hotter", 0, 18));
        c4.setText("Harry Potter black Shirt");
        getContentPane().add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        c5.setFont(new java.awt.Font("Parry Hotter", 0, 18));
        c5.setText("Hogwarts background");
        getContentPane().add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, -1, -1));

        c3.setFont(new java.awt.Font("Parry Hotter", 0, 18));
        c3.setText("Harry Potter Scar shirt");
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });
        getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        jButton2.setFont(new java.awt.Font("Parry Hotter", 0, 24));
        jButton2.setText("Add to cart");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 200, -1));

        cb4.setFont(new java.awt.Font("Times New Roman", 0, 11));
        cb4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));
        getContentPane().add(cb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 80, 20));

        jLabel2.setText("Price:149");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        jLabel4.setText("Price:199");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));

        jLabel6.setText("Price:349");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        jLabel16.setText("Price:349");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, -1, -1));

        jLabel17.setText("Price:349");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, -1, -1));

        jLabel18.setText("Price:149");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  books n= new books();
        n.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 if((c1.isSelected()==false)&&(c2.isSelected()==false)&&(c3.isSelected()==false)&&(c4.isSelected()==false)&&(c5.isSelected()==false)&&(c6.isSelected()==false))
{JOptionPane.showMessageDialog(null, "PLEASE SELECT ALTEAST 1 ITEM");}


 if(c1.isSelected()==true)
{String z=n1.getText();
 if(z.equals(""))
 {JOptionPane.showMessageDialog(null, "Please enter the Quantity.");
 }
 else{
 int a=Integer.parseInt(z);
  String size="null"  ;
   String itnam=c1.getText();
   int tot=0,price=0;
   String fandom = null,procod = "DI2011";
  method1(fandom,procod,a,itnam,size,price,tot);}}




if(c2.isSelected()==true)
{String z=n2.getText();
 if(z.equals(""))
 {JOptionPane.showMessageDialog(null, "Please enter the Quantity.");
 }
 else{
 int a=Integer.parseInt(z);
  String size=(String) "null"  ;
   String itnam=c2.getText();
   int tot=0,price=0;
   String fandom = null,procod = "DI2012";
  method1(fandom,procod,a,itnam,size,price,tot);}}



if(c3.isSelected()==true)
{String z=n3.getText();
 if(z.equals(""))
 {JOptionPane.showMessageDialog(null, "Please enter the Quantity.");
 }
 else{
 int a=Integer.parseInt(z);
  String size=(String)cb3.getSelectedItem()  ;
   String itnam=c3.getText();
   int tot=0,price=0;
   String fandom = null,procod = "DI2031";
  method1(fandom,procod,a,itnam,size,price,tot);}}




   if(c4.isSelected()==true)
{String z=n4.getText();
 if(z.equals(""))
 {JOptionPane.showMessageDialog(null, "Please enter the Quantity.");
 }
 else{
 int a=Integer.parseInt(z);
  String size=(String)cb4.getSelectedItem()  ;
   String itnam=c4.getText();
   int tot=0,price=0;
   String fandom = null,procod = "DI2032";
  method1(fandom,procod,a,itnam,size,price,tot);}}



   if(c5.isSelected()==true)
{String z=n5.getText();
 if(z.equals(""))
 {JOptionPane.showMessageDialog(null, "Please enter the Quantity.");
 }
 else{
 int a=Integer.parseInt(z);
  String size=(String)cb5.getSelectedItem() ;
   String itnam=c5.getText();
   int tot=0,price=0;
   String fandom = null,procod = "DI2021";
  method1(fandom,procod,a,itnam,size,price,tot);}}




  if(c6.isSelected()==true)
{String z=n6.getText();
 if(z.equals(""))
 {JOptionPane.showMessageDialog(null, "Please enter the Quantity.");
 }
 else{
 int a=Integer.parseInt(z);
  String size=(String)cb6.getSelectedItem() ;
   String itnam=c6.getText();
   int tot=0,price=0;
   String fandom = null,procod = "DI2021";
  method1(fandom,procod,a,itnam,size,price,tot);}}



 NewJFrame n=new NewJFrame();
n.setVisible(true);

 // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb6ActionPerformed

    private void n6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n6ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new harry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c3;
    private javax.swing.JCheckBox c4;
    private javax.swing.JCheckBox c5;
    private javax.swing.JCheckBox c6;
    private javax.swing.JComboBox cb3;
    private javax.swing.JComboBox cb4;
    private javax.swing.JComboBox cb5;
    private javax.swing.JComboBox cb6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    private javax.swing.JTextField n3;
    private javax.swing.JTextField n4;
    private javax.swing.JTextField n5;
    private javax.swing.JTextField n6;
    // End of variables declaration//GEN-END:variables

}
