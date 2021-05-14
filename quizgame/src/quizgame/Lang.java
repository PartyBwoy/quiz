package quizgame;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lang {

	 JFrame frameLang;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lang window = new Lang();
					window.frameLang.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Lang() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameLang = new JFrame();
				frameLang.setResizable(false);

		frameLang.getContentPane().setBackground(Color.ORANGE);
		frameLang.getContentPane().setLayout(null);
		Image imgBl1= new ImageIcon(this.getClass().getResource("/fr.png")).getImage();

		JButton btnNewButton = new JButton(new ImageIcon(imgBl1));
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Catges c= new Catges();
				 
				 Thread playWave4=new AePlayWave("sounds/button-10.wav");
					
					
					playWave4.start();
				
				 c.Categs.setVisible(true);
				 frameLang.dispose();
			}
		});
		btnNewButton.setBounds(152, 456, 170, 75);
		frameLang.getContentPane().add(btnNewButton);
		Image imgBl2= new ImageIcon(this.getClass().getResource("/eng.png")).getImage();

		JButton btnEng = new JButton(new ImageIcon(imgBl2));

		btnEng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 CategsEng c= new CategsEng();
				 
				 Thread playWave4=new AePlayWave("sounds/button-10.wav");
					
					
					playWave4.start();
				
				 c.Categseng.setVisible(true);
				 frameLang.dispose();
			}
		});
		btnEng.setBounds(152, 377, 170, 75);
		frameLang.getContentPane().add(btnEng);
		frameLang.setBounds(0, 0, 500, 700);
		frameLang.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
