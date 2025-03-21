
import javax.swing.*;
import java.awt.*;

public class login extends JFrame{
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

        JLabel name = new JLabel("PLAY");
        name.setBounds(240, 640, 300, 30);
        name.setFont(new Font("SansSerif", Font.BOLD,28));
        name.setForeground(Color.white);
        add(name);

        JLabel rules = new JLabel("HOW TO PLAY");
        rules.setBounds(600, 640, 300, 30);
        rules.setFont(new Font("SansSerif", Font.BOLD,28));
        rules.setForeground(Color.white);
        add(rules);

        setVisible(true);
        setSize(1024,720);
        setLocation(225, 100);

    }

    public static void main(String[] args){
        new login();
    }
}
