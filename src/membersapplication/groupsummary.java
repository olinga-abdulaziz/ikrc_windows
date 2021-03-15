/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membersapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Guest
 */
public class groupsummary extends javax.swing.JPanel {

    public groupsummary() {
        initComponents();
        principleamount();
        totalgroupamount();
        totalpersonalsavings();
        d();
         bankbal();
    }
    public void bankbal(){
            try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
          String query="select sum(thirty) from account";  
          String query1="select sum(amount) from groupaccount";
          String query2="select sum(seventy) from account";  
           String subs="select sum(amount) from groupwithd";   
            String query3="select sum(withdrawal) from account";  
            PreparedStatement ps=conn.prepareStatement(query);
             PreparedStatement ps3=conn.prepareStatement(query3);
            PreparedStatement ps1=conn.prepareStatement(query1);
            PreparedStatement ps2=conn.prepareStatement(query2);
            PreparedStatement psubs=conn.prepareStatement(subs);
            ResultSet rs=ps.executeQuery();
            ResultSet rs3=ps3.executeQuery();
            ResultSet rs1=ps1.executeQuery();
            ResultSet rs2=ps2.executeQuery();
            ResultSet rsubs=psubs.executeQuery();
                if (rs.next() && rs1.next() && rs2.next()&& rsubs.next() && rs3.next()) {
                    
                    int thirty=Integer.parseInt(rs.getString("sum(thirty)"));
                    int groupdep=Integer.parseInt(rs1.getString("sum(amount)"));
                    int seventy=Integer.parseInt(rs2.getString("sum(seventy)"));
                    int personalwithdrwal=Integer.parseInt(rs3.getString("sum(withdrawal)"));
                    int groupwithdrawal=Integer.parseInt(rsubs.getString("sum(amount)"));
                    int ttpersonal=seventy-personalwithdrwal;
                    int ttgroup=thirty+groupdep-groupwithdrawal;
                    int bankbalance=ttpersonal+ttgroup;
                    bankbal.setText(bankbalance+"");
                    
                }
              } catch (Exception e) {
          JOptionPane.showMessageDialog(null, e);
      }
    }
  public void principleamount()
  {
    
   
  }
  public void d(){
      tps.setVisible(true);
  }
  group myobj=new group();
  public void totalgroupamount()
  {
       try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
          String query="select sum(thirty) from account";
          String query1="select sum(amount) from groupaccount";
          String subs="select sum(amount) from groupwithd"; 
            PreparedStatement psubs=conn.prepareStatement(subs);
            PreparedStatement ps=conn.prepareStatement(query);
            PreparedStatement ps1=conn.prepareStatement(query1);
             ResultSet rsubs=psubs.executeQuery();
            ResultSet rs=ps.executeQuery();
            ResultSet rs1=ps1.executeQuery();
            if (rs1.next() && rs.next() && rsubs.next()) 
            {
                int sum1=Integer.parseInt(rs1.getString("sum(amount)"));
                int sum=Integer.parseInt(rs.getString("sum(thirty)"));
                int groupwithdrawls=Integer.parseInt(rsubs.getString("sum(amount)"));
                int rslts=sum1+sum - groupwithdrawls;
                if (rslts >= 0) {
                     gta.setText(rslts +"");
                } else {
                    JOptionPane.showMessageDialog(null, "Insufficient balance !");
                    return;
                }
               
                
                
           }
          
           } catch (Exception e) {
          JOptionPane.showMessageDialog(null, e);
      }
  }
  public void totalpersonalsavings()
  {
           try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
          String query="select sum(seventy),sum(withdrawal) from account";
            PreparedStatement ps=conn.prepareStatement(query);
            
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                int totsev=Integer.parseInt(rs.getString("sum(seventy)"));
                int totwithd=Integer.parseInt(rs.getString("sum(withdrawal)"));
                int def=totsev-totwithd;
                tps.setText(def+"");
            } else {
            }
           } catch (Exception e) {
          JOptionPane.showMessageDialog(null, e);
      }
  }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        gta = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tps = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        bankbal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GROUP TOTAL AMOUNT");

        gta.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        gta.setForeground(new java.awt.Color(255, 255, 255));
        gta.setText("0.00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(gta)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gta)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TOTAL PERSONAL SAVINGS");

        tps.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        tps.setForeground(new java.awt.Color(255, 255, 255));
        tps.setText("0.00");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tps, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tps, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bankbal.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bankbal.setForeground(new java.awt.Color(255, 255, 255));
        bankbal.setText("0.00");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BANK BALANCE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1)
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(154, 154, 154)
                    .addComponent(bankbal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(bankbal, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(48, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ALL ACCOUNTS SUMMARY");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(263, 263, 263))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       principleamount();
        totalgroupamount();
        totalpersonalsavings();
         bankbal();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bankbal;
    private javax.swing.JLabel gta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel tps;
    // End of variables declaration//GEN-END:variables
}
