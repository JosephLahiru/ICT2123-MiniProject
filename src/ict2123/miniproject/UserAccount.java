package ict2123.miniproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class UserAccount {

    String userName;
    String type, fname, lname, pswd, address, email, dob, contact, gender;
    int id;

    private JFrame window;
    private JLabel topic;
    private JLabel table;
    private JPanel panel;

    Connection conn;

    public UserAccount(String userName) {
        this.userName = userName;
        try {
            initialize_db();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserAccount.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
        initiate();
    }

    private void initiate() {
        window = new JFrame();
        window.setTitle("User Account");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(800, 500);
        window.setResizable(false);
        window.setLayout(new BorderLayout(10, 10));
        window.getContentPane().setBackground(Color.LIGHT_GRAY);
        window.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        window.add(panel, BorderLayout.CENTER);

        topic = new JLabel();
        topic.setFont(new Font("Sans-serif", Font.BOLD, 36));
        topic.setText("Welcome " + userName);
        topic.setHorizontalTextPosition(SwingConstants.CENTER);
        topic.setVerticalTextPosition(SwingConstants.BOTTOM);
        panel.add(topic);

        table = new JLabel();
        table.setFont(new Font("Sans-serif", Font.PLAIN, 12));
        table.setText("<html><table border='1'>"
                + "<tr><th>ID</th><th>User Type</th><th>First Name</th><th>Last Name</th><th>Password</th><th>Address</th><th>Email</th><th>DOB</th><th>Contact Number</th><th>Gender</th></tr>"
                + "<tr><td>" + Integer.toString(id) + "</td><td>" + type + "</td><td>" + fname + "</td><td>" + lname + "</td><td>" + pswd + "</td><td>" + address + "</td><td>" + email + "</td><td>" + dob + "</td><td>" + contact + "</td><td>" + gender + "</td></tr>"
                + "</table></html>");
        panel.add(table);

    }

    private void initialize_db() throws ClassNotFoundException, SQLException {

        DbConnector DbCon = new DbConnector();
        conn = DbCon.getConnection();
        
        String user_query = "SELECT * FROM user WHERE id=" + userName.split("_")[1] + ";";
        
        System.out.println(user_query);

        Statement st2 = conn.createStatement();
        ResultSet result = st2.executeQuery(user_query);

        while (result.next()) {
            id = result.getInt("id");
            type = result.getString("user_type");
            fname = result.getString("first_name");
            lname = result.getString("last_name");
            pswd = result.getString("password");
            address = result.getString("address");
            email = result.getString("email");
            dob = result.getString("dob");
            contact = result.getString("contact_number");
            gender = result.getString("gender");
        }
    }

    public void show() {
        this.window.setVisible(true);
    }

}
