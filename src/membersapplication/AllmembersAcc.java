/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membersapplication;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

import net.proteanit.sql.DbUtils;

/**
 *
 * @author Guest
 */
public class AllmembersAcc extends javax.swing.JPanel {
 
 
 
    DefaultListModel acclist =new DefaultListModel();
    
    public AllmembersAcc() {
        initComponents();
        hiddenitems();
        accountlist();
        
     
     
    }
public void totalpbal()
{
      try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
          String query="select totalpbal from balquery where member=?";
          PreparedStatement ps=conn.prepareStatement(query);
          ps.setString(1, name.getText());
          ResultSet rs=ps.executeQuery();
          if (rs.next()) {
              String sum1=rs.getString("totalpbal"); 
              TS.setText(sum1);
          }
          
            } catch (Exception e) {
          JOptionPane.showMessageDialog(null, e);
      }
}
  public void accountlist()
  {
      try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
          String query="select * from newmember";
          PreparedStatement ps=conn.prepareStatement(query);
          ps.executeQuery();
          ResultSet rs=ps.executeQuery();
          while (rs.next()) {              
              acclist.addElement(rs.getString("member"));
          }
          accountlist.setModel(acclist);
          rs.close();
          conn.close();
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null, e);
      }
  }
    public void hiddenitems()
    {
        name.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nametxt = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rootP = new javax.swing.JPanel();
        phonetxt = new javax.swing.JLabel();
        idtxt = new javax.swing.JLabel();
        addresstxt = new javax.swing.JLabel();
        gendertxt = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        agetxt = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        statustxt = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        TS = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        TT = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        totalamount = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ptxn = new javax.swing.JTable();
        phonet = new javax.swing.JLabel();
        aget = new javax.swing.JLabel();
        gendert = new javax.swing.JLabel();
        addresst = new javax.swing.JLabel();
        statust = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namet = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        accountlist = new javax.swing.JList<>();
        search = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Public\\Videos\\MyTools\\icons\\users.png")); // NOI18N
        jLabel1.setText("ACCOUNTS");

        nametxt.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        nametxt.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(nametxt))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(441, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nametxt)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PHONE :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADDRESS :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("GENDER :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        rootP.setBackground(new java.awt.Color(51, 51, 51));
        rootP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(rootP, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 0, -1, 446));

        phonetxt.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        phonetxt.setForeground(new java.awt.Color(0, 153, 51));
        jPanel2.add(phonetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 75, -1, -1));

        idtxt.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        idtxt.setForeground(new java.awt.Color(0, 153, 51));
        jPanel2.add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 69, -1, -1));

        addresstxt.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        addresstxt.setForeground(new java.awt.Color(0, 153, 51));
        jPanel2.add(addresstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(654, 129, -1, -1));

        gendertxt.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        gendertxt.setForeground(new java.awt.Color(0, 153, 51));
        jPanel2.add(gendertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(654, 92, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("AGE :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        agetxt.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        agetxt.setForeground(new java.awt.Color(0, 153, 51));
        jPanel2.add(agetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 86, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("STATUS :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        statustxt.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        statustxt.setForeground(new java.awt.Color(0, 153, 51));
        jPanel2.add(statustxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(654, 298, -1, -1));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("SAVINGS");

        TS.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TS.setForeground(new java.awt.Color(255, 255, 255));
        TS.setText("0.00");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ksh.");

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TT.setForeground(new java.awt.Color(255, 255, 255));
        TT.setText("0.00");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("GROUP CONTRB");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ksh.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TT, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TOTAL CONTRB");

        totalamount.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        totalamount.setForeground(new java.awt.Color(255, 255, 255));
        totalamount.setText("0.00");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(totalamount, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalamount)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ksh.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TS, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 530, -1));

        ptxn.setBackground(new java.awt.Color(51, 51, 51));
        ptxn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ptxn.setForeground(new java.awt.Color(255, 255, 255));
        ptxn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(ptxn);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 300, 200));

        phonet.setForeground(new java.awt.Color(255, 255, 255));
        phonet.setText("PHONE");
        jPanel2.add(phonet, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        aget.setForeground(new java.awt.Color(255, 255, 255));
        aget.setText("AGE");
        jPanel2.add(aget, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        gendert.setForeground(new java.awt.Color(255, 255, 255));
        gendert.setText("GENDER");
        jPanel2.add(gendert, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        addresst.setForeground(new java.awt.Color(255, 255, 255));
        addresst.setText("ADDRESS");
        jPanel2.add(addresst, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        statust.setForeground(new java.awt.Color(255, 255, 255));
        statust.setText("STATUS");
        jPanel2.add(statust, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ACCOUNT NAME :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 86, -1, -1));

        namet.setForeground(new java.awt.Color(255, 255, 255));
        namet.setText("NAME");
        jPanel2.add(namet, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 90, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("MY TRANSACTIONS");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 17, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("ACCOUNT DETAILS");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 630, 20));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 650, 440));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        accountlist.setBackground(new java.awt.Color(0, 0, 0));
        accountlist.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        accountlist.setForeground(new java.awt.Color(204, 204, 204));
        accountlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountlistMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountlistMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(accountlist);

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(search))
                .addGap(55, 55, 55))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 200, 430));
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 220, 0, 0));
    }// </editor-fold>//GEN-END:initComponents

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        
        try {
             Class.forName("com.mysql.jdbc.Driver");
              Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
             String sql="select member from newmember where member like '% " + name.getText() + " ' %";
             PreparedStatement ps=conn.prepareStatement(sql);
             
             ResultSet rs=ps.executeQuery();
             while (rs.next()) {              
              acclist.addElement(rs.getString("MEMBER"));
          }
              accountlist.setModel(acclist);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchKeyReleased
  public void calllist(){
      accountlist.removeAll();
      accountlist();
  }
    private void accountlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountlistMouseClicked
        
        int index=accountlist.getSelectedIndex();
        String s=(String) accountlist.getSelectedValue();
       
        
          try {
               name.setText(s);
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
          String sql="select member,phone,age,address,gender,status from newmember where member=?";
          String sql1="select sum(seventy) ,sum(thirty),sum(amount),sum(withdrawal) from account where member=?";
          String sql2="select date,amount,withdrawal from account where member=?";
          PreparedStatement ps=conn.prepareStatement(sql);
          PreparedStatement ps1=conn.prepareStatement(sql1);
          PreparedStatement ps2=conn.prepareStatement(sql2);
          ps.setString(1, name.getText());
          ps2.setString(1, name.getText());
          ps1.setString(1, name.getText());
          
          ResultSet rs=ps.executeQuery();
          ResultSet rs2=ps2.executeQuery();
          ResultSet rs1=ps1.executeQuery();
          ptxn.setModel(DbUtils.resultSetToTableModel(rs2));
              if (rs.next()  && rs1.next()) {
                  
                  namet.setText(rs.getString("member"));
                  phonet.setText(rs.getString("phone"));
                  aget.setText(rs.getString("age"));
                  addresst.setText(rs.getString("address"));
                  gendert.setText(rs.getString("gender"));
                  statust.setText(rs.getString("status"));
                  int tpersonal=Integer.parseInt(rs1.getString("sum(seventy)"));
                  int tpwithd=Integer.parseInt(rs1.getString("sum(withdrawal)"));
                  int newtotal=tpersonal-tpwithd;
                  TS.setText(newtotal +"");
                  int tpthirty=Integer.parseInt(rs1.getString("sum(thirty)"));;
                  TT.setText(tpthirty+"");
                  int tpamount=Integer.parseInt(rs1.getString("sum(amount)"));
                  totalamount.setText(tpamount+"");
                  
                  
              }
          
    
            
          } catch (Exception e) {
         JOptionPane.showMessageDialog(null,e);
      }
        
    }//GEN-LAST:event_accountlistMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void accountlistMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountlistMouseEntered
     
    }//GEN-LAST:event_accountlistMouseEntered
    private void searchfilter()
 {
     
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TS;
    private javax.swing.JLabel TT;
    private javax.swing.JList<String> accountlist;
    private javax.swing.JLabel addresst;
    private javax.swing.JLabel addresstxt;
    private javax.swing.JLabel aget;
    private javax.swing.JLabel agetxt;
    private javax.swing.JLabel gendert;
    private javax.swing.JLabel gendertxt;
    private javax.swing.JLabel idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField name;
    private javax.swing.JLabel namet;
    private javax.swing.JLabel nametxt;
    private javax.swing.JLabel phonet;
    private javax.swing.JLabel phonetxt;
    private javax.swing.JTable ptxn;
    private javax.swing.JPanel rootP;
    private javax.swing.JTextField search;
    private javax.swing.JLabel statust;
    private javax.swing.JLabel statustxt;
    private javax.swing.JLabel totalamount;
    // End of variables declaration//GEN-END:variables

    private void filterModel(DefaultListModel<String> defaultListModel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
