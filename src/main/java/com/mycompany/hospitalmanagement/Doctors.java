/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms
 */
package com.mycompany.hospitalmanagement;




import com.google.common.base.Ascii;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.dbutils.DbUtils;



public class Doctors extends javax.swing.JFrame {

    
    public Doctors() {
        initComponents();
        Selectional();
    }
    
    Connection conn=null;
    Statement st= null;
    ResultSet rs=null;
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        label4 = new java.awt.Label();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        docId = new javax.swing.JTextField();
        docName = new javax.swing.JTextField();
        docExp = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        docdelete = new javax.swing.JButton();
        docupdate = new javax.swing.JButton();
        doclear = new javax.swing.JButton();
        label3 = new java.awt.Label();
        jPanel4 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        docrefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorTable = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        docPass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        docUn = new javax.swing.JTextField();

        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Hospital Management System");

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Manage Doctors");

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("X");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(235, 235, 235)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Experience: ");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID: ");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Name: ");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Password:");

        docId.setBackground(new java.awt.Color(255, 255, 255));
        docId.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        docId.setForeground(new java.awt.Color(0, 0, 0));
        docId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        docName.setBackground(new java.awt.Color(255, 255, 255));
        docName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        docName.setForeground(new java.awt.Color(0, 0, 0));

        docExp.setBackground(new java.awt.Color(255, 255, 255));
        docExp.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        docExp.setForeground(new java.awt.Color(0, 0, 0));

        addbtn.setBackground(new java.awt.Color(0, 0, 0));
        addbtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("Add");
        addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnMouseClicked(evt);
            }
        });

        docdelete.setBackground(new java.awt.Color(0, 0, 0));
        docdelete.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        docdelete.setForeground(new java.awt.Color(255, 255, 255));
        docdelete.setText("Delete");
        docdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docdeleteMouseClicked(evt);
            }
        });
        docdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docdeleteActionPerformed(evt);
            }
        });

        docupdate.setBackground(new java.awt.Color(0, 0, 0));
        docupdate.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        docupdate.setForeground(new java.awt.Color(255, 255, 255));
        docupdate.setText("Update");
        docupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docupdateMouseClicked(evt);
            }
        });

        doclear.setBackground(new java.awt.Color(0, 0, 0));
        doclear.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        doclear.setForeground(new java.awt.Color(255, 255, 255));
        doclear.setText("Clear");
        doclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doclearMouseClicked(evt);
            }
        });
        doclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doclearActionPerformed(evt);
            }
        });

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 0, 0));
        label3.setText("Doctor Information");

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Doctor List");

        docrefresh.setBackground(new java.awt.Color(0, 0, 0));
        docrefresh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        docrefresh.setForeground(new java.awt.Color(255, 255, 255));
        docrefresh.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rashminda\\Documents\\NetBeansProjects\\java web\\HospitalManagement\\src\\main\\java\\com\\mycompany\\hospitalmanagement\\refresh.png")); // NOI18N
        docrefresh.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        docrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docrefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(docrefresh)
                .addGap(17, 17, 17))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(docrefresh)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        doctorTable.setBackground(new java.awt.Color(255, 255, 255));
        doctorTable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        doctorTable.setForeground(new java.awt.Color(0, 0, 0));
        doctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor ID", "Doctor Name", "Username", "Password", "Experience"
            }
        ));
        doctorTable.setRowHeight(25);
        doctorTable.setRowMargin(5);
        doctorTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        doctorTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        doctorTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(doctorTable);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rashminda\\Documents\\NetBeansProjects\\java web\\HospitalManagement\\src\\main\\java\\com\\mycompany\\hospitalmanagement\\home.png")); // NOI18N
        jButton5.setText("Home");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        docPass.setBackground(new java.awt.Color(255, 255, 255));
        docPass.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        docPass.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("User Name:");

        docUn.setBackground(new java.awt.Color(255, 255, 255));
        docUn.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        docUn.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(addbtn)
                                .addGap(26, 26, 26)
                                .addComponent(docupdate)
                                .addGap(18, 18, 18)
                                .addComponent(docdelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(doclear, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(docId, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(docName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(docUn, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(docPass))
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(docExp, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 78, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5)))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(docId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(docUn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(docName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(docPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(docdelete)
                    .addComponent(docupdate)
                    .addComponent(doclear)
                    .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void docdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docdeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docdeleteActionPerformed

    private void doclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doclearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doclearActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed
    
   private void Selectional(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanage","root","1234");
            st=conn.createStatement();
            
            String sql="select * from doctor ";
            rs=st.executeQuery(sql);
            
            //doctorTable.setModel(DbUtils.resultSetToTableModel(rs));
            
            while(rs.next()){
                String id=String.valueOf(rs.getInt("docid"));
                String docName=String.valueOf(rs.getString("docname"));
                String docExp=String.valueOf(rs.getString("docexp"));
                String docPass=String.valueOf(rs.getString("docpass"));
                String docUN=String.valueOf(rs.getString("username"));
               
                String tbData[]={id,docName,docUN,docPass,docExp};
                DefaultTableModel tblModel=(DefaultTableModel)doctorTable.getModel();
                
                tblModel.addRow(tbData);
            }
            conn.close();
          
        }catch(Exception e){
           e.printStackTrace();
        }
    }
    
    private void SelectionClear() {
        DefaultTableModel model = (DefaultTableModel) doctorTable.getModel();
        model.setRowCount(0); // Clear all rows from the table model
    }
    
    
    private void addbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseClicked
        
        if(docId.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Fill the relavent fields.");
        }else{
           try{
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanage","root","1234");
            
            String sql="insert into doctor values(?,?,?,?,?)";
            
            PreparedStatement add=conn.prepareStatement(sql);
            add.setInt(1,Integer.valueOf(docId.getText()));
            add.setString(2,docName.getText());
            add.setInt(3,Integer.valueOf(docExp.getText()));
            add.setString(4,docPass.getText());
            add.setString(5,docUn.getText());
            
            int row=add.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Doctor Added Succssfully.");
            
             
            //
            SelectionClear();
            Selectional();
        
            conn.close();
            clearText();
                    
                    
        }catch(Exception e){
            e.printStackTrace();
        }
        }
        
    }//GEN-LAST:event_addbtnMouseClicked

    private void docrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docrefreshActionPerformed
       
         SelectionClear();
         Selectional();
    }//GEN-LAST:event_docrefreshActionPerformed

    
    
    private void clearText(){
        docId.setText("");
        docName.setText("");
        docExp.setText("");
        docPass.setText("");
        docUn.setText("");
    }
    private void doclearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doclearMouseClicked
        clearText();
    }//GEN-LAST:event_doclearMouseClicked

    private void doctorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorTableMouseClicked
        
        DefaultTableModel model=(DefaultTableModel)doctorTable.getModel();
        int Myindex=doctorTable.getSelectedRow();
        docId.setText(model.getValueAt(Myindex,0).toString());
        docName.setText(model.getValueAt(Myindex,1).toString());
        docUn.setText(model.getValueAt(Myindex,2).toString());
        docPass.setText(model.getValueAt(Myindex,3).toString());
        docExp.setText(model.getValueAt(Myindex,4).toString());
        
        
    }//GEN-LAST:event_doctorTableMouseClicked

    private void docdeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docdeleteMouseClicked
        if(docId.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Enter The Doctor To Be Deleted");
        }else{
            
            try{
                conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanage","root","1234");
                String Id =docId.getText();
                String  sql="delete from doctor where docid="+Id;
                
                Statement st=conn.createStatement();
                st.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(this,"Doctor Successfully Deleted");
                
                // 
                SelectionClear();
                Selectional();
                
                clearText();
                
            
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }
        
        
    }//GEN-LAST:event_docdeleteMouseClicked

    private void docupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docupdateMouseClicked
        
        if(docId.getText().isEmpty() || docName.getText().isEmpty() || docPass.getText().isEmpty()||docExp.getText().isEmpty()||docUn.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Missing Information.");
        }else{
            
            try{
                
                conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanage","root","1234");
                String Id =docId.getText();
                //String  sql="update doctor set docname='"+docName.getName()+",docexp="+docExp.getText()+",docpass="+docPass.getText()+"'"+"where docid="+docId.getText();
                
                String  sql="update doctor set docname='"+docName.getText()+"',docexp='"+docExp.getText()+"',docpass='"+docPass.getText()+"',username='"+docUn.getText()+"' where docid='"+docId.getText()+"'";
                
                Statement st=conn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this,"Doctor Updated Successfully.");
                
                SelectionClear();
                Selectional();
                
                clearText();
                
            }catch(Exception e){
                e.printStackTrace();
            }
        
        }
    }//GEN-LAST:event_docupdateMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton7MouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField docExp;
    private javax.swing.JTextField docId;
    private javax.swing.JTextField docName;
    private javax.swing.JPasswordField docPass;
    private javax.swing.JTextField docUn;
    private javax.swing.JButton docdelete;
    private javax.swing.JButton doclear;
    private javax.swing.JButton docrefresh;
    private javax.swing.JTable doctorTable;
    private javax.swing.JButton docupdate;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    // End of variables declaration//GEN-END:variables
}
