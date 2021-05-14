package quizgame;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {

	 JFrame frameMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frameMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameMenu = new JFrame();
		frameMenu.getContentPane().setBackground(Color.ORANGE);
		frameMenu.getContentPane().setLayout(null);
		Image imgBC= new ImageIcon(this.getClass().getResource("/catgs.png")).getImage();
		JButton categories = new JButton(new ImageIcon(imgBC));
	
		categories.setForeground(Color.RED);
		categories.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Catges c= new Catges();
				 
				 Thread playWave4=new AePlayWave("sounds/button-10.wav");
					
					
					playWave4.start();
				
					
				 c.Categs.setVisible(true);
				 frameMenu.dispose();

			}
		});
		categories.setBounds(150, 350, 170, 75);
		frameMenu.getContentPane().add(categories);
		
		Image imgBL= new ImageIcon(this.getClass().getResource("/lang.png")).getImage();
		JButton languages = new JButton(new ImageIcon(imgBL));
		languages.setForeground(Color.RED);
		languages.setBackground(Color.WHITE);
		languages.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Lang c= new Lang();
				 
				 Thread playWave4=new AePlayWave("sounds/button-10.wav");
					
					
					playWave4.start();
				
					
				 c.frameLang.setVisible(true);
				 frameMenu.dispose();
			}
			
		});
		languages.setBounds(150, 450, 170, 75);
		frameMenu.getContentPane().add(languages);
		
		Image imgBH= new ImageIcon(this.getClass().getResource("/help.png")).getImage();
		JButton help = new JButton(new ImageIcon(imgBH));
		
		
		help.setForeground(Color.RED);
		help.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Help h= new Help();
				 
				 Thread playWave4=new AePlayWave("sounds/button-10.wav");
					
					
					playWave4.start();
				
					
				 h.f.setVisible(true);
				 frameMenu.dispose();

			}
		});
		help.setBounds(150, 550, 170, 75);
		
		frameMenu.getContentPane().add(help);
		
		
		frameMenu.setBounds(0, 0, 500, 700);
		frameMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
