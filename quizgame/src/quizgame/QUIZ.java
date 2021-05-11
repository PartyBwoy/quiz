package quizgame;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import java.awt.Component;
import javax.swing.UIManager;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class QUIZ {

	 JFrame frame;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QUIZ window = new QUIZ();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public QUIZ() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
	//	frame.setIconImage(Toolkit.getDefaultToolkit().getImage(QUIZ.class.getResource("/icons/full/help.png")));
		frame.setBackground(Color.YELLOW);
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().setBackground(Color.ORANGE);		
	
		Image imgBP= new ImageIcon(this.getClass().getResource("/PLAY (2).png")).getImage();
		JButton play = new JButton(new ImageIcon(imgBP));
		play.setBounds(152, 377, 170, 75);
	//	play.setFont(new Font("Tw Cen MT", Font.BOLD, 17));
		//play.setForeground(Color.ORANGE);
	//	play.setBackground(Color.ORANGE);
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 Catges c= new Catges();
			 c.Categs.setVisible(true);
			 frame.dispose();
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(play);
		Image imgBM= new ImageIcon(this.getClass().getResource("/MENU (2).png")).getImage();

		JButton menu = new JButton(new ImageIcon(imgBM));
		menu.setBackground(Color.ORANGE);
		menu.setForeground(Color.ORANGE);
		menu.setBounds(152, 456, 170, 75);
		//	menu.setFont(new Font("Tw Cen MT", Font.BOLD, 17));
		//menu.setBackground(Color.black);
	//	menu.setForeground(Color.RED);
		menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu c= new Menu();
				 c.frameMenu.setVisible(true);
				 frame.dispose();
			}
		});
		frame.getContentPane().add(menu);
		
		JLabel lblNewLabel = new JLabel("");
		Image img= new ImageIcon(this.getClass().getResource("/Copy of Yellow Bulb Playful Pop of Color Education Logo (1).png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 576, 670);
		frame.getContentPane().add(lblNewLabel);
		
		
		frame.setBounds(0, 0, 500, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
