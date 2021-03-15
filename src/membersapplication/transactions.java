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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author ES-LANS
 */
public class transactions extends javax.swing.JPanel {

    /**
     * Creates new form transactions
     */
    public transactions() {
        initComponents();
        Displayincash();
        Displaycashout();
        
       
       
    }
   
 public void Displayincash(){
     try {
         Class.forName("com.mysql.jdbc.Driver");
         Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
         String sql="select member,phone,date,amount,no from account ";
         PreparedStatement ps=conn.prepareStatement(sql);
         ResultSet rs=ps.executeQuery();
         t1.setModel(DbUtils.resultSetToTableModel(rs));
         ps.executeQuery();
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e);
     }
     
     
 }
  public void Displaycashout()
    {
      try {
         Class.forName("com.mysql.jdbc.Driver");
         Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
         String sql="select  member,phone,date,withdrawal,no from account";
         PreparedStatement ps=conn.prepareStatement(sql);
         ResultSet rs=ps.executeQuery();
         t2.setModel(DbUtils.resultSetToTableModel(rs));
         ps.executeQuery();
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e);
     }
        
    }
 public void totals()
 {
     String cat=category.getSelectedItem().toString();
     
     if (cat.equals("GENERAL")){
         generalSum();
     } else if (cat.equals("PERSONAL")) {
         personalSum();
     } else  {
         groupSum();
         return;
     }
 {
     }
 }
 
  public void generalSum()
  {
          try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
          String sql1="select member,phone,date,amount,no from account ";
         PreparedStatement ps1=conn.prepareStatement(sql1);
         ResultSet rs1=ps1.executeQuery();
         t1.setModel(DbUtils.resultSetToTableModel(rs1));
         ps1.executeQuery();
          String query="select sum(amount) from account";
            PreparedStatement ps=conn.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                String sum=rs.getString("sum(amount)");
                cashintotal.setText(sum);
            } else {
            }
           } catch (Exception e) {
          JOptionPane.showMessageDialog(null, e);
      }
  }
  public void personalSum()
  {
          try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
           String sql1="select member,phone,date,seventy,no from account ";
         PreparedStatement ps1=conn.prepareStatement(sql1);
         ResultSet rs1=ps1.executeQuery();
         t1.setModel(DbUtils.resultSetToTableModel(rs1));
         ps1.executeQuery();
          String query="select sum(seventy),sum(withdrawal) from account";
            PreparedStatement ps=conn.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                String sum=rs.getString("sum(seventy)");
                 String sum1=rs.getString("sum(withdrawal)");
                cashintotal.setText(sum);
                Ttwithdrawal.setText(sum1);
            } else {
            }
           } catch (Exception e) {
          JOptionPane.showMessageDialog(null, e);
      }
  }
  public void groupSum()
  {
          try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
           String sql1="select member,phone,date,thirty,no from account ";
         PreparedStatement ps1=conn.prepareStatement(sql1);
         ResultSet rs1=ps1.executeQuery();
         t1.setModel(DbUtils.resultSetToTableModel(rs1));
         ps1.executeQuery();
          String query="select sum(thirty) from account";
            PreparedStatement ps=conn.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                String sum=rs.getString("sum(thirty)");
                cashintotal.setText(sum);
            } else {
            }
           } catch (Exception e) {
          JOptionPane.showMessageDialog(null, e);
      }
  }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        t2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cashintotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Ttwithdrawal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        category = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        membern = new javax.swing.JTextField();
        phonen = new javax.swing.JTextField();
        daten = new javax.swing.JTextField();
        amountn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        txnno = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        t1.setBackground(new java.awt.Color(51, 51, 51));
        t1.setForeground(new java.awt.Color(255, 255, 255));
        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(t1);

        t2.setBackground(new java.awt.Color(51, 51, 51));
        t2.setForeground(new java.awt.Color(255, 255, 255));
        t2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        t2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(t2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("CASH OUT");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 51));
        jLabel2.setText("CASH IN");

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TOTAL :");

        cashintotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cashintotal.setForeground(new java.awt.Color(0, 204, 51));
        cashintotal.setText("0.00");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ksh.");

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TOTAL :");

        Ttwithdrawal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Ttwithdrawal.setForeground(new java.awt.Color(255, 0, 0));
        Ttwithdrawal.setText("0.00");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ksh.");

        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GENERAL", "PERSONAL", "GROUP " }));

        jButton1.setBackground(new java.awt.Color(0, 204, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("VIEW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(255, 0, 0));
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        membern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membernActionPerformed(evt);
            }
        });

        daten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datenActionPerformed(evt);
            }
        });

        amountn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PHONE");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("DATE");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("AMOUNT");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("MEMBER");

        btnUpdate.setBackground(new java.awt.Color(0, 153, 255));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("TXN NO");

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("UPDATE");

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(amountn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(daten, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(phonen, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txnno, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(membern, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton2)
                                            .addComponent(btnUpdate))
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btndelete)
                                            .addComponent(jButton3))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(Ttwithdrawal)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cashintotal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5)))
                                .addContainerGap(151, Short.MAX_VALUE))))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel2)
                    .addContainerGap(761, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jLabel3)
                                .addComponent(cashintotal)
                                .addComponent(jLabel5)))
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8)
                                .addComponent(Ttwithdrawal))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(membern, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phonen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(daten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amountn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btndelete)
                            .addComponent(btnUpdate))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))))
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel2)
                    .addContainerGap(614, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         totals();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseClicked
 
       int index=t1.getSelectedRow();
       TableModel model =t1.getModel();
       membern.setText(model.getValueAt(index, 0).toString());
       phonen.setText(model.getValueAt(index, 1).toString());
       daten.setText(model.getValueAt(index, 2).toString());
       amountn.setText(model.getValueAt(index, 3).toString());
       txnno.setText(model.getValueAt(index, 4).toString());
       
    }//GEN-LAST:event_t1MouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
      
            try {
                
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
           String sql1="delete  from account where no=? ";
            
            
            
           PreparedStatement ps=conn.prepareStatement(sql1);

           
           ps.setString(1, txnno.getText());
         
           ps.executeUpdate();
           
          
           JOptionPane.showMessageDialog(null, "Transaction Deleted succesfully!");
           Displayincash();
               } catch (Exception e) {
          JOptionPane.showMessageDialog(null, e);
      
               }
          
    }//GEN-LAST:event_btndeleteActionPerformed

    private void membernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membernActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_membernActionPerformed

    private void datenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datenActionPerformed

    private void amountnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountnActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
           String sql="update account set member=? phone=?,date=?,amount=? where no=?  ";
           PreparedStatement ps=conn.prepareStatement(sql);
           ps.setString(1, membern.getText());
            ps.setString(2, phonen.getText());
            ps.setString(3, daten.getText());
            ps.setString(4, amountn.getText());
               int numrows =ps.executeUpdate();
               if (numrows >0) {
                   ResultSet rs=ps.getGeneratedKeys();
                   int generatedno=-1;
                   if (rs!=null && rs.next()) {
                       generatedno=rs.getInt(1);
                   }
                   
               }
             
             
             JOptionPane.showMessageDialog(null,"Transaction updated succesfully !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          
            try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
           String sql1="delete  from account where no=? ";
           
           PreparedStatement ps=conn.prepareStatement(sql1);
           ps.setString(1, txnno.getText());
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null, "Transaction Deleted succesfully!");
           Displaycashout();
               } catch (Exception e) {
          JOptionPane.showMessageDialog(null, e);
      }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void t2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t2MouseClicked
        // TODO add your handling code here:
             int index=t2.getSelectedRow();
       TableModel model =t2.getModel();
       membern.setText(model.getValueAt(index, 0).toString());
       phonen.setText(model.getValueAt(index, 1).toString());
       daten.setText(model.getValueAt(index, 2).toString());
       amountn.setText(model.getValueAt(index, 3).toString());
       txnno.setText(model.getValueAt(index, 4).toString());
       
    }//GEN-LAST:event_t2MouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ttwithdrawal;
    private javax.swing.JTextField amountn;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btndelete;
    private javax.swing.JLabel cashintotal;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JTextField daten;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField membern;
    private javax.swing.JTextField phonen;
    private javax.swing.JTable t1;
    private javax.swing.JTable t2;
    private javax.swing.JTextField txnno;
    // End of variables declaration//GEN-END:variables
}
