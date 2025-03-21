
import javax.swing.*;
import java.awt.*;

public class login extends JFrame{
    login(){
        getContentPane().setBackground(Color.decode("#001b29"));
        setLayout(null);

        ImageIcon i1= new ImageIcon("Quiz-icon.png");
        JLabel image = new JLabel(i1);
        /*
        int imageX = (getWidth() - i1.getIconWidth()) / 2;
        int imageY = (getHeight() - i1.getIconHeight()) / 2;
        image.setBounds(imageX, imageY, i1.getIconWidth(), i1.getIconHeight());
        */
        add(image);

        if (i1.getIconWidth() == -1 || i1.getIconHeight() == -1) {
            System.out.println("Image not found!");
        };

        JLabel heading = new JLabel("WHO WANTS TO BE A BROKILLIONAIRE");
        int headingX = (getWidth() - 300) / 2;
        heading.setBounds(headingX, 50, 300, 45);
        heading.setBounds(200, 100, 300, 45);
        heading.setFont(new Font("SansSerif", Font.BOLD,20));
        heading.setForeground(Color.white);
        add(heading);

        setVisible(true);
        setSize(1024,720);
        setLocation(225, 100);

    }

    public static void main(String[] args){
        new login();
    }
}
