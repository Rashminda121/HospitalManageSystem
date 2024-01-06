
package com.mycompany.hospitalmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Diagnosis extends javax.swing.JFrame {

    
    public Diagnosis() {
        initComponents();
        getPatient();
        Selectional();
        
    }
    
    
    Connection conn=null;
    Statement st= null;
    ResultSet rs=null,rs1=null;
    
    
    private void Selectional(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanage","root","1234");
            st=conn.createStatement();
            
            String sql="select * from diagnosis ";
            rs=st.executeQuery(sql);
            
            //doctorTable.setModel(DbUtils.resultSetToTableModel(rs));
            
            while(rs.next()){
                String id=String.valueOf(rs.getInt("dagid"));
                String patid=String.valueOf(rs.getString("patid"));
                String patname=String.valueOf(rs.getString("patname"));
                String symptoms=String.valueOf(rs.getString("symptoms"));
                String diagnosis=String.valueOf(rs.getString("diagnosis"));
                String medicine=String.valueOf(rs.getString("medicine"));
                
               
                String tbData[]={id,patid,patname,symptoms,diagnosis,medicine};
                DefaultTableModel tblModel=(DefaultTableModel)diagTable.getModel();
                
                tblModel.addRow(tbData);
            }
            conn.close();
          
        }catch(Exception e){
           e.printStackTrace();
        }
    }
    private void SelectionClear() {
        DefaultTableModel model = (DefaultTableModel) diagTable.getModel();
        model.setRowCount(0); // Clear all rows from the table model
    }
    
     private void clearText(){
        diaId.setText("");
        Patid.setSelectedItem("-- select --");
        patName.setText("");
        patSymp.setText("");
        patDiag.setText("");
        patMed.setText("");
        patSum.setText("");
    }
    
    
    
    private void getPatient(){
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanage","root","1234");
            st=conn.createStatement();
            
            String sql="select * from patient ";
            rs=st.executeQuery(sql);
            
            while(rs.next()){
                String mypat=rs.getString("patid");
                //String mypatname=rs.getString("patname");
                Patid.addItem(mypat);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void getPname(){
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanage","root","1234");
            st=conn.createStatement();
            
            String sql="select * from patient where patid='"+Patid.getSelectedItem().toString()+"'";
            rs1=st.executeQuery(sql);
            
            while(rs1.next()){
                
                String PatName=rs1.getString("patname");
                patName.setText(PatName);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        label4 = new java.awt.Label();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        patDiag = new javax.swing.JTextField();
        diaId = new javax.swing.JTextField();
        patSymp = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        delbtn = new javax.swing.JButton();
        updbtn = new javax.swing.JButton();
        label3 = new java.awt.Label();
        jPanel4 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        diagTable = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        patName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Patid = new javax.swing.JComboBox<>();
        patMed = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        patSum = new javax.swing.JTextArea();
        delbtn1 = new javax.swing.JButton();
        printbtn = new javax.swing.JButton();

        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Hospital Management System");

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Manage Diagnosis");

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("X");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(321, 321, 321)
                        .addComponent(jButton6)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(374, 374, 374))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Symptoms:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("PatID:");

        patDiag.setBackground(new java.awt.Color(255, 255, 255));
        patDiag.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        patDiag.setForeground(new java.awt.Color(0, 0, 0));

        diaId.setBackground(new java.awt.Color(255, 255, 255));
        diaId.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        diaId.setForeground(new java.awt.Color(0, 0, 0));

        patSymp.setBackground(new java.awt.Color(255, 255, 255));
        patSymp.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        patSymp.setForeground(new java.awt.Color(0, 0, 0));

        addbtn.setBackground(new java.awt.Color(0, 0, 0));
        addbtn.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("Add");
        addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnMouseClicked(evt);
            }
        });

        delbtn.setBackground(new java.awt.Color(0, 0, 0));
        delbtn.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        delbtn.setForeground(new java.awt.Color(255, 255, 255));
        delbtn.setText("Delete");
        delbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbtnActionPerformed(evt);
            }
        });

        updbtn.setBackground(new java.awt.Color(0, 0, 0));
        updbtn.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        updbtn.setForeground(new java.awt.Color(255, 255, 255));
        updbtn.setText("Update");
        updbtn.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        updbtn.setRolloverEnabled(false);
        updbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updbtnMouseClicked(evt);
            }
        });

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 0, 0));
        label3.setText("Diagnosis Information");

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Diagnosis List");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(402, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(364, 364, 364))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        diagTable.setBackground(new java.awt.Color(255, 255, 255));
        diagTable.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        diagTable.setForeground(new java.awt.Color(0, 0, 0));
        diagTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Patient Id", "Patient Name", "Symptoms", "Diagnosis", "Medicine"
            }
        ));
        diagTable.setRowHeight(30);
        diagTable.setRowMargin(2);
        diagTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        diagTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        diagTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diagTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(diagTable);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
            .addGap(0, 27, Short.MAX_VALUE)
        );

        patName.setBackground(new java.awt.Color(255, 255, 255));
        patName.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        patName.setForeground(new java.awt.Color(0, 0, 0));
        patName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Name:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Diagnosis:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Medicines:");

        Patid.setBackground(new java.awt.Color(255, 255, 255));
        Patid.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Patid.setForeground(new java.awt.Color(0, 0, 0));
        Patid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- select --" }));
        Patid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatidActionPerformed(evt);
            }
        });

        patMed.setBackground(new java.awt.Color(255, 255, 255));
        patMed.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        patMed.setForeground(new java.awt.Color(0, 0, 0));

        patSum.setBackground(new java.awt.Color(255, 255, 255));
        patSum.setColumns(20);
        patSum.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        patSum.setForeground(new java.awt.Color(0, 0, 153));
        patSum.setRows(5);
        patSum.setTabSize(6);
        patSum.setText("                                   ----- Patient Summary -----\n\t===================================");
        patSum.setAutoscrolls(false);
        jScrollPane3.setViewportView(patSum);

        delbtn1.setBackground(new java.awt.Color(0, 0, 0));
        delbtn1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        delbtn1.setForeground(new java.awt.Color(255, 255, 255));
        delbtn1.setText("Clear");
        delbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delbtn1MouseClicked(evt);
            }
        });
        delbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbtn1ActionPerformed(evt);
            }
        });

        printbtn.setBackground(new java.awt.Color(0, 0, 0));
        printbtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        printbtn.setForeground(new java.awt.Color(255, 255, 255));
        printbtn.setText("Print");
        printbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printbtnMouseClicked(evt);
            }
        });
        printbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(diaId, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(patName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Patid, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(patSymp, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(patMed, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(patDiag, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                    .addComponent(printbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(delbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                    .addComponent(addbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(updbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(delbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(129, 129, 129))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5)))
                        .addGap(60, 60, 60))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(diaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(patSymp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel6))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(patDiag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(patMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(Patid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(patName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGap(26, 26, 26))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(addbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delbtn))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delbtn1)
                            .addComponent(printbtn))
                        .addGap(18, 18, 18)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void delbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delbtnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton6MouseClicked

    private void patNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patNameActionPerformed
        getPname();
    }//GEN-LAST:event_patNameActionPerformed

    private void PatidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatidActionPerformed
        getPname();
    }//GEN-LAST:event_PatidActionPerformed

    private void addbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseClicked
        if(diaId.getText().isEmpty()||Patid.getSelectedItem().toString().isEmpty()||patName.getText().isEmpty()||patSymp.getText().isEmpty()||patDiag.getText().isEmpty()||patMed.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Fill the relavent fields.");
        }else{
           try{
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanage","root","1234");
            
            String sql="insert into diagnosis values(?,?,?,?,?,?)";
            
            PreparedStatement add=conn.prepareStatement(sql);
            
            add.setInt(1,Integer.valueOf(diaId.getText()));
            add.setString(2,Patid.getSelectedItem().toString());
            add.setString(3,patName.getText());
            add.setString(4,patSymp.getText());
            add.setString(5,patDiag.getText());
            add.setString(6,patMed.getText());
            
            
            
            int row=add.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Diagnosis Added Succssfully.");
            
            SelectionClear();
            Selectional();
            clearText();
        
            conn.close();
            
                    
                    
        }catch(Exception e){
            e.printStackTrace();
        }
        }
        
    }//GEN-LAST:event_addbtnMouseClicked

    private void delbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delbtn1ActionPerformed

    private void delbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delbtn1MouseClicked
       clearText();
    }//GEN-LAST:event_delbtn1MouseClicked

    private void updbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updbtnMouseClicked
        
        
        if(diaId.getText().isEmpty()||Patid.getSelectedItem().toString().isEmpty()||patName.getText().isEmpty()||patSymp.getText().isEmpty()||patDiag.getText().isEmpty()||patMed.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Fill the relavent fields.");
        }else{
            
            try{
                
                conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanage","root","1234");
                String Id =diaId.getText();
                //String  sql="update doctor set docname='"+docName.getName()+",docexp="+docExp.getText()+",docpass="+docPass.getText()+"'"+"where docid="+docId.getText();
                
                String  sql="update diagnosis set patid='"+Patid.getSelectedItem().toString()+"',patname='"+patName.getText()+"',symptoms='"+patSymp.getText()+"',diagnosis='"+patDiag.getText()+"' where docid='"+diaId.getText()+"'";
                
                Statement st=conn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this,"Diagnosis Updated Successfully.");
                
                SelectionClear();
                Selectional();
                
                clearText();
                
            }catch(Exception e){
                e.printStackTrace();
            }
        
        }
    }//GEN-LAST:event_updbtnMouseClicked

    private void printbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printbtnMouseClicked
        try {
            patSum.print();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_printbtnMouseClicked

    private void printbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printbtnActionPerformed

    private void diagTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diagTableMouseClicked
        DefaultTableModel model=(DefaultTableModel)diagTable.getModel();
        int Myindex=diagTable.getSelectedRow();
        diaId.setText(model.getValueAt(Myindex,0).toString());
        Patid.setSelectedItem(model.getValueAt(Myindex,1).toString());
        patName.setText(model.getValueAt(Myindex,2).toString());
        patSymp.setText(model.getValueAt(Myindex,3).toString());
        patDiag.setText(model.getValueAt(Myindex,4).toString());
        patMed.setText(model.getValueAt(Myindex,5).toString());
        patSum.setText(patSum.getText()+"\n\n\t"+"1.Patient Name: "+patName.getText()+"\n\t"+"2.Symptoms: "+patSymp.getText()+"\n\t"+"3.Diagnosis: "+patDiag.getText()+"\n\t"+"4.Medicines: "+patMed.getText()+"\n\n\t ==================================="+"\n\t\t ABC Hospital"+"\n\t\t For a Better Life");
    }//GEN-LAST:event_diagTableMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diagnosis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Patid;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton delbtn;
    private javax.swing.JButton delbtn1;
    private javax.swing.JTextField diaId;
    private javax.swing.JTable diagTable;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private javax.swing.JTextField patDiag;
    private javax.swing.JTextField patMed;
    private javax.swing.JTextField patName;
    private javax.swing.JTextArea patSum;
    private javax.swing.JTextField patSymp;
    private javax.swing.JButton printbtn;
    private javax.swing.JButton updbtn;
    // End of variables declaration//GEN-END:variables
}
