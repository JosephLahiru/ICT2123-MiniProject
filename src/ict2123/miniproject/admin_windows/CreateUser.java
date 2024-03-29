/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ict2123.miniproject.admin_windows;

import ict2123.miniproject.AdminAccount;
import ict2123.miniproject.DbConnector;
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
public class CreateUser extends javax.swing.JFrame {

    private Connection conn;
    private String userName, img_path;
    private int userID;
    private FileInputStream image_input = null;
    private ImageIcon format = null;
    private File file;

    public CreateUser(String uName, int uID) {

        this.userName = uName;
        this.userID = uID;

        initComponents();
        init();
    }

    private CreateUser() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        lblFname = new javax.swing.JLabel();
        lblLname = new javax.swing.JLabel();
        lblPwd = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCreateUser = new javax.swing.JButton();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        comboType = new javax.swing.JComboBox<>();
        comboGender = new javax.swing.JComboBox<>();
        pwd = new javax.swing.JPasswordField();
        pwdCom = new javax.swing.JPasswordField();
        btnBack = new javax.swing.JButton();
        lblProPic = new javax.swing.JLabel();
        btnSelectPropic = new javax.swing.JButton();
        lblDepartment = new javax.swing.JLabel();
        comboDepartment = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 48)); // NOI18N
        jLabel1.setText("Create User");

        lblType.setText("User Type : ");

        lblFname.setText("First Name : ");

        lblLname.setText("Last Name : ");

        lblPwd.setText("Password : ");

        lblAddress.setText("Address : ");

        lblEmail.setText("Email : ");

        lblDob.setText("Contact Number : ");

        lblContact.setText("Date of Birth : ");

        lblGender.setText("Gender : ");

        jLabel2.setText("Comfirm Password : ");

        btnCreateUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCreateUser.setText("Submit");
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        comboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Student", "Lecturer", "Technical Officer" }));

        comboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblProPic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        btnSelectPropic.setText("<html><center>Select Profile<br>Picture</center></html>");
        btnSelectPropic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectPropicActionPerformed(evt);
            }
        });

        lblDepartment.setText("Department : ");

        comboDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ICT", "ET", "BT" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCreateUser)
                .addGap(356, 356, 356))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFname)
                    .addComponent(lblType)
                    .addComponent(lblLname)
                    .addComponent(lblPwd)
                    .addComponent(lblAddress)
                    .addComponent(lblEmail)
                    .addComponent(lblDob)
                    .addComponent(lblContact)
                    .addComponent(lblGender)
                    .addComponent(jLabel2)
                    .addComponent(lblDepartment))
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFname)
                    .addComponent(txtLname)
                    .addComponent(txtAddress)
                    .addComponent(txtEmail)
                    .addComponent(txtContact)
                    .addComponent(txtDob)
                    .addComponent(comboType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pwd)
                    .addComponent(pwdCom)
                    .addComponent(comboDepartment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSelectPropic, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(lblProPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(69, 69, 69))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblType)
                            .addComponent(comboType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFname)
                            .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLname)
                            .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDob)
                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblContact)
                            .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGender)
                            .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDepartment)
                            .addComponent(comboDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPwd)
                            .addComponent(pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(pwdCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(btnCreateUser))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(lblProPic, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSelectPropic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        String type, _type, fname, lname, _pwd, com_pwd, address, email, dob, contact, gender, _gender, department;

        type = comboType.getSelectedItem().toString().toLowerCase().replace(' ', '_');
        fname = txtFname.getText();
        lname = txtLname.getText();
        _pwd = new String(pwd.getPassword());
        com_pwd = new String(pwdCom.getPassword());
        address = txtAddress.getText();
        email = txtEmail.getText();
        dob = txtDob.getText();
        contact = txtContact.getText();
        gender = (String) comboGender.getSelectedItem();
        department = comboDepartment.getSelectedItem().toString().toLowerCase();

        if ("Male".equals(gender)) {
            _gender = "M";
        } else if ("Female".equals(gender)) {
            _gender = "F";
        } else {
            _gender = "O";
        }

        if (_pwd.equals(com_pwd)) {

            Statement st1 = null;
            try {
                st1 = conn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(CreateUser.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {

                PreparedStatement ps = conn.prepareStatement("insert into " + type + "(first_name, last_name, "
                        + "pro_pic, password, address, email, dob, contact_number, gender, department) "
                        + "VALUES(?,?,?,?,?,?,?,?,?,?)");

                ps.setString(1, fname);
                ps.setString(2, lname);
                
                if (Objects.nonNull(file)) {
                    ps.setBinaryStream(3, (InputStream) image_input, (int) file.length());
                }else{
                    ps.setNull(3, WIDTH);
                }
                ps.setString(4, _pwd);
                ps.setString(5, address);
                ps.setString(6, email);
                ps.setString(7, dob);
                ps.setString(8, contact);
                ps.setString(9, _gender);
                ps.setString(10, department);

                if (!ps.execute()) {
                    System.out.println("Inserted data to user table sucessfully.");
                    JOptionPane.showMessageDialog(null, "User Created Sucessfully !!!", "Sucess !!!", JOptionPane.INFORMATION_MESSAGE);
                    clear_form();
                    ps.close();
                } else {
                    System.out.println("User table data insertion failed.");
                    JOptionPane.showMessageDialog(null, "User Creation Failed !!!", "Error !!!", JOptionPane.ERROR_MESSAGE);
                    clear_form();
                    ps.close();
                }

            } catch (SQLException ex) {
                Logger.getLogger(CreateUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Password and Comfirm Password must match !!!", "Warning !!!", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        AdminAccount admin = new AdminAccount(userName, userID);
        admin.show();
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSelectPropicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectPropicActionPerformed
        JFileChooser filechooser = new JFileChooser();

        filechooser.setCurrentDirectory(new File("."));
        int response = filechooser.showOpenDialog(null);

        if (response == JFileChooser.APPROVE_OPTION) {
            img_path = filechooser.getSelectedFile().getAbsolutePath();
            System.out.println(img_path);
            load_pro_pic();
            file = new File(img_path);
            try {
                image_input = new FileInputStream(file);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CreateUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSelectPropicActionPerformed

    private void init() {
        setLocationRelativeTo(null);
        btnCreateUser.setFocusable(false);

        DbConnector DbCon = new DbConnector();
        conn = DbCon.getConnection();
    }

    private void clear_form() {
        txtFname.setText("");
        txtLname.setText("");
        pwd.setText("");
        pwdCom.setText("");
        txtAddress.setText("");
        txtEmail.setText("");
        txtDob.setText("");
        txtContact.setText("");
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
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JButton btnSelectPropic;
    private javax.swing.JComboBox<String> comboDepartment;
    private javax.swing.JComboBox<String> comboGender;
    private javax.swing.JComboBox<String> comboType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFname;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLname;
    private javax.swing.JLabel lblProPic;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblType;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JPasswordField pwdCom;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    // End of variables declaration//GEN-END:variables
}
