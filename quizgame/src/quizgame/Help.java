package quizgame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;
import java.awt.SystemColor;

import javax.swing.ImageIcon;

import java.awt.Insets;

public class Help {

	 JFrame f;
	 private JTextArea txtrHelppText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help window = new Help();
					window.f.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Help() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		Image imgBB= new ImageIcon(this.getClass().getResource("/back.png")).getImage();
		JButton btnNewButton = new JButton(new ImageIcon(imgBB));
		btnNewButton.setBounds(150, 553,  170, 75);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QUIZ Q= new QUIZ();
				 Q.frame.setVisible(true);
				f.dispose();
	Thread playWave4=new AePlayWave("sounds/button-10.wav");
				
				
				playWave4.start();
			}
		});
		f.getContentPane().setLayout(null);
		f.getContentPane().add(btnNewButton);
		
		txtrHelppText = new JTextArea();
		txtrHelppText.setMargin(new Insets(10, 10, 10, 10));
		txtrHelppText.setLineWrap(true);
		txtrHelppText.setFont(new Font("Gill Sans MT", Font.ITALIC, 15));
		txtrHelppText.setEditable(false);
		txtrHelppText.setWrapStyleWord(true);
		txtrHelppText.setBackground(SystemColor.info);
		txtrHelppText.setText("QuizGenius is the entertainment  game where you get questions that can�t be found anywhere else.\r\nRead interesting explanations, Educate yourself.\r\nQuizGenius is:\r\n-free game to test your CS knowledge;\r\n-entertaining questions for CS student;  \r\n-a relaxing game, which is also a source of valuable and little-known information;\r\n-delightful learning experience whether you know the answers or not;\r\n-the best game to help you fall asleep or to start your day with;\r\n      It�s nothing like other educational and anti-stress games;\r\n          ____________How to play____________\r\n-check your knowledge: answer questions and get the correct answers;\r\n-you get points for each question answered correctly. If you give a wrong answer, no points are added;\r\n-all questions are filtered by difficulty. The more questions you answer, the more difficult questions you get;\r\n-in the end u can see the result and u can restart the GAME !!!\r\n\r\n\r\n      ");
		txtrHelppText.setBounds(31, 96, 400, 446);
		f.getContentPane().add(txtrHelppText);
		f.setBounds(0, 0, 500, 700);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
