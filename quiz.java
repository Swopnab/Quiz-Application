import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Quiz extends JFrame implements ActionListener { 

    String questions[][] = new String[25][1];
    String answers[][] = new String[25][5];
    String useranswers[][] = new String[25][1];

    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;

    ButtonGroup groupoptions;
    JButton next, submit;

    public static int timer = 15;
    public static int ans_given = 0;
    public static int score = 0;
    public static int count = 0;

    String name;


    Quiz() {
        setBounds(50, 0, 1400, 900);
        getContentPane().setBackground(Color.black);
        setLayout(null);

        ImageIcon i1= new ImageIcon("DE_QuizTemplate.jpg");
        Image img = i1.getImage().getScaledInstance(580, 900, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(img);
        JLabel image = new JLabel(scaledIcon);
        image.setBounds(0, 0, 350, 900);
        add(image);
        setVisible(true);


        qno = new JLabel();
        qno.setBounds(750, 200, 500, 50);
        qno.setFont(new Font("SansSerif", Font.BOLD,24));
        add(qno);

        question = new JLabel();
        question.setBounds(800, 200, 500, 50);
        question.setFont(new Font("SansSerif", Font.BOLD,36));
        add(question);

                // Questions and answer options
                questions[0][0] = "In which year was Atletico Madrid founded?";
                questions[0][1] = "1903";
                questions[0][2] = "1910";
                questions[0][3] = "1921";
                questions[0][4] = "1936";
        
                questions[1][0] = "What is Atletico Madrid's home stadium?";
                questions[1][1] = "Camp Nou";
                questions[1][2] = "Santiago Bernabeu";
                questions[1][3] = "Wanda Metropolitano";
                questions[1][4] = "Mestalla";
        
                questions[2][0] = "Who is Atletico Madrid's all-time top scorer?";
                questions[2][1] = "Fernando Torres";
                questions[2][2] = "Antoine Griezmann";
                questions[2][3] = "Luis Aragones";
                questions[2][4] = "Diego Forlan";
        
                questions[3][0] = "How many La Liga titles has Atletico Madrid won (as of 2024)?";
                questions[3][1] = "8";
                questions[3][2] = "10";
                questions[3][3] = "11";
                questions[3][4] = "12";
        
                questions[4][0] = "Who was Atletico Madrid's manager when they won La Liga in 2021?";
                questions[4][1] = "Diego Simeone";
                questions[4][2] = "Luis Enrique";
                questions[4][3] = "Zinedine Zidane";
                questions[4][4] = "Carlo Ancelotti";
        
                questions[5][0] = "What are Atletico Madrid's traditional home colors?";
                questions[5][1] = "Red and black stripes";
                questions[5][2] = "Blue and black";
                questions[5][3] = "Yellow and red";
                questions[5][4] = "Black and black";
        
                questions[6][0] = "Which team did Atletico Madrid defeat in the 2018 UEFA Europa League final?";
                questions[6][1] = "Liverpool";
                questions[6][2] = "Arsenal";
                questions[6][3] = "Marseille";
                questions[6][4] = "Chelsea";
        
                questions[7][0] = "Which city is Atletico Madrid based in?";
                questions[7][1] = "Barcelona";
                questions[7][2] = "Madrid";
                questions[7][3] = "Seville";
                questions[7][4] = "Valencia";
        
                questions[8][0] = "Who did Atletico Madrid face in the 2014 UEFA Champions League final?";
                questions[8][1] = "Barcelona";
                questions[8][2] = "Real Madrid";
                questions[8][3] = "Bayern Munich";
                questions[8][4] = "Chelsea";
        
                questions[9][0] = "Which Atletico Madrid player won the 2018 FIFA World Cup with France?";
                questions[9][1] = "Saul Niguez";
                questions[9][2] = "Koke";
                questions[9][3] = "Antoine Griezmann";
                questions[9][4] = "Joao Felix";
        
                questions[10][0] = "Who is known as one of Atletico Madrid's most legendary goalkeepers?";
                questions[10][1] = "David de Gea";
                questions[10][2] = "Thibaut Courtois";
                questions[10][3] = "Jan Oblak";
                questions[10][4] = "Iker Casillas";
        
                questions[11][0] = "Which club is considered Atletico Madrid's biggest rival?";
                questions[11][1] = "Sevilla";
                questions[11][2] = "Barcelona";
                questions[11][3] = "Real Madrid";
                questions[11][4] = "Valencia";
        
                questions[12][0] = "What is Atletico Madrid's nickname?";
                questions[12][1] = "Los Blancos";
                questions[12][2] = "Los Rojiblancos";
                questions[12][3] = "Los Azulgranas";
                questions[12][4] = "Los Colchoneros";
        
                questions[13][0] = "Which country is Atletico Madrid’s owner, Miguel Angel Gil Marin, from?";
                questions[13][1] = "Argentina";
                questions[13][2] = "Spain";
                questions[13][3] = "Portugal";
                questions[13][4] = "Italy";
        
                questions[14][0] = "Which club did Atletico Madrid defeat to win the 2010 UEFA Europa League final?";
                questions[14][1] = "Fulham";
                questions[14][2] = "Inter Milan";
                questions[14][3] = "Borussia Dortmund";
                questions[14][4] = "Manchester United";
        
                answers[0][0] = "1903";
                answers[1][0] = "Wanda Metropolitano";
                answers[2][0] = "Luis Aragones";
                answers[3][0] = "11";
                answers[4][0] = "Diego Simeone";
                answers[5][0] = "Red and black stripes";
                answers[6][0] = "Marseille";
                answers[7][0] = "Madrid";
                answers[8][0] = "Real Madrid";
                answers[9][0] = "Antoine Griezmann";
                answers[10][0] = "Jan Oblak";
                answers[11][0] = "Real Madrid";
                answers[12][0] = "Los Colchoneros";
                answers[13][0] = "Spain";
                answers[14][0] = "Fulham";


        opt1 = new JRadioButton();
        opt1.setBounds(900, 300, 500, 80);
        opt1.setBackground(Color.white);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 24));
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(900, 400, 500, 80);
        opt2.setBackground(Color.white);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 24));
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(900, 500, 500, 80);
        opt3.setBackground(Color.white);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 24));
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(900, 600, 500, 80);
        opt4.setBackground(Color.white);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 24));
        add(opt4);


        ButtonGroup groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);

        next = new JButton("Next");
        next.setBounds(900, 500, 500, 50);
        next.setFont(new Font("Dialog", Font.PLAIN, 24));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.black);
        next.addActionListener(this);
        add(next);

        submit = new JButton("Submit");
        submit.setBounds(900, 500, 500, 50);
        submit.setFont(new Font("Dialog", Font.PLAIN, 24));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.black);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);

        start(count);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
               useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new Score(name, score);
        }
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        
        String time = "Time left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Dialog", Font.PLAIN, 30));
        
        if (timer > 0) { 
            g.drawString(time, 800 , 100);
        } else {
            g.drawString("Times up!!", 800 , 100);
        }
        
        timer--; // 14
        
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                
                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new Score(name, score);
            } else { // next button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }
        
    }
    
    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
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
    
    public static void main(String[] args) {
        new Quiz();
    }
}
