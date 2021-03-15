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
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Code Room
 */
public class Members extends javax.swing.JPanel {
    
    public Members() {
        initComponents();
        DisplayTable();
         
    }
    
   public void DisplayTable()
   {
       try {
         Class.forName("com.mysql.jdbc.Driver");
         Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
         String sql="select * from newmember";
         PreparedStatement ps=conn.prepareStatement(sql);
         ResultSet rs=ps.executeQuery();
         t1.setModel(DbUtils.resultSetToTableModel(rs));
       } catch (Exception e) {
       }
   }
  
  editMember jtrowdata =new editMember();
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t1.setBackground(new java.awt.Color(51, 51, 51));
        t1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        t1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(t1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 630, 440));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ALL MEMBERS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 204, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REFRESH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseClicked
       int index=t1.getSelectedRow();
       TableModel model=t1.getModel();
       String MEMBER=model.getValueAt(index, 0).toString();
       String ID=model.getValueAt(index, 1).toString();
       String PHONE=model.getValueAt(index, 2).toString();
       String AGE=model.getValueAt(index, 3).toString();
       String ADDRESS=model.getValueAt(index, 4).toString();
       String GENDER=model.getValueAt(index, 5).toString();
       String STATUS=model.getValueAt(index, 6).toString();
       
       jtrowdata.setVisible(true);
       jtrowdata.pack();
       jtrowdata.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
       jtrowdata.name.setText(MEMBER);
       jtrowdata.id.setText(ID);
       jtrowdata.phone.setText(PHONE);
       jtrowdata.age.setText(AGE);
       jtrowdata.address.setText(ADDRESS);
       
       
       
    }//GEN-LAST:event_t1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DisplayTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable t1;
    // End of variables declaration//GEN-END:variables
}
