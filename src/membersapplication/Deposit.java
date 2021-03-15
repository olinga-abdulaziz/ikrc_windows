/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membersapplication;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.util.*;
import java.sql.Connection;
import java.util.Calendar;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author Guest
 */
public class Deposit extends javax.swing.JPanel {

    ArrayList name=new ArrayList();
   
    public Deposit() {
        initComponents();
        hideitems();
        loadDatatoarray();
    }
    public void hideitems()
    {
        b1.setVisible(false);
        b2.setVisible(false);
    }
    
    private void loadDatatoarray(){
        
        try {
               Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
                String sql="select * from account";
                PreparedStatement ps=conn.prepareStatement(sql);
                ResultSet rs=ps.executeQuery();
                while (rs.next()) {                
                String nama=rs.getString("member");
                name.add(nama);
            }
                rs.close();
                ps.close();
                conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    public void autoComplete(String txt){
        String complete="";
        int start=txt.length();
        int last=txt.length();
        int a;
        for  (a=0;a<name.size();a++){
            if (name.get(a).toString().startsWith(txt)) {
                complete=name.get(a).toString();
                last=complete.length();
                break;
                
            }
        }if(last>start){
            search.setText(complete);
            search.setCaretPosition(last);
            search.moveCaretPosition(start);
        }
    }

public void addDepToWithd(){
         try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
        String sql1="select sum(amount) from personalwithd where member=?";
        String sql="select sum(seventy) from account where member=?";
        PreparedStatement ps=conn.prepareStatement(sql);
        PreparedStatement ps1=conn.prepareStatement(sql1);
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
}
public void exebal(){
             try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
        
         String slw="select withdrawals from transquery where name=?";
        String slw1="select deposits from transquery where name=?";
        PreparedStatement psw=conn.prepareStatement(slw);
        PreparedStatement psw1=conn.prepareStatement(slw1);
        psw1.setString(1, member.getText()); 
        psw.setString(1, member.getText());
        ResultSet rsw=psw.executeQuery();
                ResultSet rsw1=psw1.executeQuery();

               if (rsw.next() && rsw1.next()) {
                   int w=Integer.parseInt(rsw.getString("withdrawals"));
                   int d=Integer.parseInt(rsw1 .getString("deposits"));
                   int f=d-w;
                  String uf="update transquery set finalbal=? where name=?";
                   PreparedStatement pstmt=conn.prepareStatement(uf);
                   pstmt.setInt(1, f);
                   pstmt.setString(2, member.getText());
                   pstmt.executeUpdate();
               }
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
}
public void s1(){
           try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
        String srch="update transquery set deposits=? where name=?";
        String sql="select sum(seventy) from account where member=?";
        
        PreparedStatement ps1=conn.prepareStatement(sql);
        
        ps1.setString(1, member.getText());
 
        ResultSet rs=ps1.executeQuery();
   
        
                        if (rs.next()) {
                            b1.setText(rs.getString("sum(seventy)"));
                           

                        }
        PreparedStatement ps=conn.prepareStatement(srch);
        ps.setInt(1, Integer.parseInt(b1.getText()));
       
         ps.setString(2, member.getText());
         ps.executeUpdate();
         exebal();
           JOptionPane.showMessageDialog(null, "Deposit Succefully");
           
           
//           
           member.setText("");
           phone.setText("");
           cdate.setText("");
           amount.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

}
public void selectDeposits(){
          try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
         String sql="select sum(seventy) from account where member=?";
         
           PreparedStatement ps=conn.prepareStatement(sql);
           ps.setString(1, member.getText());
              ResultSet rs=ps.executeQuery();
              if (rs.next()) {
                  
                  b1.setText(rs.getString("sum(amount)"));
                  JOptionPane.showMessageDialog(null, "pass successsfully");
                  
//                           String sql1="update transquery set deposit=?  where name=?";
//                            PreparedStatement ps1=conn.prepareStatement(sql1);
//                            ps1.setInt(1, Integer.parseInt(b1.getText()));
//                            ps.setString(2, name.getText());
//                            ps1.executeUpdate();
//                            JOptionPane.showMessageDialog(null, "succesfully");
//                            
                   
              }
           
           
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        member = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        cdate = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        b1 = new javax.swing.JTextField();
        b2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DEPOSIT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(599, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 60));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAME");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PHONE");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DATE");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("AMOUNT");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        member.setBackground(new java.awt.Color(51, 51, 51));
        member.setForeground(new java.awt.Color(255, 255, 255));
        member.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(member, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 372, -1));

        phone.setBackground(new java.awt.Color(51, 51, 51));
        phone.setForeground(new java.awt.Color(255, 255, 255));
        phone.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 372, -1));

        cdate.setBackground(new java.awt.Color(51, 51, 51));
        cdate.setForeground(new java.awt.Color(255, 255, 255));
        cdate.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(cdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 372, -1));

        amount.setBackground(new java.awt.Color(51, 51, 51));
        amount.setForeground(new java.awt.Color(255, 255, 255));
        amount.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 372, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("DEPOSIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 150, 40));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SEARCH");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 320, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/search.png"))); // NOI18N
        jLabel8.setText("search");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 80, -1));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("TIME");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 80, -1));

        b1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 120, 70));
        add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 120, 60));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 740, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
         String sql="insert into account values(?,?,?,?,?,?,?,null)";
           PreparedStatement ps=conn.prepareStatement(sql);
           ps.setString(1, member.getText());
           ps.setString(2, phone.getText());
           ps.setString(3, cdate.getText());
           ps.setInt(4, Integer.parseInt(amount.getText()));
           double seventy= 0.7;
           double thirty=0.3;
           int defvalue=0;
           ps.setDouble(5, Double.parseDouble(amount.getText())*seventy);
           ps.setDouble(6, Double.parseDouble(amount.getText())*thirty);
           ps.setInt(7, defvalue);
           
           
                   int numrows =ps.executeUpdate();
                    s1();
               if (numrows >0) {
             
                   ResultSet rs=ps.getGeneratedKeys();
                   int generatedno=-1;
                   if (rs!=null && rs.next()) {
                       generatedno=rs.getInt(1);
                   }
//             
               }
//        
        } catch (Exception e) {
           
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
            try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
        String srch="select * from newmember where member=?";
        PreparedStatement ps=conn.prepareStatement(srch);
        ps.setString(1, search.getText());
                ResultSet rs=ps.executeQuery();
                if (rs.next()) {
                    member.setText(rs.getString("member"));
                    phone.setText(rs.getString("phone"));
           
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Sorry There is no such Member !");
                }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
            
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy  HH:mm");
       Date date=new Date();
       cdate.setText(sdf.format(date));
               
    }//GEN-LAST:event_jButton3ActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
    try {
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchKeyReleased

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed
        // TODO add your handling code here:
        switch (evt.getKeyCode()){
            case KeyEvent.VK_BACK_SPACE:
                break;
            case KeyEvent.VK_ENTER:
            search.setText(search.getText());
            break;
            default:
                EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
              //To change body of generated methods, choose Tools | Templates.
              String txt=search.getText();
              autoComplete(txt);
            }
        });
                
            
        }
    }//GEN-LAST:event_searchKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField amount;
    private javax.swing.JTextField b1;
    private javax.swing.JTextField b2;
    public javax.swing.JTextField cdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextField member;
    public javax.swing.JTextField phone;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
