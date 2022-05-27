package ict2123.miniproject.admin_windows;

import ict2123.miniproject.AdminAccount;
import ict2123.miniproject.DbConnector;
import ict2123.miniproject.LecturerAccount;
import ict2123.miniproject.StudentAccount;
import ict2123.miniproject.TechnicalOfficerAccount;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joseph Rasanjana
 */
public class UpdateCourse extends javax.swing.JFrame {

    private Connection conn;
    private String userName, userType;
    private int userID;

    public UpdateCourse() {
        initComponents();
        init();
        try {
            populate_table();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateCourse.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        txtCourseId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        updateFieldCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNewValue = new javax.swing.JTextField();
        btnUpdateData = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        courseTable = new javax.swing.JTable();
        insertCourseData = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblLecturer.setFont(new java.awt.Font("Segoe UI Emoji", 0, 48)); // NOI18N
        lblLecturer.setText("Update Course Data");

        jLabel1.setText("Course ID : ");

        jLabel2.setText("Update Field Name : ");

        updateFieldCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "course name", "credit count" }));

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

        courseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Course Name", "Course ID", "Credit Count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(courseTable);
        if (courseTable.getColumnModel().getColumnCount() > 0) {
            courseTable.getColumnModel().getColumn(0).setResizable(false);
            courseTable.getColumnModel().getColumn(0).setPreferredWidth(5);
            courseTable.getColumnModel().getColumn(1).setResizable(false);
            courseTable.getColumnModel().getColumn(2).setResizable(false);
            courseTable.getColumnModel().getColumn(3).setResizable(false);
        }

        insertCourseData.setText("<html><center>Insert<br>Course<br>Materials</center></html>");
        insertCourseData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertCourseDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(lblLecturer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(btnUpdateData))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(insertCourseData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNewValue, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updateFieldCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, 258, Short.MAX_VALUE)
                                    .addComponent(txtCourseId, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLecturer)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCourseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(updateFieldCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtNewValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(insertCourseData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdateData))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDataActionPerformed
        String course_id, updateField, newValue, tableName;

        course_id = txtCourseId.getText();
        if (!course_id.isEmpty()) {

            updateField = updateFieldCombo.getSelectedItem().toString().replace(" ", "_");
            newValue = txtNewValue.getText();

            String update_query = "UPDATE course SET " + updateField + " = '" + newValue + "' WHERE course_id = '" + course_id + "';";

            Statement st1 = null;
            try {
                st1 = conn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(CreateUser.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                if (!st1.execute(update_query)) {
                    populate_table();
                    System.out.println("course table updated sucessfully.");
                    JOptionPane.showMessageDialog(null, "course Table Updated sucessfully !!!", "Sucess !!!", JOptionPane.INFORMATION_MESSAGE);
                    clear_form();
                } else {
                    System.out.println("course table update failed.");
                    JOptionPane.showMessageDialog(null, "course Table Update Failed !!!", "Error !!!", JOptionPane.ERROR_MESSAGE);
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
        if ("admin".equals(userType)) {
            AdminAccount admin = new AdminAccount();
            admin.setUserNname(userName);
            admin.setUserID(userID);
            admin.init();
            admin.show();
        } else if ("student".equals(userType)) {
            StudentAccount student = new StudentAccount();
            student.setUserNname(userName);
            student.setUserID(userID);
            student.init();
            student.show();
        } else if ("lecturer".equals(userType)) {
            LecturerAccount lecturer = new LecturerAccount();
            lecturer.setUserNname(userName);
            lecturer.setUserID(userID);
            lecturer.init();
            lecturer.show();
        } else if ("technical_officer".equals(userType)) {
            TechnicalOfficerAccount to = new TechnicalOfficerAccount();
            to.setUserNname(userName);
            to.setUserID(userID);
            to.init();
            to.show();
        }

        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void insertCourseDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertCourseDataActionPerformed
        UploadLectureMaterials materials = new UploadLectureMaterials();
        materials.setUserNname(userName);
        materials.setUserID(userID);
        materials.init();
        materials.show();
        
        dispose();
    }//GEN-LAST:event_insertCourseDataActionPerformed

    public void init() {
        setLocationRelativeTo(null);

        btnUpdateData.setFocusable(false);

        DbConnector DbCon = new DbConnector();
        conn = DbCon.getConnection();
    }

    private void clear_form() {
        txtNewValue.setText("");
        txtCourseId.setText("");
    }

    private void populate_table() throws SQLException {

        DefaultTableModel tblModel = (DefaultTableModel) courseTable.getModel();
        tblModel.setRowCount(0);

        String get_notice = "SELECT * FROM course;";

        Statement st2 = conn.createStatement();
        ResultSet result2 = st2.executeQuery(get_notice);

        while (result2.next()) {
            int id = result2.getInt("id");
            String course_name = result2.getString("course_name");
            String course_id = result2.getString("course_id");
            String credit_count = result2.getString("credit_count");

            String table_data[] = {Integer.toString(id), course_name, course_id, credit_count};

            tblModel.addRow(table_data);
        }
    }

    public void setUserNname(String uName) {
        this.userName = uName;
    }

    public void setUserID(int uID) {
        this.userID = uID;
    }

    public void setUserType(String uType) {
        this.userType = uType;
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
            java.util.logging.Logger.getLogger(UpdateCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdateData;
    private javax.swing.JTable courseTable;
    private javax.swing.JButton insertCourseData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLecturer;
    private javax.swing.JTextField txtCourseId;
    private javax.swing.JTextField txtNewValue;
    private javax.swing.JComboBox<String> updateFieldCombo;
    // End of variables declaration//GEN-END:variables
}
