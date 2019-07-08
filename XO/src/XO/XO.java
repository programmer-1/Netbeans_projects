/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XO;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class XO extends javax.swing.JFrame {

    private String Start_Game = "X";
    private int X_Count = 0;
    private int O_Count = 0;
    /**
     * Creates new form XO
     */
    public XO() {
        initComponents();
        setSize(1200,600);
        setLocationRelativeTo(null);
    }
    private void Game_Score()
    {
        jLabel4.setText(String.valueOf(X_Count));
        jLabel5.setText(String.valueOf(O_Count));
    }
    private void Choose_Player()
    {
        if(Start_Game.equalsIgnoreCase("X"))
        {
            Start_Game = "O";
        }
        else
        {
            Start_Game = "X";
        }
    }
    private void Validation()
    {
        String B1 = jButton1.getText();
        String B2 = jButton2.getText();
        String B3 = jButton3.getText();
        
        String B4 = jButton4.getText();
        String B5 = jButton5.getText();
        String B6 = jButton6.getText();
        
        String B7 = jButton7.getText();
        String B8 = jButton8.getText();
        String B9 = jButton9.getText();
        
        if(B1 == ("X") && B2 == ("X") && B3 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Wins","XO",JOptionPane.INFORMATION_MESSAGE);
            X_Count++;
            Game_Score();
            jButton1.setBackground(Color.GREEN);
            jButton2.setBackground(Color.GREEN);
            jButton3.setBackground(Color.GREEN);
        }
        if(B4 == ("X") && B5 == ("X") && B6 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Wins","XO",JOptionPane.INFORMATION_MESSAGE);
            X_Count++;
            Game_Score();
            jButton4.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton6.setBackground(Color.GREEN);
        }
        if(B7 == ("X") && B8 == ("X") && B9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Wins","XO",JOptionPane.INFORMATION_MESSAGE);
            X_Count++;
            Game_Score();
            jButton7.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
        }
        if(B1 == ("X") && B4 == ("X") && B7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Wins","XO",JOptionPane.INFORMATION_MESSAGE);
            X_Count++;
            Game_Score();
            jButton1.setBackground(Color.GREEN);
            jButton4.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
        }
        if(B2 == ("X") && B5 == ("X") && B8 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Wins","XO",JOptionPane.INFORMATION_MESSAGE);
            X_Count++;
            Game_Score();
            jButton2.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
        }
        if(B3 == ("X") && B6 == ("X") && B9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Wins","XO",JOptionPane.INFORMATION_MESSAGE);
            X_Count++;
            Game_Score();
            jButton3.setBackground(Color.GREEN);
            jButton6.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
        }
        if(B1 == ("X") && B5 == ("X") && B9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Wins","XO",JOptionPane.INFORMATION_MESSAGE);
            X_Count++;
            Game_Score();
            jButton1.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
        }
        if(B3 == ("X") && B5 == ("X") && B7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Wins","XO",JOptionPane.INFORMATION_MESSAGE);
            X_Count++;
            Game_Score();
            jButton3.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
        }
        if(B1 == ("O") && B2 == ("O") && B3 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Wins","XO",JOptionPane.INFORMATION_MESSAGE);
            O_Count++;
            Game_Score();
            jButton1.setBackground(Color.GREEN);
            jButton2.setBackground(Color.GREEN);
            jButton3.setBackground(Color.GREEN);
        }
        if(B4 == ("O") && B5 == ("O") && B6 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Wins","XO",JOptionPane.INFORMATION_MESSAGE);
            O_Count++;
            Game_Score();
            jButton4.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton6.setBackground(Color.GREEN);
        }
        if(B7 == ("O") && B8 == ("O") && B9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Wins","XO",JOptionPane.INFORMATION_MESSAGE);
            O_Count++;
            Game_Score();
            jButton7.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
        }
        if(B1 == ("O") && B4 == ("O") && B7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Wins","XO",JOptionPane.INFORMATION_MESSAGE);
            O_Count++;
            Game_Score();
            jButton1.setBackground(Color.GREEN);
            jButton4.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
        }
        if(B2 == ("O") && B5 == ("O") && B8 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Wins","XO",JOptionPane.INFORMATION_MESSAGE);
            O_Count++;
            Game_Score();
            jButton2.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
        }
        if(B3 == ("O") && B6 == ("O") && B9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Wins","XO",JOptionPane.INFORMATION_MESSAGE);
            O_Count++;
            Game_Score();
            jButton3.setBackground(Color.GREEN);
            jButton6.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
        }
        if(B1 == ("O") && B5 == ("O") && B9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Wins","XO",JOptionPane.INFORMATION_MESSAGE);
            O_Count++;
            Game_Score();
            jButton1.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
        }
        if(B3 == ("O") && B5 == ("O") && B7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Wins","XO",JOptionPane.INFORMATION_MESSAGE);
            O_Count++;
            Game_Score();
            jButton3.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLable_Player_X = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel_Player_O = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jButton_Exit = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jButton_Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("XO");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("XO");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLable_Player_X.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLable_Player_X.setText("Player X:");
        jPanel6.add(jLable_Player_X, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jLabel4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel_Player_O.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_Player_O.setText("Player O:");
        jPanel11.add(jLabel_Player_O, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(jLabel5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jButton_Exit.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton_Exit.setText("Exit");
        jButton_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExitActionPerformed(evt);
            }
        });
        jPanel16.add(jButton_Exit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jButton_Reset.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton_Reset.setText("Reset");
        jButton_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ResetActionPerformed(evt);
            }
        });
        jPanel18.add(jButton_Reset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel18);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private JFrame jframe;
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jButton1.setText(Start_Game);
                
        if(Start_Game.equalsIgnoreCase("X"))
        {
            jButton1.setForeground(Color.RED);
        }
        else
        {
            jButton1.setForeground(Color.BLUE);
        }
        
        Choose_Player();
        Validation();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExitActionPerformed
       jframe = new JFrame("Exit");
       if(JOptionPane.showConfirmDialog(jframe,"Do you want to Exit?","XO",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
       {
           System.exit(0);
       }
    }//GEN-LAST:event_jButton_ExitActionPerformed

    private void jButton_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ResetActionPerformed
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButton_ResetActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(Start_Game);
                
        if(Start_Game.equalsIgnoreCase("X"))
        {
            jButton2.setForeground(Color.RED);
        }
        else
        {
            jButton2.setForeground(Color.BLUE);
        }
        Choose_Player();
        Validation();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(Start_Game);
                
        if(Start_Game.equalsIgnoreCase("X"))
        {
            jButton3.setForeground(Color.RED);
        }
        else
        {
            jButton3.setForeground(Color.BLUE);
        }
        Choose_Player();
        Validation();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(Start_Game);
                
        if(Start_Game.equalsIgnoreCase("X"))
        {
            jButton4.setForeground(Color.RED);
        }
        else
        {
            jButton4.setForeground(Color.BLUE);
        }
        Choose_Player();
        Validation();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(Start_Game);
                
        if(Start_Game.equalsIgnoreCase("X"))
        {
            jButton5.setForeground(Color.RED);
        }
        else
        {
            jButton5.setForeground(Color.BLUE);
        }
        Choose_Player();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(Start_Game);
                
        if(Start_Game.equalsIgnoreCase("X"))
        {
            jButton6.setForeground(Color.RED);
        }
        else
        {
            jButton6.setForeground(Color.BLUE);
        }
        Choose_Player();
        Validation();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(Start_Game);
                
        if(Start_Game.equalsIgnoreCase("X"))
        {
            jButton7.setForeground(Color.RED);
        }
        else
        {
            jButton7.setForeground(Color.BLUE);
        }
        Choose_Player();
        Validation();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(Start_Game);
                
        if(Start_Game.equalsIgnoreCase("X"))
        {
            jButton8.setForeground(Color.RED);
        }
        else
        {
            jButton8.setForeground(Color.BLUE);
        }
        Choose_Player();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(Start_Game);
                
        if(Start_Game.equalsIgnoreCase("X"))
        {
            jButton9.setForeground(Color.RED);
        }
        else
        {
            jButton9.setForeground(Color.BLUE);
        }
        Choose_Player();
        Validation();
    }//GEN-LAST:event_jButton9ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new XO().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton_Exit;
    private javax.swing.JButton jButton_Reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_Player_O;
    private javax.swing.JLabel jLable_Player_X;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
