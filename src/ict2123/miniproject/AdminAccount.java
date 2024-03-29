package ict2123.miniproject;

import ict2123.miniproject.admin_windows.ViewNotice;
import ict2123.miniproject.admin_windows.ViewTimetable;
import ict2123.miniproject.admin_windows.UpdateNotice;
import ict2123.miniproject.admin_windows.ViewCourse;
import ict2123.miniproject.admin_windows.CreateNotice;
import ict2123.miniproject.admin_windows.CreateCourse;
import ict2123.miniproject.admin_windows.CreateUser;
import ict2123.miniproject.admin_windows.UpdateUser;
import ict2123.miniproject.admin_windows.UpdateCourse;
import ict2123.miniproject.admin_windows.UpdateTimetable;
import ict2123.miniproject.admin_windows.CreateTimetable;
import ict2123.miniproject.admin_windows.ViewUser;
import java.awt.Image;
import java.sql.*;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Joseph Rasanjana
 */
public class AdminAccount extends javax.swing.JFrame {

    private String userName;
    private int userId;
    private Connection conn;
    private ImageIcon format = null;

    public AdminAccount(String uName, int uID) {

        this.userName = uName;
        this.userId = uID;

        initComponents();
        init();
    }

    private AdminAccount() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreateUser = new javax.swing.JButton();
        btnUpdateUser = new javax.swing.JButton();
        btnCreateCourse = new javax.swing.JButton();
        btnUpdateCourse = new javax.swing.JButton();
        btnCreateNotice = new javax.swing.JButton();
        btnUpdateNotice = new javax.swing.JButton();
        btnCreateTimetable = new javax.swing.JButton();
        btnUpdateTimetable = new javax.swing.JButton();
        lblAdmin = new javax.swing.JLabel();
        lblAdminName = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnViewUser = new javax.swing.JButton();
        btnViewCourse = new javax.swing.JButton();
        btnViewNotice = new javax.swing.JButton();
        btnViewTimetable = new javax.swing.JButton();
        lblPropic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnCreateUser.setText("Create User");
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        btnUpdateUser.setText("Update User");
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });

        btnCreateCourse.setText("Create Course");
        btnCreateCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCourseActionPerformed(evt);
            }
        });

        btnUpdateCourse.setText("Update Course");
        btnUpdateCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCourseActionPerformed(evt);
            }
        });

        btnCreateNotice.setText("Create Notice");
        btnCreateNotice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNoticeActionPerformed(evt);
            }
        });

        btnUpdateNotice.setText("Update Notice");
        btnUpdateNotice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateNoticeActionPerformed(evt);
            }
        });

        btnCreateTimetable.setText("Create Timetable");
        btnCreateTimetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateTimetableActionPerformed(evt);
            }
        });

        btnUpdateTimetable.setText("Update Timetable");
        btnUpdateTimetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTimetableActionPerformed(evt);
            }
        });

        lblAdmin.setFont(new java.awt.Font("Segoe UI Emoji", 0, 48)); // NOI18N
        lblAdmin.setText("Welcome Admin");

        lblAdminName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblAdminName.setText("Current Admin  : ");

        btnLogout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnViewUser.setText("View User");
        btnViewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUserActionPerformed(evt);
            }
        });

        btnViewCourse.setText("View Course");
        btnViewCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCourseActionPerformed(evt);
            }
        });

        btnViewNotice.setText("View Notice");
        btnViewNotice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewNoticeActionPerformed(evt);
            }
        });

        btnViewTimetable.setText("View Timetable");
        btnViewTimetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTimetableActionPerformed(evt);
            }
        });

        lblPropic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ict2123/miniproject/not-found.png"))); // NOI18N
        lblPropic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblPropic, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAdmin)
                .addGap(93, 93, 93)
                .addComponent(btnLogout)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAdminName)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnViewUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdateUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(btnCreateUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCreateCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdateCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(btnViewCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCreateNotice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdateNotice, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(btnViewNotice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdateTimetable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCreateTimetable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewTimetable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPropic, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAdmin)
                            .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addComponent(lblAdminName)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreateCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreateNotice, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreateTimetable, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdateCourse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdateNotice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdateTimetable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdateUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnViewTimetable, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(btnViewNotice, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(btnViewUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateNoticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNoticeActionPerformed
        CreateNotice notice = new CreateNotice(userName, userId);
        notice.show();
        dispose();
    }//GEN-LAST:event_btnCreateNoticeActionPerformed

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        CreateUser user = new CreateUser(userName, userId);
        user.show();
        dispose();
    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
        UpdateUser update = new UpdateUser(userName, userId);
        update.show();
        dispose();
    }//GEN-LAST:event_btnUpdateUserActionPerformed

    private void btnCreateCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCourseActionPerformed
        CreateCourse course = new CreateCourse(userName, userId);
        course.show();
        dispose();
    }//GEN-LAST:event_btnCreateCourseActionPerformed

    private void btnUpdateCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCourseActionPerformed
        UpdateCourse update = new UpdateCourse(userName, userId, "admin");
        update.show();
        dispose();
    }//GEN-LAST:event_btnUpdateCourseActionPerformed

    private void btnUpdateNoticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateNoticeActionPerformed
        UpdateNotice update = new UpdateNotice(userName, userId);
        update.show();
        dispose();
    }//GEN-LAST:event_btnUpdateNoticeActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Login login = new Login();
        login.show();
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnViewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUserActionPerformed
        ViewUser user = new ViewUser(userName, userId);
        user.show();
        dispose();
    }//GEN-LAST:event_btnViewUserActionPerformed

    private void btnViewCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCourseActionPerformed
        ViewCourse course = new ViewCourse(userName, userId, "admin");
        course.show();
        dispose();
    }//GEN-LAST:event_btnViewCourseActionPerformed

    private void btnViewNoticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewNoticeActionPerformed
        ViewNotice notice = new ViewNotice(userName, userId, "admin");
        notice.show();
        dispose();
    }//GEN-LAST:event_btnViewNoticeActionPerformed

    private void btnCreateTimetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateTimetableActionPerformed
        CreateTimetable timetable = new CreateTimetable(userName, userId);
        timetable.show();
        dispose();
    }//GEN-LAST:event_btnCreateTimetableActionPerformed

    private void btnViewTimetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTimetableActionPerformed
        ViewTimetable timetable = new ViewTimetable(userName, userId, "admin");
        timetable.show();
        dispose();
    }//GEN-LAST:event_btnViewTimetableActionPerformed

    private void btnUpdateTimetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTimetableActionPerformed
        UpdateTimetable table = new UpdateTimetable(userName, userId);
        table.show();
        dispose();
    }//GEN-LAST:event_btnUpdateTimetableActionPerformed

    private void init() {
        setLocationRelativeTo(null);
        btnLogout.setFocusable(false);

        DbConnector DbCon = new DbConnector();
        conn = DbCon.getConnection();

        try {
            retrieve_pro_pic();
        } catch (SQLException ex) {
            Logger.getLogger(AdminAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblAdminName.setText("Current Admin : " + userName);
    }

    private void retrieve_pro_pic() throws SQLException {

        String propic_query = "SELECT pro_pic FROM admin WHERE id = " + userId + ";";

        Statement st2 = conn.createStatement();
        ResultSet result2 = st2.executeQuery(propic_query);

        while (result2.next()) {
            byte[] pro_pic_data = result2.getBytes("pro_pic");
            if (Objects.nonNull(pro_pic_data)) {
                format = new ImageIcon(pro_pic_data);
                Image mm = format.getImage();
                Image img2 = mm.getScaledInstance(lblPropic.getWidth(), lblPropic.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(img2);
                lblPropic.setIcon(image);
            }
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
            java.util.logging.Logger.getLogger(AdminAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateCourse;
    private javax.swing.JButton btnCreateNotice;
    private javax.swing.JButton btnCreateTimetable;
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdateCourse;
    private javax.swing.JButton btnUpdateNotice;
    private javax.swing.JButton btnUpdateTimetable;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JButton btnViewCourse;
    private javax.swing.JButton btnViewNotice;
    private javax.swing.JButton btnViewTimetable;
    private javax.swing.JButton btnViewUser;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblAdminName;
    private javax.swing.JLabel lblPropic;
    // End of variables declaration//GEN-END:variables
}
