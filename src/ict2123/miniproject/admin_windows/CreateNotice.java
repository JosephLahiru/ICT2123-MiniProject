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

/**
 *
 * @author Joseph Rasanjana
 */
public class CreateNotice extends javax.swing.JFrame {

    private Connection conn;
    private String userName;
    private int userID;
    
    public CreateNotice() {
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

        jLabel1 = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        lblFname = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        txtNoticeTopic = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaNoticeBody = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 48)); // NOI18N
        jLabel1.setText("Create Notice");

        lblType.setText("Notice Topic : ");

        lblFname.setText("Notice Body : ");

        btnCreate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCreate.setText("Submit");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        areaNoticeBody.setColumns(20);
        areaNoticeBody.setRows(5);
        jScrollPane1.setViewportView(areaNoticeBody);

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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCreate)
                .addGap(356, 356, 356))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFname)
                    .addComponent(lblType))
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNoticeTopic, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblType)
                    .addComponent(txtNoticeTopic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFname)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnCreate)
                .addGap(100, 100, 100))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        String notice_topic, notice_body;
        
        notice_topic = txtNoticeTopic.getText();
        notice_body = areaNoticeBody.getText();
        
        if(!notice_topic.isEmpty() && !notice_body.isEmpty()){
            String user_query = "INSERT INTO notice (notice_topic, notice_body)"
                    + "VALUES('" + notice_topic + "', '" + notice_body + "');";
            
            Statement st1 = null;
            try {
                st1 = conn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(CreateNotice.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                if(!st1.execute(user_query)){
                    System.out.println("Inserted data to notie table sucessfully.");
                    JOptionPane.showMessageDialog(null, "Notice Created Sucessfully !!!", "Sucess !!!", JOptionPane.INFORMATION_MESSAGE);
                    clear_form();
                }else{
                    System.out.println("Notice table data insertion failed.");
                    JOptionPane.showMessageDialog(null, "Notice Creation Failed !!!", "Error !!!", JOptionPane.ERROR_MESSAGE);
                    clear_form();
                }
            } catch (SQLException ex) {
                Logger.getLogger(CreateNotice.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Fields can not be empty !!!", "Warning !!!", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        AdminAccount admin = new AdminAccount();
        admin.setUserNname(userName);
        admin.setUserID(userID);
        admin.init();
        admin.show();
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    public void init(){
        setLocationRelativeTo(null);
        btnCreate.setFocusable(false);

        DbConnector DbCon = new DbConnector();
        conn = DbCon.getConnection();
    }
    
    private void clear_form(){
        txtNoticeTopic.setText("");
        areaNoticeBody.setText("");
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
            java.util.logging.Logger.getLogger(CreateNotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateNotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateNotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateNotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateNotice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaNoticeBody;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFname;
    private javax.swing.JLabel lblType;
    private javax.swing.JTextField txtNoticeTopic;
    // End of variables declaration//GEN-END:variables
}
