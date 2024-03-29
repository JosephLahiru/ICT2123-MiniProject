/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ict2123.miniproject.admin_windows;

import ict2123.miniproject.DbConnector;
import ict2123.miniproject.TechnicalOfficerAccount;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Joseph Rasanjana
 */
public class UpdateTO extends javax.swing.JFrame {

    private Connection conn;
    private String userName, img_path;
    private int userID;
    private FileInputStream image_input = null;
    private ImageIcon format = null;
    private File file;
    
    String tableName = "technical_officer";

    public UpdateTO(String uName, int uID) {

        this.userName = uName;
        this.userID = uID;

        initComponents();
        init();
    }

    private UpdateTO() {
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
        jLabel2 = new javax.swing.JLabel();
        updateFieldCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNewValue = new javax.swing.JTextField();
        btnUpdateData = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        lblContactNumber = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        lblDepartment = new javax.swing.JLabel();
        lblProPic = new javax.swing.JLabel();
        btnSelectPropic = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblLecturer.setFont(new java.awt.Font("Segoe UI Emoji", 0, 48)); // NOI18N
        lblLecturer.setText("Update TO Data");

        jLabel2.setText("Update Field Name : ");

        updateFieldCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "first name", "last name", "address", "email", "dob", "contact number", "gender", "department" }));

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

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID : ");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name : ");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password : ");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Last Name : ");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address : ");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email : ");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DOB : ");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contact Number : ");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Gender : ");

        lblId.setToolTipText("");

        jlabel.setForeground(new java.awt.Color(255, 255, 255));
        jlabel.setText("Department : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jlabel))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblContactNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblGender, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(lblDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblId))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblFirstName))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblLastName))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblPassword))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblAddress))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblEmail))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblDob))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblContactNumber))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblGender))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel)
                    .addComponent(lblDepartment))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblProPic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        btnSelectPropic.setText("<html><center>Update Profile<br>Picture</center></html>");
        btnSelectPropic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectPropicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addComponent(lblLecturer)
                .addGap(215, 215, 215)
                .addComponent(btnBack)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnUpdateData))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNewValue, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updateFieldCombo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblProPic, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSelectPropic, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(updateFieldCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtNewValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(lblProPic, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(btnSelectPropic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btnUpdateData)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDataActionPerformed
        String updateField, newValue;

        updateField = updateFieldCombo.getSelectedItem().toString().replace(" ", "_");
        newValue = txtNewValue.getText();

        String update_query = "UPDATE " + tableName + " SET " + updateField + " = '" + newValue + "' WHERE id = '" + userID + "';";

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
        TechnicalOfficerAccount to = new TechnicalOfficerAccount(userName, userID);
        to.show();
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSelectPropicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectPropicActionPerformed
        JFileChooser filechooser = new JFileChooser();

        filechooser.setCurrentDirectory(new File("."));
        int response = filechooser.showOpenDialog(null);

        if (response == JFileChooser.APPROVE_OPTION) {
            try {
                img_path = filechooser.getSelectedFile().getAbsolutePath();
                System.out.println(img_path);
                load_pro_pic();
                file = new File(img_path);
                try {
                    image_input = new FileInputStream(file);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(CreateUser.class.getName()).log(Level.SEVERE, null, ex);
                }

                PreparedStatement ps;

                ps = conn.prepareStatement("UPDATE " + tableName + " SET pro_pic = ? WHERE id = ?;");
                
                ps.setInt(2, userID);
                
                if (Objects.nonNull(file)) {
                    ps.setBinaryStream(1, (InputStream) image_input, (int) file.length());

                    if (!ps.execute()) {
                        System.out.println("Profile picture updated in user table sucessfully.");
                        JOptionPane.showMessageDialog(null, "Profile Picture Updated Sucessfully !!!", "Sucess !!!", JOptionPane.INFORMATION_MESSAGE);
                        clear_form();
                        ps.close();
                    } else {
                        System.out.println("Profile picture update failed.");
                        JOptionPane.showMessageDialog(null, "Profile Picture Update Failed !!!", "Error !!!", JOptionPane.ERROR_MESSAGE);
                        clear_form();
                        ps.close();
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(UpdateTO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSelectPropicActionPerformed

    private void init() {
        setLocationRelativeTo(null);

        btnUpdateData.setFocusable(false);

        DbConnector DbCon = new DbConnector();
        conn = DbCon.getConnection();

        try {
            populate_table();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateTO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void clear_form() {
        txtNewValue.setText("");
    }

    private void populate_table() throws SQLException {

        String get_notice = "SELECT * FROM " + tableName + " WHERE id=" + Integer.toString(userID) + ";";
        //System.out.println(Integer.toString(userID));

        Statement st2 = conn.createStatement();
        ResultSet result2 = st2.executeQuery(get_notice);

        while (result2.next()) {
            String first_name = result2.getString("first_name");
            String last_name = result2.getString("last_name");
            String password = result2.getString("password");
            String address = result2.getString("address");
            String email = result2.getString("email");
            String dob = result2.getString("dob");
            String contact_number = result2.getString("contact_number");
            String gender = result2.getString("gender");
            String department = result2.getString("department");
            byte[] pro_pic_data = result2.getBytes("pro_pic");
            
            if (Objects.nonNull(pro_pic_data)) {
                format = new ImageIcon(pro_pic_data);
                Image mm = format.getImage();
                Image img2 = mm.getScaledInstance(lblProPic.getWidth(), lblProPic.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(img2);
                lblProPic.setIcon(image);
            }

            lblId.setForeground(Color.white);
            lblFirstName.setForeground(Color.white);
            lblLastName.setForeground(Color.white);
            lblPassword.setForeground(Color.white);
            lblAddress.setForeground(Color.white);
            lblEmail.setForeground(Color.white);
            lblDob.setForeground(Color.white);
            lblContactNumber.setForeground(Color.white);
            lblGender.setForeground(Color.white);
            lblDepartment.setForeground(Color.white);

            lblId.setText(Integer.toString(userID));
            lblFirstName.setText(first_name);
            lblLastName.setText(last_name);
            lblPassword.setText(password);
            lblAddress.setText(address);
            lblEmail.setText(email);
            lblDob.setText(dob);
            lblContactNumber.setText(contact_number);
            lblGender.setText(gender);
            lblDepartment.setText(department);
        }
    }

    private void load_pro_pic() {
        format = new ImageIcon(img_path);
        Image mm = format.getImage();
        Image img2 = mm.getScaledInstance(lblProPic.getWidth(), lblProPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        lblProPic.setIcon(image);
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
            java.util.logging.Logger.getLogger(UpdateTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateTO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSelectPropic;
    private javax.swing.JButton btnUpdateData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLecturer;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblProPic;
    private javax.swing.JTextField txtNewValue;
    private javax.swing.JComboBox<String> updateFieldCombo;
    // End of variables declaration//GEN-END:variables
}
