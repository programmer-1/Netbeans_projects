
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;


public class Student_Databse_main extends javax.swing.JFrame {

   
    public Student_Databse_main() {
        initComponents();
    }

  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JTextField_Roll_No = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTextField_First_Name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTextField_Last_Name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTextField_Ranking = new javax.swing.JTextField();
        JTextField_Average = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JTextField_Total_Marks = new javax.swing.JTextField();
        JComboBox_Sec = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JTextField_Maths = new javax.swing.JTextField();
        JTextField_OOPs = new javax.swing.JTextField();
        JTextField_DS = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        JTextField_CE = new javax.swing.JTextField();
        JTextField_DPSD = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        JBtn_Exit = new javax.swing.JButton();
        JBtn_Delete = new javax.swing.JButton();
        JBtn_Rank = new javax.swing.JButton();
        JBtn_Reset1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        JBtn_Report = new javax.swing.JButton();

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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Result System");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4), "Student DataBase", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Roll No:");

        JTextField_Roll_No.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("First Name:");

        JTextField_First_Name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JTextField_First_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_First_NameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Last Name:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Sec:");

        JTextField_Last_Name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JTextField_Last_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_Last_NameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Average:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Status");

        JTextField_Ranking.setEditable(false);
        JTextField_Ranking.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        JTextField_Average.setEditable(false);
        JTextField_Average.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Total Marks:");

        JTextField_Total_Marks.setEditable(false);
        JTextField_Total_Marks.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        JComboBox_Sec.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JComboBox_Sec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sec A", "Sec B" }));
        JComboBox_Sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBox_SecActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("D.S");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("OOPs");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Maths");

        JTextField_Maths.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JTextField_Maths.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextField_MathsKeyTyped(evt);
            }
        });

        JTextField_OOPs.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JTextField_OOPs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_OOPsActionPerformed(evt);
            }
        });
        JTextField_OOPs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextField_OOPsKeyTyped(evt);
            }
        });

        JTextField_DS.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JTextField_DS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_DSActionPerformed(evt);
            }
        });
        JTextField_DS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextField_DSKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("C.E.");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("DPSD");

        JTextField_CE.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JTextField_CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_CEActionPerformed(evt);
            }
        });
        JTextField_CE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextField_CEKeyTyped(evt);
            }
        });

        JTextField_DPSD.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JTextField_DPSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_DPSDActionPerformed(evt);
            }
        });
        JTextField_DPSD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextField_DPSDKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextField_Average, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(JTextField_Total_Marks)
                            .addComponent(JTextField_Ranking)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(96, 96, 96)
                        .addComponent(JComboBox_Sec, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(JTextField_Roll_No, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTextField_First_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(JTextField_Last_Name))))))
                .addGap(29, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTextField_CE, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextField_DPSD, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextField_Maths, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextField_OOPs, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextField_DS, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTextField_Roll_No, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(JTextField_DS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(JTextField_OOPs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextField_First_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(JTextField_Last_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JComboBox_Sec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextField_Total_Marks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextField_Average, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextField_Ranking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(56, 56, 56))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextField_Maths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextField_CE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextField_DPSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 670, 490));

        jTable2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Roll No.", "Sec", "D.B.", "OOPs", "Maths", "CE", "DPSD", "Total", "Average", "Ranking"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 1060, 90));

        JBtn_Exit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBtn_Exit.setText("Exit");
        JBtn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn_ExitActionPerformed(evt);
            }
        });
        getContentPane().add(JBtn_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 610, 130, -1));

        JBtn_Delete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBtn_Delete.setText("Delete");
        JBtn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn_DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(JBtn_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 610, 130, -1));

        JBtn_Rank.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBtn_Rank.setText("Rank");
        JBtn_Rank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn_RankActionPerformed(evt);
            }
        });
        getContentPane().add(JBtn_Rank, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 120, -1));

        JBtn_Reset1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBtn_Reset1.setText("Reset");
        JBtn_Reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn_Reset1ActionPerformed(evt);
            }
        });
        getContentPane().add(JBtn_Reset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 610, 130, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4), "Repot", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 390, 490));

        JBtn_Report.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBtn_Report.setText("Report");
        JBtn_Report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn_ReportActionPerformed(evt);
            }
        });
        getContentPane().add(JBtn_Report, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 610, 130, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JComboBox_SecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBox_SecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBox_SecActionPerformed

    private void JTextField_First_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_First_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_First_NameActionPerformed

    private void JTextField_OOPsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_OOPsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_OOPsActionPerformed

    private void JTextField_DPSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_DPSDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_DPSDActionPerformed

    private void JTextField_Last_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_Last_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_Last_NameActionPerformed

    private void JTextField_CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_CEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_CEActionPerformed

    private void JBtn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn_DeleteActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        
        if(jTable2.getSelectedRow() == -1)
        {
            if(jTable2.getRowCount() == 0)
            {
                JOptionPane.showMessageDialog(null, "No data To Delete ","Student DataBase" ,JOptionPane.OK_OPTION);
            }
            else
                JOptionPane.showMessageDialog(null, "Select Record to Delete ","Student DataBase" ,JOptionPane.OK_OPTION);                 
        }
        else
            model.removeRow(jTable2.getSelectedRow());
    }//GEN-LAST:event_JBtn_DeleteActionPerformed
