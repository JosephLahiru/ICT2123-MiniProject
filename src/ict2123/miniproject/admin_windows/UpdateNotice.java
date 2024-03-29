/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ict2123.miniproject.admin_windows;

import ict2123.miniproject.AdminAccount;
import ict2123.miniproject.DbConnector;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joseph Rasanjana
 */
public class UpdateNotice extends javax.swing.JFrame {

    private Connection conn;
    private String userName;
    private int userID;

    public UpdateNotice(String uName, int uID) {
        
        this.userName = uName;
        this.userID = uID;
        
        initComponents();
        init();
    }

    private UpdateNotice() {
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
        txtNoticeId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        updateFieldCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNewValue = new javax.swing.JTextField();
        btnUpdateData = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        noticeTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblLecturer.setFont(new java.awt.Font("Segoe UI Emoji", 0, 48)); // NOI18N
        lblLecturer.setText("Update Notice Data");

        jLabel1.setText("Notice ID : ");

        jLabel2.setText("Update Field Name : ");

        updateFieldCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "notice topic", "notice body" }));

        jLabel3.setText("New Value : ");

        btnUpdateData.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnUpdateData.setText("Update Data");
        btnUpdateData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDataActionPerformed(evt);
            }
        });

        noticeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Notice ID", "Create Time", "Notice Topic", "Notice Body"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(noticeTable);
        if (noticeTable.getColumnModel().getColumnCount() > 0) {
            noticeTable.getColumnModel().getColumn(0).setResizable(false);
            noticeTable.getColumnModel().getColumn(0).setPreferredWidth(5);
            noticeTable.getColumnModel().getColumn(1).setResizable(false);
            noticeTable.getColumnModel().getColumn(2).setResizable(false);
            noticeTable.getColumnModel().getColumn(2).setPreferredWidth(20);
            noticeTable.getColumnModel().getColumn(3).setResizable(false);
        }

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLecturer)
                        .addGap(162, 162, 162)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(156, Short.MAX_VALUE)
                                .addComponent(btnUpdateData)
                                .addGap(140, 140, 140))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNewValue, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updateFieldCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, 258, Short.MAX_VALUE)
                                    .addComponent(txtNoticeId, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblLecturer)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNoticeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(updateFieldCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtNewValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(230, 230, 230)
                        .addComponent(btnUpdateData))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDataActionPerformed
        String notice_id, updateField, newValue;

        notice_id = txtNoticeId.getText();
        if (!notice_id.isEmpty()) {

            updateField = updateFieldCombo.getSelectedItem().toString().replace(" ", "_");
            newValue = txtNewValue.getText();

            String update_query = "UPDATE notice SET " + updateField + " = '" + newValue + "' WHERE id = '" + notice_id + "';";

            Statement st1 = null;
            try {
                st1 = conn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(CreateUser.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                if (!st1.execute(update_query)) {
                    System.out.println("notice table updated sucessfully.");
                    JOptionPane.showMessageDialog(null, "notice Table Updated sucessfully !!!", "Sucess !!!", JOptionPane.INFORMATION_MESSAGE);
                    clear_form();
                    populate_table();
                } else {
                    System.out.println("notice table update failed.");
                    JOptionPane.showMessageDialog(null, "notice Table Update Failed !!!", "Error !!!", JOptionPane.ERROR_MESSAGE);
                    clear_form();
                }
            } catch (SQLException ex) {
                Logger.getLogger(CreateUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please fill all the fields !!!", "Warning !!!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateDataActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        AdminAccount admin = new AdminAccount(userName, userID);
        admin.show();
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void init() {
        setLocationRelativeTo(null);

        btnUpdateData.setFocusable(false);

        DbConnector DbCon = new DbConnector();
        conn = DbCon.getConnection();

        try {
            populate_table();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateNotice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void clear_form() {
        txtNewValue.setText("");
        txtNoticeId.setText("");
    }

    private void populate_table() throws SQLException {

        DefaultTableModel tblModel = (DefaultTableModel) noticeTable.getModel();
        tblModel.setRowCount(0);
        
        String get_notice = "SELECT * FROM notice;";

        Statement st2 = conn.createStatement();
        ResultSet result2 = st2.executeQuery(get_notice);

        while (result2.next()) {
            int id = result2.getInt("id");
            String create_time = result2.getString("create_time");
            String notice_topic = result2.getString("notice_topic");
            String notice_body = result2.getString("notice_body");

            String table_data[] = {Integer.toString(id), create_time, notice_topic, notice_body};

            tblModel.addRow(table_data);
        }
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
            java.util.logging.Logger.getLogger(UpdateNotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateNotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateNotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateNotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateNotice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdateData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLecturer;
    private javax.swing.JTable noticeTable;
    private javax.swing.JTextField txtNewValue;
    private javax.swing.JTextField txtNoticeId;
    private javax.swing.JComboBox<String> updateFieldCombo;
    // End of variables declaration//GEN-END:variables
}
