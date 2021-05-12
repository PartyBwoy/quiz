package quizgame;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class C_oneeng implements ActionListener{
	String[] questions = 	{
								"The capacity of a hard drive is measured whith?",
								"How many information can a CD (Compact Disk) store usually ?",
								"Which operating system is used by the computer?",
								"Which one is not a computer manufacturer?",
								"RAM is acronym for",
								" DOS' is acronym for",
								"The physical components that make up a computer are known as:"
							};
	String[][] options = 	{
								{"MHz","Mbps","52X","Giga-octets"},
								{"1,4 Mo","650 Mo","150 Mo","10 Mo"},
								{"Netscape","Internet Explorer","Microsoft Windows","Microsoft Word"},
								{"Microsoft","IBM","Apple","Sun"},
								{"Remote Authorization Mechanism","Random Access Memory","Readily Accessed Mailer","Random Authorization Mechanism"},
								{"Dual Operating System","Dual Organized System","Disk Organized System"," Disk Operating System"},
								{"software","hardware","Operating System","Navigateurs"},
	};
	char[] answers = 		{
								'D',
								'B',
								'C',
								'A',
								'B',
								'D',
								'B'
							};
	char guess;
	char answer;
	int index;
	int correct_guesses =0;
	int total_questions = questions.length;
	int result;
	int seconds=10;
	
	JFrame frameoneeng = new JFrame();
	JTextField textfield = new JTextField();
	JTextArea textarea = new JTextArea();
	JButton buttonA = new JButton();
	JButton buttonB = new JButton();
	JButton buttonC = new JButton();
	JButton buttonD = new JButton();
	JLabel answer_labelA = new JLabel();
	JLabel answer_labelB = new JLabel();
	JLabel answer_labelC = new JLabel();
	JLabel answer_labelD = new JLabel();
	JLabel time_label = new JLabel();
	JLabel seconds_left = new JLabel();
	JTextField number_right = new JTextField();
	JTextField percentage = new JTextField();
	
	Timer timer = new Timer(1000, new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			seconds--;
			seconds_left.setText(String.valueOf(seconds));
			if(seconds<=0) {
				displayAnswer();
			}
			}
		});
	
	public C_oneeng() {
		frameoneeng.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameoneeng.setSize(500,700);
		frameoneeng.getContentPane().setBackground(Color.ORANGE);
		frameoneeng.setLayout(null);
		frameoneeng.setResizable(false);
		
		textfield.setBounds(0,0,500,50);
		textfield.setBackground(new Color(25,25,25));
		textfield.setForeground(Color.RED);
		textfield.setFont(new Font("Ink Free",Font.BOLD,30));
		textfield.setBorder(BorderFactory.createBevelBorder(1));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setEditable(false);
		
		textarea.setBounds(0,60,500,70);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setBackground(new Color(25,25,25));
		textarea.setForeground(new Color(25,255,0));
		textarea.setFont(new Font("MV Boli",Font.BOLD,20));
		textarea.setBorder(BorderFactory.createBevelBorder(1));
		textarea.setEditable(false);
		
		buttonA.setBounds(0,150,100,100);
		buttonA.setFont(new Font("MV Boli",Font.BOLD,35));
		buttonA.setFocusable(false);
		buttonA.addActionListener(this);
		buttonA.setText("A");
		
		buttonB.setBounds(0,250,100,100);
		buttonB.setFont(new Font("MV Boli",Font.BOLD,35));
		buttonB.setFocusable(false);
		buttonB.addActionListener(this);
		buttonB.setText("B");
		
		buttonC.setBounds(0,350,100,100);
		buttonC.setFont(new Font("MV Boli",Font.BOLD,35));
		buttonC.setFocusable(false);
		buttonC.addActionListener(this);
		buttonC.setText("C");
		
		buttonD.setBounds(0,450,100,100);
		buttonD.setFont(new Font("MV Boli",Font.BOLD,35));
		buttonD.setFocusable(false);
		buttonD.addActionListener(this);
		buttonD.setText("D");
		
		answer_labelA.setBounds(125,150,500,100);
		answer_labelA.setBackground(new Color(50,50,50));
		answer_labelA.setForeground(new Color(25,255,0));
		answer_labelA.setFont(new Font("MV Boli",Font.PLAIN,20));
		
		answer_labelB.setBounds(125,250,500,100);
		answer_labelB.setBackground(new Color(50,50,50));
		answer_labelB.setForeground(new Color(25,255,0));
		answer_labelB.setFont(new Font("MV Boli",Font.PLAIN,20));
		
		answer_labelC.setBounds(125,350,500,100);
		answer_labelC.setBackground(new Color(50,50,50));
		answer_labelC.setForeground(new Color(25,255,0));
		answer_labelC.setFont(new Font("MV Boli",Font.PLAIN,20));
		
		answer_labelD.setBounds(125,450,500,100);
		answer_labelD.setBackground(new Color(50,50,50));
		answer_labelD.setForeground(new Color(25,255,0));
		answer_labelD.setFont(new Font("MV Boli",Font.PLAIN,20));

		
		seconds_left.setBounds(350,550,100,100);
		seconds_left.setBackground(new Color(25,25,25));
		seconds_left.setForeground(Color.red);
		seconds_left.setFont(new Font("Ink Free",Font.BOLD,60));
		seconds_left.setBorder(BorderFactory.createBevelBorder(1));
		seconds_left.setOpaque(true);
		seconds_left.setHorizontalAlignment(JTextField.CENTER);
		seconds_left.setText(String.valueOf(seconds));
		
		time_label.setBounds(350,490,100,100);
		time_label.setBackground(new Color(50,50,50));
		time_label.setForeground(new Color(255,0,0));
		time_label.setFont(new Font("MV Boli",Font.PLAIN,16));
		time_label.setHorizontalAlignment(JTextField.CENTER);
		time_label.setText("timer °.°");
		
		number_right.setBounds(150,225,200,100);
		number_right.setBackground(new Color(25,25,25));
		number_right.setForeground(new Color(25,255,0));
		number_right.setFont(new Font("Ink Free",Font.BOLD,50));
		number_right.setBorder(BorderFactory.createBevelBorder(1));
		number_right.setHorizontalAlignment(JTextField.CENTER);
		number_right.setEditable(false);
		
		percentage.setBounds(150,325,200,100);
		percentage.setBackground(new Color(25,25,25));
		percentage.setForeground(new Color(25,255,0));
		percentage.setFont(new Font("Ink Free",Font.BOLD,50));
		percentage.setBorder(BorderFactory.createBevelBorder(1));
		percentage.setHorizontalAlignment(JTextField.CENTER);
		percentage.setEditable(false);
		
		frameoneeng.add(time_label);
		frameoneeng.add(seconds_left);
		frameoneeng.add(answer_labelA);
		frameoneeng.add(answer_labelB);
		frameoneeng.add(answer_labelC);
		frameoneeng.add(answer_labelD);
		frameoneeng.add(buttonA);
		frameoneeng.add(buttonB);
		frameoneeng.add(buttonC);
		frameoneeng.add(buttonD);
		frameoneeng.add(textarea);
		frameoneeng.add(textfield);
		frameoneeng.setVisible(true);
		
		nextQuestion();
	}
	public void nextQuestion() {
		
		if(index>=total_questions) {
			results();
			JButton btnNewButton = new JButton("Restart!");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					QUIZ Q= new QUIZ();
					 Q.frame.setVisible(true);
					frameoneeng.dispose();
				}
			});
			btnNewButton.setBounds(150, 600, 200, 50);
			frameoneeng.add(btnNewButton);
		}
		else {
			textfield.setText("Question "+(index+1));
			textarea.setText(questions[index]);
			answer_labelA.setText(options[index][0]);
			answer_labelB.setText(options[index][1]);
			answer_labelC.setText(options[index][2]);
			answer_labelD.setText(options[index][3]);
			timer.start();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
			buttonA.setEnabled(false);
			buttonB.setEnabled(false);
			buttonC.setEnabled(false);
			buttonD.setEnabled(false);
			
			if(e.getSource()==buttonA) {
				answer= 'A';
				if(answer == answers[index]) {
					correct_guesses++;
				}
			}
			if(e.getSource()==buttonB) {
				answer= 'B';
				if(answer == answers[index]) {
					correct_guesses++;
				}
			}
			if(e.getSource()==buttonC) {
				answer= 'C';
				if(answer == answers[index]) {
					correct_guesses++;
				}
			}
			if(e.getSource()==buttonD) {
				answer= 'D';
				if(answer == answers[index]) {
					correct_guesses++;
				}
			}
			displayAnswer();
	}
	public void displayAnswer() {
		
		timer.stop();
		
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		if(answers[index] != 'A')
			answer_labelA.setForeground(new Color(255,0,0));
		if(answers[index] != 'B')
			answer_labelB.setForeground(new Color(255,0,0));
		if(answers[index] != 'C')
			answer_labelC.setForeground(new Color(255,0,0));
		if(answers[index] != 'D')
			answer_labelD.setForeground(new Color(255,0,0));
		
		Timer pause = new Timer(2000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				answer_labelA.setForeground(new Color(25,255,0));
				answer_labelB.setForeground(new Color(25,255,0));
				answer_labelC.setForeground(new Color(25,255,0));
				answer_labelD.setForeground(new Color(25,255,0));
				
				answer = ' ';
				seconds=10;
				seconds_left.setText(String.valueOf(seconds));
				buttonA.setEnabled(true);
				buttonB.setEnabled(true);
				buttonC.setEnabled(true);
				buttonD.setEnabled(true);
				index++;
				nextQuestion();
			}
		});
		pause.setRepeats(false);
		pause.start();
	}
	public void results(){
		
		buttonA.setBounds(0, 0, 0, 0);
		buttonB.setBounds(0, 0, 0, 0);
		buttonC.setBounds(0, 0, 0, 0);
		buttonD.setBounds(0, 0, 0, 0);
		
		result = (int)((correct_guesses/(double)total_questions)*100);
		
		textfield.setText("RESULTS!");
		textarea.setBounds(0, 0, 0, 0);
		time_label.setBounds(0, 0, 0, 0);
		seconds_left.setBounds(0,0,0,0);

		answer_labelA.setText("");
		answer_labelB.setText("");
		answer_labelC.setText("");
		answer_labelD.setText("");
		
		number_right.setText("("+correct_guesses+"/"+total_questions+")");
		percentage.setText(result+"%");
		
		frameoneeng.add(number_right);
		frameoneeng.add(percentage);
		
		
	}
	
}
