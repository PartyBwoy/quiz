
	package quizgame;

	import java.awt.event.*;
	import java.awt.*;
	import javax.swing.*;

	public class C_twoEng implements ActionListener{
	      String[] questions = 	{
									"Which one of the choices below is not an operating system:?" ,
									"windows 7 is a?",
									"Which of these operating systems is OpenSource?",
									"Which of the following is malware?",
									"Which of these software is a productivity suite?",
									"Which of these software is a Browser?",
									"Which of these software is a UTILITY?"
									
								};
		String[][] options = 	{
									{"Google chrome","Mac Os","Linux","Windows Vista"},
									{"word  processor ","an operating system"," Computer Brandr",
											"an Application"},
									
									{"Windows 10","OS X Mojave","Linux Debian","iOS"},
									{"Microsoft Windows 10","Scarab.Ransomware","Microsoft Visual Studio","disk Defraggler"},
									{"Microsoft Office","Photoshop","Microsoft Visual Studio","CCleaner"},
									{"Microsoft Visual Studio","Photoshop","disk Defraggler","Mozilla Firefox"},
									{"Google chrome","Photoshop","Microsoft Visual Studio","disk Defraggler"},
		};
		char[] answers = 		{
									'A',
									'B',
									'C',
									'B',
									'A',
									'D',
									'D'
								};
		char guess;
		char answer;
		int index;
		int correct_guesses =0;
		int total_questions = questions.length;
		int result;
		int seconds=10;
		
		JFrame frametwoeng = new JFrame();
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
		
		public C_twoEng() {
			frametwoeng.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frametwoeng.setSize(500,700);
			frametwoeng.getContentPane().setBackground(Color.ORANGE);
			frametwoeng.setLayout(null);
			frametwoeng.setResizable(false);
			
			textfield.setBounds(0,0,500,50);
			textfield.setBackground(new Color(25,25,25));
			textfield.setForeground(new Color(25,255,0));
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
			seconds_left.setForeground(new Color(255,0,0));
			seconds_left.setFont(new Font("Ink Free",Font.BOLD,60));
			seconds_left.setBorder(BorderFactory.createBevelBorder(1));
			seconds_left.setOpaque(true);
			seconds_left.setHorizontalAlignment(JTextField.CENTER);
			seconds_left.setText(String.valueOf(seconds));
			
			time_label.setBounds(350,520,100,25);
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
			
			frametwoeng.add(time_label);
			frametwoeng.add(seconds_left);
			frametwoeng.add(answer_labelA);
			frametwoeng.add(answer_labelB);
			frametwoeng.add(answer_labelC);
			frametwoeng.add(answer_labelD);
			frametwoeng.add(buttonA);
			frametwoeng.add(buttonB);
			frametwoeng.add(buttonC);
			frametwoeng.add(buttonD);
			frametwoeng.add(textarea);
			frametwoeng.add(textfield);
			frametwoeng.setVisible(true);
			
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
						frametwoeng.dispose();
					}
				});
				btnNewButton.setBounds(150,600, 200, 50);
				frametwoeng.add(btnNewButton);
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
			
			frametwoeng.add(number_right);
			frametwoeng.add(percentage);
			
		}
	}


