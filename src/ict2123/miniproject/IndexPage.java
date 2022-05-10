package ict2123.miniproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class IndexPage implements ActionListener {

    JFrame frame = new JFrame("Index");
    JButton startButton = new JButton("Get Started");
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JLabel labelTopic = new JLabel("<html><br><center>WELCOME<br></center></html>");

    public IndexPage() {
        initialize();
    }

    private void initialize() {
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        frame.add(panel, BorderLayout.CENTER);
        frame.add(panel2, BorderLayout.SOUTH);

        startButton.setFocusable(false);
        startButton.addActionListener(this);
        startButton.setFont(new Font("Sans-serif", Font.PLAIN, 40));
        startButton.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(0x696969), 50), BorderFactory.createEmptyBorder(5, 5, 10, 10)));
        panel.setBackground(new Color(0x696969));
        panel2.setBackground(new Color(0x696969));

        labelTopic.setHorizontalTextPosition(SwingConstants.CENTER);
        labelTopic.setVerticalTextPosition(SwingConstants.TOP);

        ImageIcon labelIcon = new ImageIcon(this.getClass().getResource("logo.png"));
        labelTopic.setIcon(labelIcon);
        labelTopic.setFont(new Font("Arial", Font.BOLD, 56));
        labelTopic.setForeground(Color.white);

        //frame.add(startButton);
        panel2.add(startButton);
        panel.add(labelTopic);
    }

    public void show() {
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            Login login = new Login();
            login.show();
            frame.dispose();
        }
    }
}
