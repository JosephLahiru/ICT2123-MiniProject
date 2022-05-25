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
public class UpdateUser extends javax.swing.JFrame {

    private Connection conn;
    private String userName, currentUserType;
    private int userID;

    public UpdateUser() {
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

        lblLecturer = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        updateFieldCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNewValue = new javax.swing.JTextField();
        btnUpdateData = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        btnLoaddata = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        userTypeCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblLecturer.setFont(new java.awt.Font("Segoe UI Emoji", 0, 48)); // NOI18N
        lblLecturer.setText("Update User Data");

        jLabel1.setText("Username : ");

        jLabel2.setText("Update Field Name : ");

        updateFieldCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "first name", "last name", "password", "address", "email", "dob", "contact number", "gender", "department" }));

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

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Password", "Address", "Email", "DOB", "Contact Number", "Gender", "Department"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userTable);
        if (userTable.getColumnModel().getColumnCount() > 0) {
            userTable.getColumnModel().getColumn(0).setResizable(false);
            userTable.getColumnModel().getColumn(0).setPreferredWidth(5);
            userTable.getColumnModel().getColumn(1).setResizable(false);
            userTable.getColumnModel().getColumn(2).setResizable(false);
            userTable.getColumnModel().getColumn(3).setResizable(false);
            userTable.getColumnModel().getColumn(4).setResizable(false);
            userTable.getColumnModel().getColumn(5).setResizable(false);
            userTable.getColumnModel().getColumn(6).setResizable(false);
            userTable.getColumnModel().getColumn(7).setResizable(false);
            userTable.getColumnModel().getColumn(8).setResizable(false);
        }

        btnLoaddata.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnLoaddata.setText("Load Data");
        btnLoaddata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoaddataActionPerformed(evt);
            }
        });

        jLabel4.setText("User Type :");

        userTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "student", "lecturer", "technical officer" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLecturer)
                .addGap(183, 183, 183)
                .addComponent(btnBack)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnLoaddata)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateData))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNewValue, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateFieldCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, 258, Short.MAX_VALUE)
                            .addComponent(txtUname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userTypeCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLecturer))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(userTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdateData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLoaddata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))))
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

        if (!"none".equals(tableName)) {
            currentUserType = tableName;
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
                populate_table();
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
        AdminAccount admin = new AdminAccount();
        admin.setUserNname(userName);
        admin.setUserID(userID);
        admin.init();
        admin.show();
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLoaddataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoaddataActionPerformed
        currentUserType = userTypeCombo.getSelectedItem().toString().replace(" ", "_");

        try {
            populate_table();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoaddataActionPerformed

    public void init() {
        setLocationRelativeTo(null);

        btnUpdateData.setFocusable(false);

        DbConnector DbCon = new DbConnector();
        conn = DbCon.getConnection();
    }

    private void clear_form() {
        txtNewValue.setText("");
        txtUname.setText("");
    }

    private void populate_table() throws SQLException {

        DefaultTableModel tblModel = (DefaultTableModel) userTable.getModel();
        tblModel.setRowCount(0);
        
        String department = null;

        String get_notice = "SELECT * FROM " + currentUserType + ";";

        Statement st2 = conn.createStatement();
        ResultSet result2 = st2.executeQuery(get_notice);

        while (result2.next()) {
            int id = result2.getInt("id");
            String first_name = result2.getString("first_name");
            String last_name = result2.getString("last_name");
            String password = result2.getString("password");
            String address = result2.getString("address");
            String email = result2.getString("email");
            String dob = result2.getString("dob");
            String contact_number = result2.getString("contact_number");
            String gender = result2.getString("gender");
            if (!"admin".equals(currentUserType)) {
                department = result2.getString("department");
            }
            
            String table_data[] = {Integer.toString(id), first_name, last_name, password, address, email, dob, contact_number, gender, department};

            tblModel.addRow(table_data);
        }
    }
    
    public void setUserNname(String uName){
        this.userName = uName;
    }

    public void setUserID(int uID){
        this.userID = uID;
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
    private javax.swing.JButton btnLoaddata;
    private javax.swing.JButton btnUpdateData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLecturer;
    private javax.swing.JTextField txtNewValue;
    private javax.swing.JTextField txtUname;
    private javax.swing.JComboBox<String> updateFieldCombo;
    private javax.swing.JTable userTable;
    private javax.swing.JComboBox<String> userTypeCombo;
    // End of variables declaration//GEN-END:variables
}
