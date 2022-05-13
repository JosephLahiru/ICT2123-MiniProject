/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ict2123.miniproject;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joseph Rasanjana
 */
public class UpdateUser extends javax.swing.JFrame {

    Connection conn;
    String userName;

    public UpdateUser(String uName) {
        
        this.userName = uName;
        
        initComponents();
        init();
    }

    private UpdateUser() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLecturer = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        updateFieldCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNewValue = new javax.swing.JTextField();
        btnUpdateData = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblLecturer.setFont(new java.awt.Font("Segoe UI Emoji", 0, 48)); // NOI18N
        lblLecturer.setText("Update User Data");

        jLabel1.setText("Username : ");

        jLabel2.setText("Update Field Name : ");

        updateFieldCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "first name", "last name", "password", "address", "email", "dob", "contact number", "gender" }));

        jLabel3.setText("New Value : ");

        btnUpdateData.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnUpdateData.setText("Update Data");
        btnUpdateData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDataActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNewValue, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateFieldCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, 258, Short.MAX_VALUE)
                            .addComponent(txtUname, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(329, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLecturer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(58, 58, 58))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdateData)
                .addGap(318, 318, 318))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLecturer)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(updateFieldCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtNewValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addComponent(btnUpdateData)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDataActionPerformed
        String username, usertype, userid, updateField, newValue, tableName;

        username = txtUname.getText();
        try {
            usertype = username.split("_")[0];
            userid = username.split("_")[1];
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter a correct username !!!", "Warning !!!", JOptionPane.WARNING_MESSAGE);
            usertype = "none";
            userid = "none";
        }

        updateField = updateFieldCombo.getSelectedItem().toString().replace(" ", "_");
        newValue = txtNewValue.getText();

        if ("ADM".equals(usertype)) {
            tableName = "admin";
        } else if ("ST".equals(usertype)) {
            tableName = "student";
        } else if ("LEC".equals(usertype)) {
            tableName = "lecturer";
        } else if ("TO".equals(usertype)) {
            tableName = "technical_officer";
        } else {
            tableName = "none";
        }

        String update_query = "UPDATE " + tableName + " SET " + updateField + " = '" + newValue + "' WHERE id = '" + userid + "';";

        Statement st1 = null;
        try {
            st1 = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(CreateUser.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (!st1.execute(update_query)) {
                System.out.println(tableName + " table updated sucessfully.");
                JOptionPane.showMessageDialog(null, tableName + " Table Updated sucessfully !!!", "Sucess !!!", JOptionPane.INFORMATION_MESSAGE);
                clear_form();
            } else {
                System.out.println(tableName + " table update failed.");
                JOptionPane.showMessageDialog(null, tableName + " Table Update Failed !!!", "Error !!!", JOptionPane.ERROR_MESSAGE);
                clear_form();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateUser.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnUpdateDataActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        AdminAccount admin = new AdminAccount(userName);
        admin.show();
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void init() {
        setLocationRelativeTo(null);

        btnUpdateData.setFocusable(false);

        DbConnector DbCon = new DbConnector();
        conn = DbCon.getConnection();
    }

    private void clear_form() {
        txtNewValue.setText("");
        txtUname.setText("");
    }

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
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdateData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblLecturer;
    private javax.swing.JTextField txtNewValue;
    private javax.swing.JTextField txtUname;
    private javax.swing.JComboBox<String> updateFieldCombo;
    // End of variables declaration//GEN-END:variables
}
