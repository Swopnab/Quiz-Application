
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.jar.Attributes;

public class login extends JFrame implements ActionListener {

    JButton rules, name;
    login(){
        getContentPane().setBackground(Color.decode("#001b29"));
        setLayout(null);

        ImageIcon i1= new ImageIcon("Quiz-icon.png");
        JLabel image = new JLabel(i1);
        image.setBounds(220, 55, 600, 600);
        add(image);

        if (i1.getIconWidth() == -1 || i1.getIconHeight() == -1) {
            System.out.println("Image not found!");
        };

        JLabel heading = new JLabel("QUIZ MANIA");
        heading.setBounds(320, 20, 700, 45);
        heading.setFont(new Font("SansSerif", Font.BOLD,64));
        heading.setForeground(Color.white);
        add(heading);

        name = new JButton("PLAY");
        name.setBounds(240, 640, 300, 50);
        name.setFont(new Font("SansSerif", Font.BOLD,28));
        name.setBackground(Color.decode("#001b29"));
        name.setForeground(Color.white);
        name.setOpaque(true);
        name.setBorderPainted(false);
        name.setFocusPainted(false);
        name.addActionListener(this);
        add(name);

        rules = new JButton("HOW TO PLAY");
        rules.setBounds(600, 640, 300, 50);
        rules.setFont(new Font("SansSerif", Font.BOLD,28));
        rules.setBackground(Color.decode("#001b29"));
        rules.setForeground(Color.white);
        rules.setOpaque(true);
        rules.setBorderPainted(false);
        rules.setFocusPainted(false);
        rules.addActionListener(this);
        add(rules);

        setVisible(true);
        setSize(1024,720);
        setLocation(225, 100);

    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == rules)(

        ) elsw if (ae.getSource() == Name){

        }
    }

    public static void main(String[] args){
        new login();
    }
}
