/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membersapplication;

import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Guest
 */
public class withdraw extends javax.swing.JPanel {
ArrayList name=new ArrayList();
    /**
     * Creates new form withdraw
     */
    public withdraw() {
        initComponents();
        hideitems();
        loadDatatoarray();
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
    public void hideitems(){
        w1.setVisible(false);
    }
public void s2(){
           try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
         String sql="select sum(amount) from personalwithd where member=?";
         String sql2="select withdrawals from transquery where name=?";
         PreparedStatement ps2=conn.prepareStatement(sql2);
         PreparedStatement ps=conn.prepareStatement(sql);
         ps.setString(1, membername.getText());
         ps2.setString(1, membername.getText());
         ResultSet rs=ps.executeQuery();
         ResultSet rs2=ps2.executeQuery();
               if (rs.next() && rs2.next()) {
                   
                   int totwithd=Integer.parseInt(rs.getString("sum(amount)"));
                   w1.setText(totwithd +"");
                   int dtw=Integer.parseInt(rs2.getString("withdrawals"));
                   int ctotalwithd=totwithd + dtw;
                   String sql3="update transquery set withdrawals=? where name=?";
                     PreparedStatement ps3=conn.prepareStatement(sql3);
                     ps3.setInt(1, ctotalwithd);
                     ps3.setString(2, membername.getText());
                     ps3.executeUpdate();
                     String sql4="select deposits from transquery where name=?";
                     String sql5="select withdrawals from transquery where name=?";
                        String sql7="select finalbal from transquery where name=?";
                     PreparedStatement ps4=conn.prepareStatement(sql4);
                      PreparedStatement ps7=conn.prepareStatement(sql7);
                     PreparedStatement ps5=conn.prepareStatement(sql5);
                     ps4.setString(1, membername.getText());
                     ps7.setString(1, membername.getText());
                     ps5.setString(1, membername.getText());
                     ResultSet rs4=ps4.executeQuery();
                     ResultSet rs5=ps5.executeQuery();
                     ResultSet rs7=ps7.executeQuery();
                     if (rs4.next() && rs5.next() && rs7.next()) {
                         int dfbal=Integer.parseInt(rs7.getString("finalbal"));
                         int deps=Integer.parseInt(rs4.getString("deposits"));
                         int withds=Integer.parseInt(rs5.getString("withdrawals"));
                         int fbal=deps-withds;
                         if (fbal <dfbal) {
                             
                            int cfbal= deps-withds;
                             String sql6="update transquery set finalbal=? where name=?";
                             PreparedStatement ps6=conn.prepareStatement(sql6);
                             ps6.setInt(1, cfbal);
                             ps6.setString(2, membername.getText());
                             ps6.executeUpdate();
                             
                       
                         }
                         
                   }
           JOptionPane.showMessageDialog(null, "withdrawal succesfully");
            membername.setText("");
            memberphone.setText("");
            cdate.setText("");
            amount.setText("");
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

        search = new javax.swing.JTextField();
        membername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        memberphone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cdate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        btnwithdraw = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        w1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 0, 0));

        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchKeyPressed(evt);
            }
        });

        membername.setBackground(new java.awt.Color(51, 51, 51));
        membername.setForeground(new java.awt.Color(255, 255, 255));
        membername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAME");

        memberphone.setBackground(new java.awt.Color(51, 51, 51));
        memberphone.setForeground(new java.awt.Color(255, 255, 255));
        memberphone.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PHONE");

        cdate.setBackground(new java.awt.Color(51, 51, 51));
        cdate.setForeground(new java.awt.Color(255, 255, 255));
        cdate.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdateActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DATE");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("AMOUNT");

        amount.setBackground(new java.awt.Color(51, 51, 51));
        amount.setForeground(new java.awt.Color(255, 255, 255));

        btnwithdraw.setBackground(new java.awt.Color(0, 153, 255));
        btnwithdraw.setForeground(new java.awt.Color(255, 255, 255));
        btnwithdraw.setText("WITHDRAW");
        btnwithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwithdrawActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("SEARCH");

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("TIME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnsearch.setBackground(new java.awt.Color(0, 204, 51));
        btnsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnsearch.setText("search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WITHDRAW");

        w1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                w1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(w1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(w1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnwithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(72, 72, 72)
                            .addComponent(memberphone, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel9))
                            .addGap(62, 62, 62)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cdate, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel14))
                            .addGap(52, 52, 52)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnsearch))
                                .addComponent(membername, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(btnsearch))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(membername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnwithdraw)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdateActionPerformed
public void iwa()
{
      try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
    
        String sql1="insert into account values(?,?,?,?,?,?,?,null)";
        PreparedStatement ps1=conn.prepareStatement(sql1);
        int defvalue=0;
          ps1.setString(1, membername.getText());
           ps1.setString(2, memberphone.getText());
           ps1.setString(3, cdate.getText());
           ps1.setInt(4, defvalue);
           ps1.setInt(5, defvalue);
           ps1.setInt(6, defvalue);
           ps1.setInt(7, Integer.parseInt(amount.getText()));
           
               int numrows=ps1.executeUpdate();
               if (numrows >0) {
             
                   ResultSet rs=ps1.getGeneratedKeys();
                   int generatedno=-1;
                   if (rs!=null && rs.next()) {
                       generatedno=rs.getInt(1);
                   }
//             
               }
           
            } catch (Exception e) {
     
        }
}
    private void btnwithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwithdrawActionPerformed
         try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
         String sql="insert into personalwithd values(?,?,?,?,null)";
           
            
            int defvalue=0;
           PreparedStatement ps=conn.prepareStatement(sql);
          
          
           
           ps.setString(1, membername.getText());
           ps.setString(2, memberphone.getText());
           ps.setString(3, cdate.getText());
           ps.setInt(4, Integer.parseInt(amount.getText()));        
                   
                   int numrows =ps.executeUpdate();
                   iwa();
                   s2();
                   
                   
               if (numrows >0) {
             
                   ResultSet rs=ps.getGeneratedKeys();
                   int generatedno=-1;
                   if (rs!=null && rs.next()) {
                       generatedno=rs.getInt(1);
                   }
//             
               }
               
   
        } catch (Exception e) {
            
        }
         
            
    }//GEN-LAST:event_btnwithdrawActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
       
                    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
        String srch="select * from newmember where member=?";
        PreparedStatement ps=conn.prepareStatement(srch);
        ps.setString(1, search.getText());
                ResultSet rs=ps.executeQuery();
                if (rs.next()) {
                    membername.setText(rs.getString("member"));
                    memberphone.setText(rs.getString("phone"));
                    
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Sorry There is no such Member !");
                }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here
         SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy  HH:mm");
       Date date=new Date();
       cdate.setText(sdf.format(date));
               
    }//GEN-LAST:event_jButton2ActionPerformed

    private void w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_w1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_w1ActionPerformed

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
    private javax.swing.JTextField amount;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnwithdraw;
    private javax.swing.JTextField cdate;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField membername;
    private javax.swing.JTextField memberphone;
    private javax.swing.JTextField search;
    private javax.swing.JTextField w1;
    // End of variables declaration//GEN-END:variables
}
