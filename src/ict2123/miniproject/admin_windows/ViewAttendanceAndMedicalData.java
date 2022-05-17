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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joseph Rasanjana
 */
public class ViewAttendanceAndMedicalData extends javax.swing.JFrame {

    Connection conn;
    String userName, userType;
    int userID;
    DefaultTableModel tblModel;
    String data_type;
    String student;
    boolean overriden = false;

    public ViewAttendanceAndMedicalData(String uName, int uID, String uType) {
        this.userName = uName;
        this.userID = uID;
        this.userType = uType;

        initComponents();
        init();
    }

    public ViewAttendanceAndMedicalData(String uName, int uID, String uType, String student) {
        this.userName = uName;
        this.userID = uID;
        this.userType = uType;
        this.student = student;
        overriden = true;

        initComponents();
        init();
    }

    private ViewAttendanceAndMedicalData() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        comboType = new javax.swing.JComboBox<>();
        btnLoadData = new javax.swing.JButton();
        comboStudent = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(dataTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("<html><center>Attendance and<br>Medical Data</center></html>");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        comboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "medical", "attendance" }));

        btnLoadData.setText("Load Data");
        btnLoadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadDataActionPerformed(evt);
            }
        });

        comboStudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Students" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)
                        .addComponent(btnBack))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(comboStudent, javax.swing.GroupLayout.Alignment.LEADING, 0, 109, Short.MAX_VALUE)
                                    .addComponent(comboType, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btnLoadData)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addComponent(comboType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoadData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
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

    private void btnLoadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadDataActionPerformed

        data_type = comboType.getSelectedItem().toString().toLowerCase().replace(" ", "_");

        if (!overriden) {
            student = comboStudent.getSelectedItem().toString().toLowerCase().replace(" ", "_").split(":")[0];
        }

        if ("medical".equals(data_type)) {
            tblModel.setColumnCount(0);
            tblModel.addColumn("Medical ID");
            tblModel.addColumn("Student ID");
            tblModel.addColumn("Issued Date");
        } else if ("attendance".equals(data_type)) {
            tblModel.setColumnCount(0);
            tblModel.addColumn("Student ID");
            tblModel.addColumn("Course ID");
            tblModel.addColumn("Type");
            tblModel.addColumn("Date");
            tblModel.addColumn("Status");
        }

        try {
            load_data();
        } catch (SQLException ex) {
            Logger.getLogger(ViewAttendanceAndMedicalData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoadDataActionPerformed

    private void init() {

        setLocationRelativeTo(null);

        DbConnector DbCon = new DbConnector();
        conn = DbCon.getConnection();

        if (overriden) {
            comboStudent.hide();
        } else {
            try {
                String get_user_data = "SELECT id, first_name FROM student;";

                Statement st2 = conn.createStatement();
                ResultSet result2 = st2.executeQuery(get_user_data);

                while (result2.next()) {
                    int id = result2.getInt("id");
                    String first_name = result2.getString("first_name");

                    comboStudent.addItem(Integer.toString(id) + ":" + first_name);
                }

                //load_data();
            } catch (SQLException ex) {
                Logger.getLogger(ViewAttendanceAndMedicalData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        tblModel = (DefaultTableModel) dataTable.getModel();
        tblModel.setRowCount(0);
    }

    private void load_data() throws SQLException {
        tblModel.setRowCount(0);
        if ("medical".equals(data_type)) {

            String get_user_data = null;
            if ("all_students".equals(student)) {
                get_user_data = "SELECT * FROM medicals;";
            } else {
                get_user_data = "SELECT * FROM medicals WHERE stu_id=" + student + ";";
            }

            Statement st2 = conn.createStatement();
            ResultSet result2 = st2.executeQuery(get_user_data);

            while (result2.next()) {
                int medical_id = result2.getInt("medical_id");
                int stu_id = result2.getInt("stu_id");
                String issue_date = result2.getString("issue_date");

                String table_data[] = {Integer.toString(medical_id), Integer.toString(stu_id), issue_date};

                tblModel.addRow(table_data);
            }
        } else if ("attendance".equals(data_type)) {

            String get_user_data = null;
            if ("all_students".equals(student)) {
                get_user_data = "SELECT * FROM attendance;";
            } else {
                get_user_data = "SELECT * FROM attendance WHERE stu_id=" + student + ";";
            }

            Statement st2 = conn.createStatement();
            ResultSet result2 = st2.executeQuery(get_user_data);

            while (result2.next()) {
                int stu_id = result2.getInt("stu_id");
                int course_id = result2.getInt("course_id");
                String type = result2.getString("type");
                String date = result2.getString("date");
                String status = result2.getString("status");

                String table_data[] = {Integer.toString(stu_id), Integer.toString(course_id), type, date, status};

                tblModel.addRow(table_data);
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
            java.util.logging.Logger.getLogger(ViewAttendanceAndMedicalData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAttendanceAndMedicalData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAttendanceAndMedicalData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAttendanceAndMedicalData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ViewAttendanceAndMedicalData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLoadData;
    private javax.swing.JComboBox<String> comboStudent;
    private javax.swing.JComboBox<String> comboType;
    private javax.swing.JTable dataTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
