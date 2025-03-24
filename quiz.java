import javax.swing.*;
import java.awt.*;

public class Quiz extends JFrame{

    String questions[][] = new String[25][5];
    String answers[][] = new String[25][5];



    Quiz() {
        setBounds(50, 0, 1400, 900);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1= new ImageIcon("DE_QuizTemplate.jpg");
        Image img = i1.getImage().getScaledInstance(580, 900, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(img);
        JLabel image = new JLabel(scaledIcon);
        image.setBounds(0, 0, 580, 900);
        add(image);
        setVisible(true);


        JLabel qno = new JLabel("1. ");
        qno.setBounds(750, 200, 500, 50);
        qno.setFont(new Font("SansSerif", Font.BOLD,24));
        add(qno);

        JLabel question = new JLabel("Questions");
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
                questions[5][1] = "Red and white stripes";
                questions[5][2] = "Blue and white";
                questions[5][3] = "Yellow and red";
                questions[5][4] = "Black and white";
        
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
                answers[5][0] = "Red and white stripes";
                answers[6][0] = "Marseille";
                answers[7][0] = "Madrid";
                answers[8][0] = "Real Madrid";
                answers[9][0] = "Antoine Griezmann";
                answers[10][0] = "Jan Oblak";
                answers[11][0] = "Real Madrid";
                answers[12][0] = "Los Colchoneros";
                answers[13][0] = "Spain";
                answers[14][0] = "Fulham";


        JRadioButton opt1 = new JRadioButton("Option 1");
        opt1.setBounds(900, 300, 500, 80);
        opt1.setBackground(Color.white);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 24));
        add(opt1);

        JRadioButton opt2 = new JRadioButton("Option 2");
        opt2.setBounds(900, 400, 500, 80);
        opt2.setBackground(Color.white);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 24));
        add(opt2);

        JRadioButton opt3 = new JRadioButton("Option 3");
        opt3.setBounds(900, 500, 500, 80);
        opt3.setBackground(Color.white);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 24));
        add(opt3);

        JRadioButton opt4 = new JRadioButton("Option 4");
        opt4.setBounds(900, 600, 500, 80);
        opt4.setBackground(Color.white);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 24));
        add(opt4);


        ButtonGroup grouppoptions = new ButtonGroup();
        grouppoptions.add(opt1);
        grouppoptions.add(opt2);
        grouppoptions.add(opt3);
        grouppoptions.add(opt4);

        Button next = new Button("Next");
        next.setBounds(1100, 700, 200, 80);
        add(next);

        setVisible(true);

    }

    public static void main(String[] args) {
        new Quiz();
    }
    
    
}
