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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Joseph Rasanjana
 */
public class UploadEndExamMarks extends javax.swing.JFrame {

    private String userName, userType;
    private int userID;
    private Connection conn;

    public UploadEndExamMarks(String uName, int uID, String uType) {

        this.userName = uName;
        this.userID = uID;
        this.userType = uType;

        initComponents();
        init();
    }

    private UploadEndExamMarks() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboStudent = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboCourse = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        scoreEndTheory = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        scoreEndPractical = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Upload End Exam Marks");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setText("Choose Student : ");

        jLabel4.setText("Course ID : ");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel6.setText("End theory score : ");

        jLabel7.setText("End practical score : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(115, 115, 115)
                .addComponent(btnBack)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboStudent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboCourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scoreEndTheory, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scoreEndPractical, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnSubmit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(scoreEndTheory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(scoreEndPractical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnSubmit)
                .addGap(150, 150, 150))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String stu_id = comboStudent.getSelectedItem().toString().split(":")[0];
        String course_id = comboCourse.getSelectedItem().toString().split(":")[0];
        String theory_score = scoreEndTheory.getText();
        String practical_score = scoreEndPractical.getText();
        
        if(theory_score.length()<=0){
            theory_score = "0";
        }
        if(practical_score.length()<=0){
            practical_score = null;
        }
        
        String insert_end_marks = "INSERT INTO end_exam_marks VALUES('" + stu_id + "', '" + course_id + "'," + theory_score
                + "," + practical_score + ");";
        
            Statement st1 = null;
            try {
                st1 = conn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(CreateUser.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                if (!st1.execute(insert_end_marks)) {
                    System.out.println("Data Inserted to end exam sucessfully.");
                    JOptionPane.showMessageDialog(null, "Data Inserted to end exam sucessfully !!!", "Sucess !!!", JOptionPane.INFORMATION_MESSAGE);
                    clear_form();
                } else {
                    System.out.println("Data Insertion to end exam failed.");
                    JOptionPane.showMessageDialog(null, "Data Insertion to end exam Failed !!!", "Error !!!", JOptionPane.ERROR_MESSAGE);
                    clear_form();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "This student data already exists !!!", "Warning !!!", JOptionPane.WARNING_MESSAGE);
                //Logger.getLogger(CreateUser.class.getName()).log(Level.SEVERE, null, ex);
                clear_form();
            }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void init() {
        try {
            setLocationRelativeTo(null);
            
            DbConnector DbCon = new DbConnector();
            conn = DbCon.getConnection();
            
            String get_user_data = "SELECT id, first_name FROM student;";
            
            Statement st2 = conn.createStatement();
            ResultSet result2 = st2.executeQuery(get_user_data);
            
            while (result2.next()) {
                int id = result2.getInt("id");
                String first_name = result2.getString("first_name");
                
                comboStudent.addItem(Integer.toString(id) + ":" + first_name);
            }
            
            String get_course_data = "SELECT id, course_id FROM course;";
            
            Statement st3 = conn.createStatement();
            ResultSet result3 = st3.executeQuery(get_course_data);
            
            while (result3.next()) {
                int id = result3.getInt("id");
                String course_id = result3.getString("course_id");
                
                comboCourse.addItem(Integer.toString(id) + ":" + course_id);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UploadEndExamMarks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void clear_form() {
        scoreEndTheory.setText("");
        scoreEndPractical.setText("");
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
            java.util.logging.Logger.getLogger(UploadEndExamMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UploadEndExamMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UploadEndExamMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UploadEndExamMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new UploadEndExamMarks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> comboCourse;
    private javax.swing.JComboBox<String> comboStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField scoreEndPractical;
    private javax.swing.JTextField scoreEndTheory;
    // End of variables declaration//GEN-END:variables

}
