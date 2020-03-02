package completedProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.List;
import java.awt.Panel;
import java.awt.Scrollbar;
import javax.swing.JLayeredPane;
import java.awt.Button;
import java.awt.Font;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.awt.Color;
 

public class Anamenu extends JFrame {
	private static Anamenu anamenu = new Anamenu();
	public static Anamenu getInstance() {
		return anamenu;
	}
	
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Anamenu frame = new Anamenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
			}
		});
	}

	/**
	 * Create the frame.
	 */
	private Anamenu() {
		 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 574);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		 
		JLabel lblNewLabel = new JLabel("SORU BANKASI \u0130\u015ELEMLER\u0130");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(173, 48, 269, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1-)");
		lblNewLabel_1.setBounds(61, 93, 33, 49);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2-)");
		lblNewLabel_2.setBounds(61, 192, 33, 36);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("SORULARI L\u0130STELEMEK-\u00C7IKARMAK VE D\u00DCZENLEMEK \u0130\u00C7\u0130N TIKLAYINIZ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SoruListelemePlatformu.getInstance().setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(127, 183, 423, 55);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("SINAV  \u0130\u015ELEMLER\u0130");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_3.setBounds(173, 251, 218, 33);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("1-)");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(61, 310, 33, 49);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_2 = new JButton("SINAV OLU\u015ETURMAK \u0130\u00C7\u0130N TIKLAYINIZ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SýnavOlusturma.getInstance().setVisible(true);
				
			}
		});
		btnNewButton_2.setBounds(127, 310, 427, 49);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_5 = new JButton("SORU EKLEMEK \u0130\u00C7\u0130N TIKLAYINIZ");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			BankaDersEkleme.getInstance().setVisible(true);
				
               
              
                
			}
		});
		btnNewButton_5.setBounds(127, 93, 423, 49);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_5 = new JLabel("Hakan \u00D6N\u0130ZE");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_5.setBounds(398, 390, 202, 33);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblEypEnsarAkpnar = new JLabel("Ey\u00FCp Ensar AKPINAR");
		lblEypEnsarAkpnar.setFont(new Font("Arial", Font.BOLD, 16));
		lblEypEnsarAkpnar.setBounds(398, 436, 202, 33);
		contentPane.add(lblEypEnsarAkpnar);
		
		JLabel lblMehmetCanKaragz = new JLabel("Mehmet Can KARAG\u00D6Z");
		lblMehmetCanKaragz.setFont(new Font("Arial", Font.BOLD, 16));
		lblMehmetCanKaragz.setBounds(398, 481, 202, 33);
		contentPane.add(lblMehmetCanKaragz);
		
	}
}