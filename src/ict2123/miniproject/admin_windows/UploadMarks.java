/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ict2123.miniproject.admin_windows;

import ict2123.miniproject.AdminAccount;
import ict2123.miniproject.DbConnector;
import ict2123.miniproject.LecturerAccount;
import ict2123.miniproject.StudentAccount;
import ict2123.miniproject.TechnicalOfficerAccount;
import java.sql.*;
/**
 *
 * @author Joseph Rasanjana
 */
public class UploadMarks extends javax.swing.JFrame {

    String userName, userType;
    int userID;
    Connection conn;
    
    public UploadMarks(String uName, int uID, String uType) {
        
        this.userName = uName;
        this.userID = uID;
        this.userType = uType;
        
        initComponents();
        init();
    }

    private UploadMarks() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEndMarks = new javax.swing.JButton();
        btnMidMarks = new javax.swing.JButton();
        btnQuizMarks = new javax.swing.JButton();
        btnAssessmentMarks = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnEndMarks.setText("<html><center>Upload End<br>Exam Marks</center></html>");
        btnEndMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndMarksActionPerformed(evt);
            }
        });

        btnMidMarks.setText("<html><center>Upload Mid<br>Exam Marks</center></html>");
        btnMidMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMidMarksActionPerformed(evt);
            }
        });

        btnQuizMarks.setText("<html><center>Upload Quiz<br>Marks</center></html>");
        btnQuizMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuizMarksActionPerformed(evt);
            }
        });

        btnAssessmentMarks.setText("<html><center>Upload Assessment<br>Marks</center></html>");
        btnAssessmentMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssessmentMarksActionPerformed(evt);
            }
        });

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
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEndMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMidMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnQuizMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAssessmentMarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEndMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMidMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuizMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssessmentMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(215, 215, 215))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMidMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMidMarksActionPerformed
        UploadMidExamMarks marks = new UploadMidExamMarks(userName, userID, userType);
        marks.show();
        dispose();
    }//GEN-LAST:event_btnMidMarksActionPerformed

    private void btnAssessmentMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssessmentMarksActionPerformed
        UploadAssessmentMarks marks = new UploadAssessmentMarks(userName, userID, userType);
        marks.show();
        dispose();
    }//GEN-LAST:event_btnAssessmentMarksActionPerformed

    private void btnEndMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndMarksActionPerformed
        UploadEndExamMarks marks = new UploadEndExamMarks(userName, userID, userType);
        marks.show();
        dispose();
    }//GEN-LAST:event_btnEndMarksActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        if ("admin".equals(userType)) {
            AdminAccount admin = new AdminAccount(userName, userID);
            admin.show();
        } else if ("student".equals(userType)) {
            StudentAccount student = new StudentAccount(userName, userID);
            student.show();
        } else if ("lecturer".equals(userType)) {
            LecturerAccount lecturer = new LecturerAccount(userName, userID);
            lecturer.show();
        } else if ("technical_officer".equals(userType)) {
            TechnicalOfficerAccount to = new TechnicalOfficerAccount(userName, userID);
            to.show();
        }
        
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnQuizMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuizMarksActionPerformed
        UploadQuizMarks marks = new UploadQuizMarks(userName, userID, userType);
        marks.show();
        dispose();
    }//GEN-LAST:event_btnQuizMarksActionPerformed


    private void init(){
        setLocationRelativeTo(null);

        DbConnector DbCon = new DbConnector();
        conn = DbCon.getConnection();
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
            java.util.logging.Logger.getLogger(UploadMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UploadMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UploadMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UploadMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UploadMarks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssessmentMarks;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEndMarks;
    private javax.swing.JButton btnMidMarks;
    private javax.swing.JButton btnQuizMarks;
    // End of variables declaration//GEN-END:variables
}