private JFrame frame;
    private void JBtn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn_ExitActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Do you want to exit?", "Student DataBase", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_JBtn_ExitActionPerformed

    private void JBtn_RankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn_RankActionPerformed
        
        try {
            FileWriter Fw = null;
            BufferedWriter Bw = null;
            PrintWriter out = null;
            
            double[] Result = new double[14];
            Result[0] = Double.parseDouble(JTextField_DS.getText());
            Result[1] = Double.parseDouble(JTextField_OOPs.getText());
            Result[2] = Double.parseDouble(JTextField_Maths.getText());
            Result[3] = Double.parseDouble(JTextField_DPSD.getText());
            Result[4] = Double.parseDouble(JTextField_CE.getText());
            
            Result[5] = Result[0]+Result[1]+Result[2]+Result[3]+Result[4];
            Result[6]= Result[5]/5;
            
            String Average = String.format("%.0f", Result[6]);
            JTextField_Average.setText(Average);
            
            String Total = String.format("%.0f", Result[5]);
            JTextField_Total_Marks.setText(Total);
            
            if(Result[5] >= 450)
            {
                JTextField_Ranking.setText("Excellent");
            }
            else if(Result[5] >= 400)
            {
                JTextField_Ranking.setText("Good");
            }
            else if(Result[5] >= 300)
            {
                JTextField_Ranking.setText("Not Bad");
            }
            else if(Result[5] < 300)
            {
                JTextField_Ranking.setText("Must Concentrate on Studies");
            }
            
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.addRow(new Object[]{
                
                JTextField_Roll_No.getText(),
                JComboBox_Sec.getSelectedItem(),
                JTextField_DS.getText(),
                JTextField_OOPs.getText(),
                JTextField_Maths.getText(),
                JTextField_CE.getText(),
                JTextField_DPSD.getText(),
                JTextField_Total_Marks.getText(),
                JTextField_Average.getText(),
                JTextField_Ranking.getText()
            });
            Fw = new FileWriter("D:\\New folder (2)\\Student_Info.txt",true);
            Bw = new BufferedWriter(Fw);
            out =new PrintWriter(Bw); 
           SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy_hh:mm:ss");
            Date date = new Date();
            String StrDate = sdf.format(date);
            
                String Student_Info = (
                        JTextField_Roll_No.getText()+" "+
                        JComboBox_Sec.getSelectedItem()+" "+
                        JTextField_DS.getText()+" "+
                        JTextField_OOPs.getText()+" "+
                        JTextField_Maths.getText()+" "+
                        JTextField_CE.getText()+" "+
                        JTextField_DPSD.getText()+" "+
                        JTextField_Total_Marks.getText()+" "+
                        JTextField_Average.getText()+" "+
                        JTextField_Ranking.getText()+" "
                       + StrDate);
            out.println(Student_Info);
            out.close(); 
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Student_Databse_main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_JBtn_RankActionPerformed

    private void JBtn_Reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn_Reset1ActionPerformed
       JTextField temp = null;
        for(Component c:jPanel1.getComponents())
        {
            if(c.getClass().toString().contains("javax.swing.JTextField"))
            {
                temp = (JTextField)c;
                temp.setText(null);
            }
        }
        jTextArea1.setText(null);
    }//GEN-LAST:event_JBtn_Reset1ActionPerformed

    private void JBtn_ReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn_ReportActionPerformed
       jTextArea1.append("********Student Report********\n\n"
       +"***********************************\n"
       +"\nData Structure                         : "+JTextField_DS.getText()
       +"\nObject Oriented Programmning    : "+JTextField_OOPs.getText()
       +"\nDiscrete Mathematics                : "+JTextField_Maths.getText()
       +"\nCommunication Engineering         : "+JTextField_CE.getText()
       +"\nDigital principle System Design    : "+JTextField_DPSD.getText()
       );
       double[] Result = new double[14];
        Result[0] = Double.parseDouble(JTextField_DS.getText());
        Result[1] = Double.parseDouble(JTextField_OOPs.getText());
        Result[2] = Double.parseDouble(JTextField_Maths.getText());
        Result[3] = Double.parseDouble(JTextField_DPSD.getText());
        Result[4] = Double.parseDouble(JTextField_CE.getText());
        
        Result[5] = Result[0]+Result[1]+Result[2]+Result[3]+Result[4];
        Result[6]= Result[5]/5;
        
        String Average = String.format("%.0f", Result[6]);
        JTextField_Average.setText(Average);
        
        String Total = String.format("%.0f", Result[5]);
        
        
        
        JTextField_Total_Marks.setText(Total);
       jTextArea1.append(
       "\n\nTotal\t"+JTextField_Total_Marks.getText() 
       +"\nAverage :\t"+JTextField_Average.getText()        
               );
    }//GEN-LAST:event_JBtn_ReportActionPerformed

    private void JTextField_DSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_DSActionPerformed

    }//GEN-LAST:event_JTextField_DSActionPerformed

    private void JTextField_DSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextField_DSKeyTyped
        char number = evt.getKeyChar();
        if(!(Character.isDigit(number))||(number == KeyEvent.VK_BACK_SPACE)|| (number == KeyEvent.VK_DELETE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_JTextField_DSKeyTyped

    private void JTextField_OOPsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextField_OOPsKeyTyped
       
        char number = evt.getKeyChar();
        if(!(Character.isDigit(number))||(number == KeyEvent.VK_BACK_SPACE)|| (number == KeyEvent.VK_DELETE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_JTextField_OOPsKeyTyped

    private void JTextField_MathsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextField_MathsKeyTyped
        
        char number = evt.getKeyChar();
        if(!(Character.isDigit(number))||(number == KeyEvent.VK_BACK_SPACE)|| (number == KeyEvent.VK_DELETE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_JTextField_MathsKeyTyped

    private void JTextField_CEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextField_CEKeyTyped
         
        char number = evt.getKeyChar();
        if(!(Character.isDigit(number))||(number == KeyEvent.VK_BACK_SPACE)|| (number == KeyEvent.VK_DELETE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_JTextField_CEKeyTyped

    private void JTextField_DPSDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextField_DPSDKeyTyped
         
        char number = evt.getKeyChar();
        if(!(Character.isDigit(number))||(number == KeyEvent.VK_BACK_SPACE)|| (number == KeyEvent.VK_DELETE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_JTextField_DPSDKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
       
        UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
        java.awt.EventQueue.invokeLater(() -> {
            new Student_Databse_main().setVisible(true);
        });
        FileReader Fr = null;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtn_Delete;
    private javax.swing.JButton JBtn_Exit;
    private javax.swing.JButton JBtn_Rank;
    private javax.swing.JButton JBtn_Report;
    private javax.swing.JButton JBtn_Reset1;
    private javax.swing.JComboBox<String> JComboBox_Sec;
    private javax.swing.JTextField JTextField_Average;
    private javax.swing.JTextField JTextField_CE;
    private javax.swing.JTextField JTextField_DPSD;
    private javax.swing.JTextField JTextField_DS;
    private javax.swing.JTextField JTextField_First_Name;
    private javax.swing.JTextField JTextField_Last_Name;
    private javax.swing.JTextField JTextField_Maths;
    private javax.swing.JTextField JTextField_OOPs;
    private javax.swing.JTextField JTextField_Ranking;
    private javax.swing.JTextField JTextField_Roll_No;
    private javax.swing.JTextField JTextField_Total_Marks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
