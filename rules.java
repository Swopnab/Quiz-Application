import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class rules extends JFrame implements ActionListener{

    JButton start, back;

    rules(){
        
        getContentPane().setBackground(Color.black);
        setLayout(null);

        JLabel heading = new JLabel("GAME RULES!!!");
        heading.setBounds(20, 20, 700, 45);
        heading.setFont(new Font("SansSerif", Font.BOLD,54));
        heading.setForeground(Color.white);
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(40, 120, 700, 400);
        rules.setFont(new Font("SansSerif", Font.BOLD,14));
        rules.setForeground(Color.white);
        rules.setText(
        "<html>" +
            "📜 QUIZ MANIA - Officially Unofficial Rules 📜" + "<br><br>" +
            " 1️⃣ You Must Have Fun – If you’re not having fun, you’re probably doing it wrong. 😆" + "<br><br>" +
            " 2️⃣ No Googling! – This is a quiz, not a group project. 🚫📱" + "<br><br>" +
            " 3️⃣ Guessing is Encouraged – If you don’t know the answer, just pick ‘C.’ Statistically, it works. Probably. 🤷‍♂️" + "<br><br>" +
            " 4️⃣ Wrong Answers Deserve Drama – If you get a question wrong, please gasp loudly for dramatic effect. 😱" + "<br><br>" +
            " 5️⃣ Bribing the Host Won’t Help – But hey, it never hurts to try. 💰😉" + "<br><br>" +
            " 6️⃣ If You Rage Quit, You Owe Everyone Pizza – We don’t make the rules (wait… actually, we do). 🍕😂" + "<br><br>" +
            " 7️⃣ Dancing After Every Correct Answer is Mandatory – Bonus points for creativity. 💃🕺" + "<br><br>" +
            " 8️⃣ Your Brain May Overheat – Please take breaks to cool down if needed. 🧠🔥" + "<br><br>" +
            " 9️⃣ If You Win, Act Humble – But deep down, you know you’re a genius. 😏" + "<br><br>" +
            " 🔟 If You Lose, Blame the Questions – It’s never your fault, obviously. 😜" + "<br><br>" +
        "</html>"
        );
        add(rules);

        back = new JButton("BACK");
        back.setBounds(50, 550, 200, 50);
        back.setFont(new Font("SansSerif", Font.BOLD,24));
        back.setBackground(Color.decode("#1d96dd"));
        back.setForeground(Color.white);
        back.setOpaque(true);
        back.setBorderPainted(false);
        back.setFocusPainted(false);
        back.addActionListener(this);
        add(back);

        start = new JButton("START");
        start.setBounds(450, 550, 200, 50);
        start.setFont(new Font("SansSerif", Font.BOLD,24));
        start.setBackground(Color.decode("#1d96dd"));
        start.setForeground(Color.white);
        start.setOpaque(true);
        start.setBorderPainted(false);
        start.setFocusPainted(false);
        start.addActionListener(this);
        add(start);

        setSize(800, 720);
        setLocation(350, 100);
        setVisible(true);

        revalidate();
        repaint();

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new QuizGame(); 
        } else if (ae.getSource() == back) {
            setVisible(false);
            new login(); 
        }
    }

    public static void main(String[] args) {
        new rules();
    }
    

}
