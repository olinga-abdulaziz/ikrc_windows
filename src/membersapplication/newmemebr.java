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
public class newmemebr extends javax.swing.JPanel {

    
    public newmemebr() {
        initComponents();
    }
public void insertintotrasquery(){
      try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
        String sql="Insert into transquery values (?,?,?,?)";
        int defvalue=0;
        
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setString(1, name.getText());
        ps.setInt(2, defvalue);
        ps.setInt(3, defvalue);
        ps.setInt(4, defvalue);
        ps.executeUpdate();
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        status = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("IMAGE");

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(625, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(264, 264, 264))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        status.setBackground(new java.awt.Color(102, 102, 102));
        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FAMILY", "FAMILY FRIEND", "NEIGBOUR", "RELATIVE" }));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("STATUS");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("GENDER");

        male.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(male);
        male.setForeground(new java.awt.Color(255, 255, 255));
        male.setText("MALE");

        female.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(female);
        female.setForeground(new java.awt.Color(255, 255, 255));
        female.setText("FEMALE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(male)
                        .addGap(31, 31, 31)
                        .addComponent(female)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(status, 0, 282, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(male)
                    .addComponent(female))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        name.setBackground(new java.awt.Color(51, 51, 51));
        name.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAME");

        id.setBackground(new java.awt.Color(51, 51, 51));
        id.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PHONE");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ADDRESS");

        phone.setBackground(new java.awt.Color(51, 51, 51));
        phone.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID NUMBER");

        address.setBackground(new java.awt.Color(51, 51, 51));
        address.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("AGE");

        age.setBackground(new java.awt.Color(51, 51, 51));
        age.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Public\\Videos\\MyTools\\icons\\user.png")); // NOI18N
        jLabel1.setText("ADD NEW MEMBER");

        jPanel5.setBackground(new java.awt.Color(0, 153, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 263, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 154, Short.MAX_VALUE)
        );

        btnSave.setBackground(new java.awt.Color(0, 204, 51));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(address, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(age, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(282, 282, 282)
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)))
                .addGap(78, 78, 78))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(632, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)))
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(92, 92, 92)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(272, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       
        insertintotrasquery();
         try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/familygroup","root","");
        String sql="Insert into newmember values (?,?,?,?,?,?,?)";
        String sql1="Insert into account values (?,?,?,?,?,?,?,null)";
   
      
         PreparedStatement ps=conn.prepareStatement(sql);
          PreparedStatement ps1=conn.prepareStatement(sql1);
         String date="";
         int amount=0;
         double seventy=0;
         double thirty=0;
   
         int defvalue=0;
     
        ps.setString(1, name.getText());
        ps.setString(2, id.getText());
        ps.setString(3, phone.getText());
        ps.setString(4, age.getText());
        ps.setString(5, address.getText());
        
         ps1.setString(1, name.getText());
         ps1.setString(2, phone.getText());
         ps1.setInt(3, defvalue);
         ps1.setInt(4, defvalue);
         ps1.setInt(5, defvalue);
         ps1.setInt(6, defvalue);
         ps1.setInt(7, defvalue);

         
         
        String gender=null;
             if (male.isSelected()) {
                 gender="MALE";
             } else {
                 gender="FEMALE";
             }
         ps.setString(6, gender);
         ps.setString(7, status.getSelectedItem().toString());
       
         ps.executeUpdate();
   
         JOptionPane.showMessageDialog(null, "Record Saved Succefully!");
         name.setText("");
          id.setText("");
           phone.setText("");
            age.setText("");
             address.setText("");
          int numrows =ps1.executeUpdate();
                    
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
         
    }//GEN-LAST:event_btnSaveActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JComboBox<String> status;
    // End of variables declaration//GEN-END:variables
}
