package ict2123.miniproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login{
    
    private JFrame window;
    private JPanel panel;
    private JPanel panel2;
    private JPanel panel3;
    
    private JPanel panel4;
    private JPanel panel5;
    
    private JButton button;
    private JLabel labelTopic;
    private JLabel labelUname;
    private JLabel labelPwd;
    private JTextField textFieldUname;
    private JPasswordField textFieldPwd;
    
    Connection conn;
    
    String password;
    String userName;
    
    public Login(){
        try {
            initialize();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void initialize() throws ClassNotFoundException, SQLException{
        window = new JFrame();
        window.setTitle("Login");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(800, 500);
        window.setResizable(false);
        window.setLayout(new BorderLayout(10, 10));
        window.getContentPane().setBackground(Color.LIGHT_GRAY);
        window.setLocationRelativeTo(null);
        
        panel = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        
        panel4 = new JPanel();
        panel5 = new JPanel();
        
        panel.setBackground(Color.GRAY);
        panel2.setBackground(Color.LIGHT_GRAY);
        panel3.setBackground(Color.LIGHT_GRAY);
        
        panel4.setBackground(Color.LIGHT_GRAY);
        panel5.setBackground(Color.LIGHT_GRAY);
        
        panel2.setLayout(new GridLayout(2, 2, 10, 10));
        
        window.add(panel, BorderLayout.NORTH);
        window.add(panel2, BorderLayout.CENTER);
        window.add(panel3, BorderLayout.SOUTH);
        
        window.add(panel4, BorderLayout.EAST);
        window.add(panel5, BorderLayout.WEST);

        labelTopic = new JLabel("Login");
        labelTopic.setHorizontalTextPosition(SwingConstants.CENTER);
        labelTopic.setVerticalTextPosition(SwingConstants.BOTTOM);
        panel.add(labelTopic);
        
        labelTopic.setForeground(Color.white);
        labelTopic.setFont(new Font("Sans-serif", Font.BOLD, 36));
        
        ImageIcon labelIcon = new ImageIcon(this.getClass().getResource("logo.png"));
        labelTopic.setIcon(labelIcon);
        
        labelUname = new JLabel("Username : ");
        labelUname.setForeground(Color.black);
        labelUname.setFont(new Font("Sans-serif", Font.BOLD, 36));
        
        
        labelPwd = new JLabel("Password : ");
        labelPwd.setForeground(Color.black);
        labelPwd.setFont(new Font("Sans-serif", Font.BOLD, 36));

        textFieldUname = createTextField();
        panel2.add(labelUname);
        panel2.add(textFieldUname);
        
        textFieldPwd = new JPasswordField(10);
        textFieldPwd.setFont(new Font("Arial", Font.BOLD, 24));
        textFieldPwd.setForeground(Color.GRAY);
        textFieldPwd.setMargin(new Insets(5, 10, 5, 10));
        textFieldPwd.setEchoChar('*');
        
        panel2.add(labelPwd);
        panel2.add(textFieldPwd);
        
        button = createButton();
        panel3.add(button);
        
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "";
        String db_query = "use ICT2123;";
        
        Class.forName("com.mysql.cj.jdbc.Driver");

        conn = DriverManager.getConnection(url, user, password);
        if(conn != null)
            System.out.println("Connected");

        Statement st1 = conn.createStatement();

        if(!st1.execute(db_query)){
            System.out.println("Databse selected sucessfully.");
        }else{
            System.out.println("Databse selected failed.");
        }
    }

    private JButton createButton() {
        JButton button = new JButton("Login");
        button.setFocusable(false);
        
        button.setFont(new Font("Arial", Font.PLAIN, 24));
        button.setMargin(new Insets(10, 10, 10, 10));
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                userName = textFieldUname.getText();
                char pwd[] = textFieldPwd.getPassword();
                password = new String(pwd);
                
                if(userName.length()<=0){
                    JOptionPane.showMessageDialog(null, "User Name cannot be empty !!!", "Warning !!!", JOptionPane.WARNING_MESSAGE);
                }else if(password.length()<=0){
                    JOptionPane.showMessageDialog(null, "Password cannot be empty !!!", "Warning !!!", JOptionPane.WARNING_MESSAGE);
                }else{
                    boolean status=false;
                    try {
                        status = checkAccount(userName, password);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    if(status==true){
                        System.out.println("HELLO USER, WELCOME!!");
                    }else{
                        JOptionPane.showMessageDialog(null, "User credentials incorrect,\n Please try again !!!", "Warning !!!", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        });
        
        return button;
    }
    
    public JTextField createTextField(){
        JTextField textfield = new JTextField(10);
        
        textfield.setFont(new Font("Arial", Font.BOLD, 24));
        textfield.setForeground(Color.GRAY);
        textfield.setToolTipText("Enter your user name.");
        textfield.setMargin(new Insets(5, 10, 5, 10));
        
        return textfield;
    }
    
    public boolean checkAccount(String uname, String pwd) throws ClassNotFoundException, SQLException{
        
        boolean status = false;
        int check_id;
        String chek_type;
        
        try{
            check_id = Integer.parseInt(uname.split("_")[1]);
            chek_type = uname.split("_")[0];

        }catch(ArrayIndexOutOfBoundsException e){
            check_id = -99999;
            chek_type = "none";
        }
        
        String user_query = "SELECT id, user_type, password FROM user;";

        Statement st2 = conn.createStatement();
        ResultSet result = st2.executeQuery(user_query);

        while(result.next()){
            int id = result.getInt("id");
            String type = result.getString("user_type");
            String pswd = result.getString("password");
            
            if((id==check_id) && (pswd.equals(pwd)) && (chek_type.equals(type))){
                status = true;
                break;
            }
        }
        
        return status;
    }
    
    public void show(){
        this.window.setVisible(true);
    }
    
}
