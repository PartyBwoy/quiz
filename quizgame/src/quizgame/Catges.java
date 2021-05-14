package quizgame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

public class Catges {

	 JFrame Categs;
	 


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
       
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Catges window = new Catges();
					window.Categs.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Catges() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 *   
	 */
	private void initialize( ) {
		
		Categs = new JFrame();
		Categs.setResizable(false);

		Categs.getContentPane().setBackground(Color.ORANGE);
		Categs.setBackground(Color.ORANGE);
		Categs.setBounds(0, 0, 500, 700);
		Categs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Categs.getContentPane().setLayout(null);
		
		JButton C1 = new JButton("HardWare");
		C1.setFont(new Font("Tw Cen MT", Font.BOLD, 17));
		C1.setBackground(Color.black);
		C1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				C_one quiz=new C_one();
				
				Thread playWave4=new AePlayWave("sounds/button-10.wav");
				
				
				playWave4.start();
			
				
				quiz.frameone.setVisible(true);
				Categs.dispose();
			}
		});
		C1.setForeground(Color.RED);
		C1.setBounds(150, 354, 200, 50);
		Categs.getContentPane().add(C1);
		
		JButton C2 = new JButton("SoftWare");
		C2.setBackground(Color.black);
		C2.setFont(new Font("Tw Cen MT", Font.BOLD, 17));
		C2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C_two quiz=new C_two();
				
				Thread playWave4=new AePlayWave("sounds/button-10.wav");
				
				
				playWave4.start();
			
				
				quiz.frametwo.setVisible(true);
				Categs.dispose();

			}
		});
		C2.setForeground(Color.RED);
		C2.setBounds(150, 415, 200, 50);
		Categs.getContentPane().add(C2);
		
		JButton C3 = new JButton("langages de programmation");
		C3.setBackground(Color.black);
		C3.setFont(new Font("Tw Cen MT", Font.BOLD, 17));
		C3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C_three quiz=new C_three();
				
				Thread playWave4=new AePlayWave("sounds/button-10.wav");
				
				
				playWave4.start();
			
				quiz.framethree.setVisible(true);
				Categs.dispose();
			}
		});
		C3.setForeground(Color.RED);
		C3.setBounds(150, 476, 200, 50);
		Categs.getContentPane().add(C3);
		
		Image imgBB= new ImageIcon(this.getClass().getResource("/back.png")).getImage();

		JButton back = new JButton(new ImageIcon(imgBB));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QUIZ Q= new QUIZ();
				 Q.frame.setVisible(true);
				 Categs.dispose();
				 Thread playWave4=new AePlayWave("sounds/button-10.wav");
					playWave4.start();
			}
		});
		back.setBounds(55, 549, 170, 75);
		Categs.getContentPane().add(back);
	}
}
