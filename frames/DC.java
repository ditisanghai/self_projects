/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DC.java
 *
 * Created on 19 Apr, 2017, 1:57:05 PM
 */

package frames;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author AKSHAYA
 */
public class DC extends javax.swing.JFrame {

    /** Creates new form DC */
    public DC() {
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
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/d1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 220));

        c1.setFont(new java.awt.Font("Super Webcomic Bros.", 1, 18));
        c1.setText("BATMAN T-SHIRT");
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel2.setText("QUANTITY");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));
        getContentPane().add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 30, -1));

        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/d2.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 200, 220));

        c2.setFont(new java.awt.Font("Super Webcomic Bros.", 1, 18));
        c2.setText("SUPERRMAN v/s BATMAN");
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        jLabel4.setText("QUANTITY");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));
        getContentPane().add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 30, -1));

        cb2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));
        getContentPane().add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/d3.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 200, 220));

        c3.setFont(new java.awt.Font("Super Webcomic Bros.", 1, 18));
        c3.setText("SUPERRMAN bag");
        getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, -1));

        jLabel6.setText("QUANTITY");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));
        getContentPane().add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 30, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/d4.jpeg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 210, -1));

        c4.setFont(new java.awt.Font("Super Webcomic Bros.", 1, 18));
        c4.setText("SUPERRMAN bag");
        getContentPane().add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        jLabel8.setText("QUANTITY");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, -1, -1));
        getContentPane().add(q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, 30, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/d5_1.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 180, -1));

        c5.setFont(new java.awt.Font("Super Webcomic Bros.", 1, 18));
        c5.setText("superman batman keychain");
        getContentPane().add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, -1, -1));

        jLabel10.setText("QUANTITY");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 590, -1, -1));
        getContentPane().add(q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 590, 30, -1));

        jButton1.setFont(new java.awt.Font("Super Webcomic Bros.", 1, 24));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 190, -1));

        jLabel14.setText("Price: Rs.99");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 610, 80, -1));

        jLabel15.setText("Price: Rs.349");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel16.setText("Price: Rs.349");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 80, -1));

        jLabel17.setText("Price: Rs.499");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 80, -1));

        jLabel18.setText("Price: Rs.449");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 80, -1));

        jButton2.setFont(new java.awt.Font("Super Webcomic Bros.", 1, 24));
        jButton2.setText("ADD TO  CART");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, -1, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
movies n=new movies();
n.setVisible(true);
dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    @SuppressWarnings("empty-statement")
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
   String fandom = null,procod = "DC911";
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
   String fandom = null,procod = "DC912";
  method1(fandom,procod,a,itnam,size,price,tot);}}



if(c3.isSelected()==true)
{String z=q3.getText();
 if(z.equals(""))
 {JOptionPane.showMessageDialog(null, "Please enter the Quantity.");
 }
 else{
 int a=Integer.parseInt(z);
  String size="null" ;
   String itnam=c3.getText();
   int tot=0,price=0;
   String fandom = null,procod = "DC931";
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
   String fandom = null,procod = "DC932";
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
   String fandom = null,procod = "DC921";
  method1(fandom,procod,a,itnam,size,price,tot);}}


NewJFrame n=new NewJFrame();
n.setVisible(true);



    }//GEN-LAST:event_jButton2ActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DC().setVisible(true);
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
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q3;
    private javax.swing.JTextField q4;
    private javax.swing.JTextField q5;
    // End of variables declaration//GEN-END:variables

}
