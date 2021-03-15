
package membersapplication;



import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class mainBoard extends javax.swing.JFrame {
    GridBagLayout layout =new GridBagLayout();
    newmemebr nm;
    AllmembersAcc am;
    Deposit ct;
    contributions cn;
    withdraw wd;
    groupsummary gs;
    Members ac;
    transactions ts;
    users usr;
    public mainBoard() {
       
        initComponents();
        usr=new users();
        nm =new newmemebr();
        am =new AllmembersAcc();
        ct =new Deposit();
        cn=new contributions();
        wd=new withdraw();
        gs=new groupsummary();
        ac=new Members();
        ts=new transactions();
        rootPanel.setLayout(layout);
        GridBagConstraints c=new GridBagConstraints();
        c.gridx=0;
        c.gridy=0;
        rootPanel.add(nm,c);
        c.gridx=0;
        c.gridy=0;
        rootPanel.add(usr,c);
        c.gridx=0;
        c.gridy=0;
        rootPanel.add(ac,c);
        c.gridx=0;
        c.gridy=0;
        rootPanel.add(am,c);
        c.gridx=0;
        c.gridy=0;
        rootPanel.add(ct,c);
        c.gridx=0;
        c.gridy=0;
        rootPanel.add(cn,c);
        c.gridx=0;
        c.gridy=0;
        rootPanel.add(wd,c);
        c.gridx=0;
        c.gridy=0;
        rootPanel.add(gs,c);
        c.gridx=0;
        c.gridy=0;
        rootPanel.add(ts,c);
        usr.setVisible(false);
        ts.setVisible(false);
        ac.setVisible(false);
        gs.setVisible(true);
        wd.setVisible(false);
        cn.setVisible(false);
        ct.setVisible(false);
        am.setVisible(false);
        nm.setVisible(false);
       userslogin();
       
    }
   public void disablecode(){
       
       
   }
public void launchlogin(){
    new login().setVisible(true);
}
public void userslogin(){
         try {
         Class.forName("com.mysql.jdbc.Driver");
         Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
         String sql="select username from currentuser where no=1 ";
         PreparedStatement ps=conn.prepareStatement(sql);
         ResultSet rs=ps.executeQuery();
             if (rs.next()) {
                 
                 userlogin.setText(rs.getString("username"));
             }
         } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e);
     }
}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        rootPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        orgname = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        userlogin = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IKRC FINANCE DATABASE.");
        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(1020, 770));
        setPreferredSize(new java.awt.Dimension(1390, 860));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jp4.setBackground(new java.awt.Color(0, 153, 255));
        jp4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jp4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(950, 950, 950)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(271, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
        );

        jp4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 131, 1230, 0));

        rootPanel.setBackground(new java.awt.Color(0, 0, 0));
        rootPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 908, Short.MAX_VALUE)
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );

        jp4.add(rootPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 910, 558));

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("ACCOUNTS");
        jButton8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("TRANSACTIONS");
        jButton7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("WITHDRAW");
        jButton6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("DEPOSIT");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(0, 0, 0));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("LOANS");
        jButton10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel1))
        );

        jp4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 150, 210, 530));

        jPanel5.setBackground(new java.awt.Color(0, 153, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("HOME");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("NEW MEMBER");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText(" MEMBERS");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("USERS");
        jButton9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("GROUP");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jp4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 220, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1346, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jp4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, 1350, 70));

        orgname.setBackground(new java.awt.Color(204, 204, 204));
        orgname.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        orgname.setForeground(new java.awt.Color(255, 255, 255));
        orgname.setIcon(new javax.swing.ImageIcon("C:\\Users\\Guest\\Documents\\NetBeansProjects\\MembersApplication\\src\\resources\\merchant-account.png")); // NOI18N
        orgname.setText("IKRC FINANCE MANAGEMENT");
        orgname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                orgnameMouseEntered(evt);
            }
        });
        jp4.add(orgname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 740, 100));

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));
        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));

        userlogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userlogin.setForeground(new java.awt.Color(255, 255, 255));
        userlogin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Public\\Videos\\MyTools\\icons\\user.png")); // NOI18N
        userlogin.setText("user");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(userlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(userlogin)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jp4.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, 210, -1));

        getContentPane().add(jp4, "card2");

        jMenuBar1.setForeground(new java.awt.Color(0, 204, 51));

        jMenu1.setBackground(new java.awt.Color(204, 204, 204));
        jMenu1.setForeground(new java.awt.Color(51, 51, 51));
        jMenu1.setText("Settings");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });

        jMenuItem1.setText("Settings");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(204, 204, 204));
        jMenu2.setForeground(new java.awt.Color(51, 51, 51));
        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ac.setVisible(true);
        cn.setVisible(false);
        ct.setVisible(false);
        am.setVisible(false);
        nm.setVisible(false);
        wd.setVisible(false);
        gs.setVisible(false);
        ts.setVisible(false);
        usr.setVisible(false);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        nm.setVisible(true);
        am.setVisible(false);
        ct.setVisible(false);
        cn.setVisible(false);
        wd.setVisible(false);
        ac.setVisible(false);
        ts.setVisible(false);
        gs.setVisible(false);
         usr.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cn.setVisible(false);
        ct.setVisible(false);
        am.setVisible(false);
        nm.setVisible(false);
        wd.setVisible(false);
        ac.setVisible(false);
        gs.setVisible(true);
        ts.setVisible(false);
         usr.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        cn.setVisible(false);
        ct.setVisible(false);
        am.setVisible(false);
        nm.setVisible(false);
        wd.setVisible(true);
        ac.setVisible(false);
        ts.setVisible(false);
         gs.setVisible(false);
          usr.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        gs.setVisible(false);
        cn.setVisible(false);
        ct.setVisible(false);
        am.setVisible(false);
        nm.setVisible(false);
        wd.setVisible(false);
        ac.setVisible(false);
        ts.setVisible(true);
         usr.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        am.setVisible(true);
        nm.setVisible(false);
        ct.setVisible(false);
        cn.setVisible(false);
        wd.setVisible(false);
        ac.setVisible(false);
        ts.setVisible(false);
         gs.setVisible(false);
          usr.setVisible(false);

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new group().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void orgnameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orgnameMouseEntered
   try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
         String sql="select orgname from setting";
         PreparedStatement ps=conn.prepareStatement(sql);
         ResultSet rs=ps.executeQuery();
         if (rs.next()) {
           
             orgname.setText(rs.getString("orgname"));
       }
           
            } catch (Exception e) {
          JOptionPane.showMessageDialog(null, e);
      }
    }//GEN-LAST:event_orgnameMouseEntered

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        new settings().setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
       
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        am.setVisible(false);
        nm.setVisible(false);
        ct.setVisible(false);
        cn.setVisible(false);
        wd.setVisible(false);
        ac.setVisible(false);
        ts.setVisible(false);
         gs.setVisible(false);
          usr.setVisible(true);     
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ct.setVisible(true);
        am.setVisible(false);
        nm.setVisible(false);
        cn.setVisible(false);
        wd.setVisible(false);
        ac.setVisible(false);
        ts.setVisible(false);
        gs.setVisible(false);
        usr.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jp4;
    private javax.swing.JLabel orgname;
    private javax.swing.JPanel rootPanel;
    public javax.swing.JLabel userlogin;
    // End of variables declaration//GEN-END:variables
}
