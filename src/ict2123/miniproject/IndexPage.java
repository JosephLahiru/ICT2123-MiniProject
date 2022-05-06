package ict2123.miniproject;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class IndexPage implements ActionListener{
    
    JFrame frame = new JFrame();
    JButton startButton = new JButton("Get Started");
    JPanel panel = new JPanel();

    public IndexPage() {
        initialize();
    }
    
    private void initialize(){
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLayout(new BorderLayout(10, 10));
        
        frame.add(panel, BorderLayout.CENTER);
        
        startButton.setFocusable(false);
        startButton.addActionListener(this);
        
        panel.add(startButton);
    }
    
    public void show(){
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == startButton){
            Login login = new Login();
            login.show();
            frame.dispose();
        }
    }
}
