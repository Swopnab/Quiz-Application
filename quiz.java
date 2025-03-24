import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener { 

    String questions[][] = new String[25][5]; 
    String answers[] = new String[25]; 
    String useranswers[] = new String[25]; 

    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit;

    int timer = 10, ans_given = 0, score = 0, count = 0;
    Timer quizTimer;

    Quiz() {

        ImageIcon i2= new ImageIcon("DE_QuizTemplate.jpg");
        JLabel image = new JLabel(i2);
        image.setBounds(0, 0, 400, 1000);
        add(image);

        setBounds(50, 0, 1400, 900);
        getContentPane().setBackground(Color.black);
        setLayout(null);

        qno = new JLabel();
        qno.setBounds(650, 200, 50, 50);
        qno.setFont(new Font("SansSerif", Font.BOLD,24));
        qno.setForeground(Color.white);
        add(qno);

        question = new JLabel();
        question.setBounds(700, 200, 900, 50);
        question.setFont(new Font("SansSerif", Font.BOLD,24));
        question.setForeground(Color.white);
        add(question);

        opt1 = new JRadioButton();
        opt2 = new JRadioButton();
        opt3 = new JRadioButton();
        opt4 = new JRadioButton();

        JRadioButton[] options = {opt1, opt2, opt3, opt4};
        int y = 300;
        for (JRadioButton opt : options) {
            opt.setBounds(800, y, 500, 50);
            opt.setFont(new Font("SansSerif", Font.BOLD,24));
            opt.setBackground(Color.black);
            opt.setForeground(Color.white);
            add(opt);
            y += 80;
        }

        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);

        next = new JButton("Next");
        next.setBounds(700, 700, 150, 50);
        next.setFont(new Font("SansSerif", Font.BOLD,24));
        next.setBackground(new Color(30, 144, 255));
        next.addActionListener(this);
        add(next);

        submit = new JButton("Submit");
        submit.setBounds(1100, 700, 150, 50);
        submit.setFont(new Font("SansSerif", Font.BOLD,24));
        submit.setBackground(new Color(30, 144, 255));
        submit.setEnabled(false);
        submit.addActionListener(this);
        add(submit);

        loadQuestions();
        start(count);

        quizTimer = new Timer(1000, e -> updateTimer());
        quizTimer.start();

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            processAnswer();
            if (count == 14) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);
        } else if (ae.getSource() == submit) {
            processAnswer();
            calculateScore();
            setVisible(false);
            JOptionPane.showMessageDialog(null, "Your Score: " + score);
        }
    }

    public void processAnswer() {
        ans_given = 1;
        if (groupoptions.getSelection() == null) {
            useranswers[count] = "";
        } else {
            useranswers[count] = groupoptions.getSelection().getActionCommand();
        }
        timer = 15;
    }

    public void updateTimer() {
        if (timer > 0) {
            timer--;
        } else {
            processAnswer();
            if (count == 14) {
                next.setEnabled(false);
                submit.setEnabled(true);
            } else {
                count++;
                start(count);
            }
        }
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.setFont(new Font("SansSerif", Font.BOLD,30));
        g.drawString("Time left: " + timer + "s", 800, 100);
    }

    public void calculateScore() {
        for (int i = 0; i < 15; i++) {
            if (useranswers[i].equals(answers[i])) {
                score += 10;
            }
        }
    }

    public void start(int count) {
        qno.setText((count + 1) + ".");
        question.setText(questions[count][0]);

        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        groupoptions.clearSelection();
    }

    public void loadQuestions() {
        questions[0] = new String[]{"Who is the main protagonist in 'Attack on Titan'?", "Levi Ackerman", "Eren Yeager", "Mikasa Ackerman", "Armin Arlert"};
        answers[0] = "Eren Yeager";
        
        questions[1] = new String[]{"Which club won the 2010 FIFA World Cup?", "Brazil", "Germany", "Spain", "Argentina"};
        answers[1] = "Spain";
        
        questions[2] = new String[]{"What is the name of the sword used by Tanjiro Kamado in 'Demon Slayer'?", "Nichirin Blade", "Excalibur", "Yoru", "Tenseiga"};
        answers[2] = "Nichirin Blade";
        
        questions[3] = new String[]{"Which country won the 2014 FIFA World Cup?", "Argentina", "Germany", "Brazil", "Spain"};
        answers[3] = "Germany";
        
        questions[4] = new String[]{"Who is known as the 'King of the Pirates' in 'One Piece'?", "Luffy", "Ace", "Shanks", "Gol D. Roger"};
        answers[4] = "Gol D. Roger";
        
        questions[5] = new String[]{"Which club did Atletico Madrid defeat to win the 2018 UEFA Europa League final?", "Liverpool", "Arsenal", "Marseille", "Chelsea"};
        answers[5] = "Marseille";
        
        questions[6] = new String[]{"Who scored the winning goal in the 2014 FIFA World Cup final?", "Lionel Messi", "Miroslav Klose", "Andres Iniesta", "Mario Gotze"};
        answers[6] = "Mario Gotze";
        
        questions[7] = new String[]{"What is the name of the fictional country in 'Attack on Titan'?", "Paradise Island", "Wakanda", "Konoha", "Hogwarts"};
        answers[7] = "Paradise Island";
        
        questions[8] = new String[]{"Who is the main antagonist in 'Naruto Shippuden'?", "Madara Uchiha", "Orochimaru", "Sasuke Uchiha", "Itachi Uchiha"};
        answers[8] = "Madara Uchiha";
        
        questions[9] = new String[]{"Who is considered the greatest soccer player of all time by many fans?", "Pele", "Cristiano Ronaldo", "Lionel Messi", "Diego Maradona"};
        answers[9] = "Lionel Messi";
        
        questions[10] = new String[]{"Who is Atletico Madrid's all-time top scorer?", "Fernando Torres", "Antoine Griezmann", "Luis Aragones", "Diego Forlan"};
        answers[10] = "Luis Aragones";
        
        questions[11] = new String[]{"Which anime features a battle between Goku and Frieza?", "Dragon Ball Z", "Naruto", "Bleach", "One Piece"};
        answers[11] = "Dragon Ball Z";
        
        questions[12] = new String[]{"Which Atletico Madrid player won the 2018 FIFA World Cup with France?", "Saul Niguez", "Koke", "Antoine Griezmann", "Joao Felix"};
        answers[12] = "Antoine Griezmann";
        
        questions[13] = new String[]{"Which anime features a character named Edward Elric?", "Fullmetal Alchemist", "Naruto", "Bleach", "Attack on Titan"};
        answers[13] = "Fullmetal Alchemist";
        
        questions[14] = new String[]{"Which Atletico Madrid player is known for his skillful dribbling and flair?", "Joao Felix", "Diego Costa", "Koke", "Antoine Griezmann"};
        answers[14] = "Joao Felix";
        
        questions[15] = new String[]{"Which club won the UEFA Champions League in 2020?", "Atletico Madrid", "Real Madrid", "Bayern Munich", "Liverpool"};
        answers[15] = "Bayern Munich";
        
        questions[16] = new String[]{"Which team did Atletico Madrid face in the 2016 UEFA Champions League final?", "Barcelona", "Real Madrid", "Bayern Munich", "Juventus"};
        answers[16] = "Real Madrid";
        
        questions[17] = new String[]{"Which anime is known for the character 'Monkey D. Luffy'?", "One Piece", "Dragon Ball Z", "Naruto", "Bleach"};
        answers[17] = "One Piece";
        
        questions[18] = new String[]{"Who is the manager of Atletico Madrid as of 2024?", "Carlo Ancelotti", "Luis Enrique", "Diego Simeone", "Zinedine Zidane"};
        answers[18] = "Diego Simeone";
        
        questions[19] = new String[]{"Which anime features the character 'Mikasa Ackerman'?", "Attack on Titan", "Naruto", "Bleach", "Dragon Ball Z"};
        answers[19] = "Attack on Titan";
        
        questions[20] = new String[]{"Who is Atletico Madrid's top scorer in the 2023-2024 La Liga season?", "Antoine Griezmann", "Joao Felix", "Diego Costa", "Alvaro Morata"};
        answers[20] = "Antoine Griezmann";
        
        questions[21] = new String[]{"Who won the 2018 Ballon d'Or?", "Cristiano Ronaldo", "Lionel Messi", "Luka Modric", "Kylian Mbappe"};
        answers[21] = "Luka Modric";
        
        questions[22] = new String[]{"Which anime features 'Titan Shifters'?", "Attack on Titan", "Naruto", "Bleach", "One Piece"};
        answers[22] = "Attack on Titan";
        
        questions[23] = new String[]{"Which club did Atletico Madrid face in the 2014 UEFA Champions League final?", "Barcelona", "Real Madrid", "Bayern Munich", "Chelsea"};
        answers[23] = "Real Madrid";
        
        questions[24] = new String[]{"Who is known as 'The Boss' at Atletico Madrid?", "Diego Simeone", "Fernando Torres", "Antoine Griezmann", "Koke"};
        answers[24] = "Diego Simeone";
        
    }

    public static void main(String[] args) {
        new Quiz();
    }
}
