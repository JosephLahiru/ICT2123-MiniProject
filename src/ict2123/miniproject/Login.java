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
    
    public Login(){
        initialize();
    }
    
    private void initialize(){
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
        
        labelUname = new JLabel("User Name : ");
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
    }

    private JButton createButton() {
        JButton button = new JButton("Login");
        button.setFocusable(false);
        
        button.setFont(new Font("Arial", Font.PLAIN, 24));
        button.setMargin(new Insets(10, 10, 10, 10));
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String userName = textFieldUname.getText();
                char pwd[] = textFieldPwd.getPassword();
                String password = new String(pwd);
                
                if(userName.length()<=0){
                    JOptionPane.showMessageDialog(null, "User Name cannot be empty !!!", "Warning !!!", JOptionPane.WARNING_MESSAGE);
                }else if(password.length()<=0){
                    JOptionPane.showMessageDialog(null, "Password cannot be empty !!!", "Warning !!!", JOptionPane.WARNING_MESSAGE);
                }else{
                    System.out.println("Hello " + userName + ", Your Password is " + password);
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
    
    public void show(){
        this.window.setVisible(true);
    }
    
}
