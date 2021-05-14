package quizgame;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

	public class CategsEng {

		 JFrame Categseng;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			
			
			
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						CategsEng window = new CategsEng();
						window.Categseng.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the application.
		 */
		public CategsEng() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			Categseng = new JFrame();
						Categseng.setResizable(false);

			Categseng.getContentPane().setBackground(Color.ORANGE);
			Categseng.setBackground(Color.ORANGE);
			Categseng.setBounds(0, 0, 500, 700);
			Categseng.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Categseng.getContentPane().setLayout(null);
			
			JButton C1 = new JButton("HardWare");
			C1.setFont(new Font("Tw Cen MT", Font.BOLD, 17));
			C1.setBackground(Color.black);
			C1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					C_oneeng quiz=new C_oneeng();
					
					Thread playWave4=new AePlayWave("sounds/button-10.wav");
					
					
					playWave4.start();
				
					quiz.frameoneeng.setVisible(true);
					Categseng.dispose();
				}
			});
			C1.setForeground(Color.RED);
			C1.setBounds(150, 354, 200, 50);
			Categseng.getContentPane().add(C1);
			
			
			JButton C2 = new JButton("SoftWare");
			C2.setBackground(Color.black);
			C2.setFont(new Font("Tw Cen MT", Font.BOLD, 17));
			C2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					C_twoEng quiz=new C_twoEng();
					
					Thread playWave4=new AePlayWave("sounds/button-10.wav");
					
					
					playWave4.start();
				
					quiz.frametwoeng.setVisible(true);
					Categseng.dispose();

				}
			});
			C2.setForeground(Color.RED);
			C2.setBounds(150, 415, 200, 50);
			Categseng.getContentPane().add(C2);
			
			JButton C3 = new JButton("Programming languages");
			C3.setBackground(Color.black);
			C3.setFont(new Font("Tw Cen MT", Font.BOLD, 17));
			C3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					C_threeEng quiz=new C_threeEng();
					
					Thread playWave4=new AePlayWave("sounds/button-10.wav");
					
					
					playWave4.start();
				
					quiz.framethreeeng.setVisible(true);
					Categseng.dispose();
				}
			});
			C3.setForeground(Color.RED);
			C3.setBounds(150, 476, 200, 50);
			Categseng.getContentPane().add(C3);
			
			Image imgBB= new ImageIcon(this.getClass().getResource("/back.png")).getImage();

			JButton back = new JButton(new ImageIcon(imgBB));
			back.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					QUIZ Q= new QUIZ();
					 Q.frame.setVisible(true);
					 Categseng.dispose();
					 Thread playWave4=new AePlayWave("sounds/button-10.wav");
						playWave4.start();
				}
			});
			back.setBounds(55, 549, 170, 75);
			Categseng.getContentPane().add(back);
		}
		
			}




