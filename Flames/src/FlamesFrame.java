
import java.awt.TextField;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class FlamesFrame extends javax.swing.JFrame {

    /**
     * Creates new form FlamesFrame
     */
    public FlamesFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        result = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        yName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cName.setForeground(new java.awt.Color(51, 51, 51));
        cName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNameActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Claculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Flames");

        result.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Your Name : ");

        yName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yName.setForeground(new java.awt.Color(51, 51, 51));
        yName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Crush Name : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(result)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(208, 208, 208))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cName, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yName, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(yName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(result)
                .addGap(34, 34, 34)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jLabel1.getAccessibleContext().setAccessibleName("yourName");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String yourName = yName.getText().toLowerCase();
        String crushName = cName.getText().toLowerCase();
        int count = 0;
        char change = '*';
        if(yourName.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Enter Your Name");
            return;
        }
        else if(crushName.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Enter Your Crush Name");
            return;
        }
        for(int i = 0; i< yourName.length();i++)
        {
            for(int j = 0; j< crushName.length();j++)
            {
               if(crushName.charAt(j) != change)
               {
                   if(yourName.charAt(i) == crushName.charAt(j))
                   {
                     yourName = yourName.substring(0,i)+change+yourName.substring(i+1);
                     crushName = crushName.substring(0,j)+change+crushName.substring(j+1);
                     break;
                   }
               }
            }
        }
        for(int i = 0; i< yourName.length();i++)
        {
            if(yourName.charAt(i) != change)
            {
                count +=1;
            }
        }
        for(int i = 0; i< crushName.length();i++)
        {
            if(crushName.charAt(i) != change)
            {
                count +=1;
            }
        }
        
       String flames = "flames";
       int flamesCount = 1;
       int p = 0;
       for(int i = 0; i<5; i++)
       {   
           Boolean a = true;
           do{
                if(flames.charAt(p) == change)
                {
                   
                }
                else if(flamesCount == count-1)
                {
                    flames = flames.substring(0,p)+change+flames.substring(p+1);
                    a = false;
                }
                else
                {
                    flamesCount += 1;
                }
                if(p == 5)
                    p = 0;
                else
                {
                    p+=1;
                }
           }while(a);
       }
       for(int i = 0; i <= 5; i++)
       {
          if(flames.charAt(i) != change)
          {
              switch(flames.charAt(i))
              {
                  case 'f':
                      result.setText("Friend");
                  break;
                  case 'l':
                      result.setText("Love");
                  break;
                  case 'a':
                      result.setText("Affection");
                  break;
                  case 'm':
                      result.setText("Marriage");
                  break;
                  case 'e':
                      result.setText("Enemy");
                  break;
                  case 's':
                      result.setText("Sister");
                  break;
              }
          }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FlamesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlamesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlamesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlamesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlamesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel result;
    private javax.swing.JTextField yName;
    // End of variables declaration//GEN-END:variables
}